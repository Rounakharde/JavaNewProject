package com.rk.Student_Mangament.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.Student_Mangament.Service.StudentServices;
import com.rk.Student_Mangament.entiyt.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentServices studentServices;
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/students")
	public String getAllstudents(Model model)
	{
		model.addAttribute("students", studentServices.getAllStudents());
		return "students";
		
		
	}
	
	@GetMapping("students/new")
	public String createStudentFrom(Model model)
	{
		Student student=new Student();
		model.addAttribute("student",student);
		return "new_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute ("student") Student student)
	{
		studentServices.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable int id,Model model)
	{
		model.addAttribute("student",studentServices.getById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/edit/{id}")
	public String updateStudent(@PathVariable int id,@ModelAttribute ("student") Student student)
	{
		Student existingStudent=studentServices.getById(id);
		existingStudent.setFristname(student.getFristname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setCity(student.getCity());
		studentServices.saveStudent(existingStudent);
		return "redirect:/students";
	}
	
	@GetMapping("/students/{id}")
	public String deleteByid(@PathVariable int id)
	{
		studentServices.deleteById(id);
		
		return "redirect:/students";
	}

}
