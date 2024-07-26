package com.rk.Student_Mangament.Service;

import java.util.List;

import com.rk.Student_Mangament.entiyt.Student;

public interface StudentServicesimp {
	
	public List<Student> getAllStudents();
	public Student saveStudent(Student student);
	public Student getById(int id);
	
	public void deleteById(int id);
	

}
