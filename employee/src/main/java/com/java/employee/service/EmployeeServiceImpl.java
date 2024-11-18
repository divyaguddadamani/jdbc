package com.java.employee.service;

import com.java.employee.dto.EmployeDto;
import com.java.employee.repository.EmployeRepoImpl;


public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public boolean result(EmployeDto dto) {
		
		boolean valid=true;
		
		int id=dto.getId();
		String name=dto.getName();
		long number=dto.getPhone();
		String email=dto.getEmail();
		int age=dto.getAge();
		int sal=dto.getSal();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(number);
		System.out.println(email);
		System.out.println(age);
		System.out.println(sal);
		
		if(dto!=null)
		{
			if(name!=null && name.length()>6 && name.length()<14) {
				System.out.println("name is valid");
			}
			else if(name==null && name.length()<6 && name.length()>14)
			{
				System.out.println("name is in valid");
			}
			
			  if (number >= 9000000000L && number <= 9999999999L) {
		            System.out.println("Phone number is valid");
		        } 
			  else if (number <= 9000000000L && number >= 9999999999L) {
		            valid = false;
		            System.out.println("Phone number is invalid");
		        }
			  
			  if(age!=0&& age>5)
			  {
				  System.out.println("age is valid");
			  }
			  else if(age==0&& age<5)
			  {
				  System.out.println("age is not valid");
			  }
			  
			  if (email != null 
				        && email.contains("@") 
				        && email.contains("gmail.com") 
				        && Character.isUpperCase(email.charAt(0)) 
				        && email.indexOf('@') == 7) {
				    System.out.println("Email is valid");
				} else {
				    valid = false;
				    System.out.println("Email is invalid");
				}

			  
			  }
		
		if(valid)
		{
			EmployeRepoImpl repo=new EmployeRepoImpl();
			boolean ref=repo.save(dto);
			System.out.println(ref);
		}
		
		return valid;
	}

	
	

}
