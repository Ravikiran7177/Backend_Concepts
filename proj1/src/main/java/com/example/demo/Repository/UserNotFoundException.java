package com.example.demo.Repository;

public class UserNotFoundException extends RuntimeException 
{
	UserNotFoundException(String message)
	{
		super(message);
	}
}
