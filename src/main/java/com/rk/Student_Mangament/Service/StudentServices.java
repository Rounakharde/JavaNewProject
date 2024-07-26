package com.rk.Student_Mangament.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.Student_Mangament.Repository.StudentRepository;
import com.rk.Student_Mangament.entiyt.Student;

@Service
public class StudentServices  implements StudentServicesimp{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getById(int id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		
		studentRepository.deleteById(id);
		
	}

	
	
	

}
