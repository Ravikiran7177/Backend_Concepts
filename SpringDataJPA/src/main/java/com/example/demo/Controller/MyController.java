package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pojo.Student1;
import com.example.demo.Repository.Repo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MyController {
	
	@Autowired
	Repo repo;
	
	@PostMapping("/")
	public Student1 postMethodName(@RequestBody Student1 student1) {	
		return repo.save(student1);
	}
	
	@GetMapping("/")
	public List<Student1> print(){
		return (List<Student1>) repo.findAll();
	}
	
	@DeleteMapping("/{roll}")
	 public String delete(@PathVariable int roll ) {
	   repo.deleteById(roll);
	   return "successful deleted";
	 }
	
	 @PutMapping("/{roll}") 
	 public Student1 upsert(@PathVariable int roll, @RequestBody Student1 student1  ) 
	 {  
	  return repo.save(student1); 
	} 
	
}
