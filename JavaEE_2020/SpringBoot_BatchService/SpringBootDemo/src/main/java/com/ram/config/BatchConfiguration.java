package com.ram.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.ram.batch.EmployeeItemProcessor;
import com.ram.batch.JobCompletionNotificationListener;
import com.ram.model.Employee;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration
{
	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	private DataSource dataSource;

	/**
	 * The reader() method is used to read the data from the CSV file
	 */
	@Bean
	public FlatFileItemReader<Employee> reader()
	{
		System.out.println("-----------Inside reader() method--------");
		FlatFileItemReader<Employee> reader = new FlatFileItemReader<Employee>();
		reader.setResource(new ClassPathResource("employee.csv"));
		reader.setLineMapper(new DefaultLineMapper<Employee>()
		{
			{
				setLineTokenizer(new DelimitedLineTokenizer()
				{
					{
						setNames(new String[] { "name", "age", "salary" });
					}
				});
				setFieldSetMapper(new BeanWrapperFieldSetMapper<Employee>()
				{
					{
						setTargetType(Employee.class);
					}
				});
			}
		});
		return reader;
	}

	/**
	 * Intermediate processor to do the operations after the reading the data from the CSV file and
	 * before writing the data into SQL.
	 */
	@Bean
	public EmployeeItemProcessor processor()
	{
		System.out.println("-----------Inside  processor() method--------");
		return new EmployeeItemProcessor();
	}

	/**
	 * The writer() method is used to write a data into the SQL.
	 */
	@Bean
	public JdbcBatchItemWriter<Employee> writer()
	{
		System.out.println("-----------Inside writer() method--------");
		JdbcBatchItemWriter<Employee> writer = new JdbcBatchItemWriter<Employee>();
		writer.setItemSqlParameterSourceProvider(
				new BeanPropertyItemSqlParameterSourceProvider<Employee>());
		writer.setSql("INSERT INTO Employee (NAME, AGE, SALARY) VALUES (:name, :age, :salary)");
		writer.setDataSource(dataSource);
		return writer;
	}

	@Bean
	public Job importEmployeeJob(JobCompletionNotificationListener listener)
	{
		return jobBuilderFactory.get("importEmployeeJob").incrementer(new RunIdIncrementer())
				.listener(listener).flow(step1()).end().build();
	}

	@Bean
	public Step step1()
	{
		return stepBuilderFactory.get("step1").<Employee, Employee>chunk(4).reader(reader())
				.processor(processor()).writer(writer()).build();
	}
}