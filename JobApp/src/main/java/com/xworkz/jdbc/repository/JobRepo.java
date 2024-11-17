package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.JobDto;

public interface JobRepo {
	boolean save(JobDto dto);

}
