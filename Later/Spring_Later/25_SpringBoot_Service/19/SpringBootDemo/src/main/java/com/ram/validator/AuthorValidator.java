package com.ram.validator;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AuthorValidator implements ConstraintValidator<Author, String>
{
	List<String> authors = Arrays.asList("Peter", "John", "Dave", "Ram");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context)
	{
		return authors.contains(value);
	}
}
