package com.alpha.studentSys.service;

import java.util.List;

import com.alpha.studentSys.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}
