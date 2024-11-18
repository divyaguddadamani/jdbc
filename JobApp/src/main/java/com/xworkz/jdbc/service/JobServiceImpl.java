package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.JobDto;
import com.xworkz.jdbc.repository.JobRepo;
import com.xworkz.jdbc.repository.JobRepoImpl;

public class JobServiceImpl implements JobService {

	@Override
	public boolean save(JobDto dto) {
		
		boolean isValid=true;
		System.out.println("name:"+dto.getName());
		System.out.println("age:" +dto.getAge());
		System.out.println("phone:"+dto.getPhone());
		System.out.println("address:"+dto.getAddress());
		System.out.println("email:"+dto.getEmail());
		
		if(isValid) {
		JobRepoImpl repo= new JobRepoImpl();
		boolean ref=repo.save(dto);
		System.out.println(ref);
		}
		
		
			return isValid;
		
		
	}

}
