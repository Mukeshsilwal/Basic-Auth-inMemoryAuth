package com.info.service;

import java.util.List;

import com.info.payloads.StudentDto;

public interface StudentService {
	List<StudentDto> getAllStudents();
	StudentDto saveStudent(StudentDto studentDto);
	StudentDto getStudentById(int id);
	StudentDto updateStudent(StudentDto student);
	void deleteById(int id);
}
