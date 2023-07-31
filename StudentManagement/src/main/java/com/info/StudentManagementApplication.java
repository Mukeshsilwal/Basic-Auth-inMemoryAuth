package com.info;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.info.entity.Student;
import com.info.repository.StudentRepository;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentManagementApplication{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}


	@Bean
	public ModelMapper modelMapper(){

		return new ModelMapper();
	}


}
