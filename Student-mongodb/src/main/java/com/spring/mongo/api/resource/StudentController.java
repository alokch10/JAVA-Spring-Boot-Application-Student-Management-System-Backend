package com.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.api.model.Student;
import com.spring.mongo.api.repository.BookRepository;

@RestController
public class StudentController {
	@Autowired
	private BookRepository repository; 
	@PostMapping("/addStudent")
	public String addstudent(@RequestBody Student student) {
		
		repository.save(student);
		return "added student with id : "+student.getId();
	}
	@GetMapping("/findAllStudent")
	public List<Student> getStudents(){
		return repository.findAll();
	}
	@GetMapping("/findAllStudent/{id}")
	public Optional<Student> getStudent(@PathVariable int id){
		return repository.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		repository.deleteById(id);
		return "student info delete by id : "+id;
	
	}
	
}
