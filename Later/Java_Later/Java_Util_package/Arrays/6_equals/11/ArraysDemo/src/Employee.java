
public class Employee
{
	private int id;
	private String name;

	public Employee(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean equals(Object obj)
	{
		// type casting obj to Employee
		Employee employee = (Employee) obj;
		return (this.id == employee.id && this.name.equals(employee.name));
	}

}
