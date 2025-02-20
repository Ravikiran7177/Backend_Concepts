package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pojo.Student21;
import com.example.demo.Service.ServiceInterface;




@RestController
public class MyController {
	@Autowired
	private ServiceInterface service;
	
	@PostMapping("/path")
	public Student21 postMethodName(@RequestBody Student21 student21) {
		return service.insert(student21);
	}
	
	@GetMapping("/{Section}")
	public Student21 findBySection(@PathVariable String Section) {
		return service.findBySection(Section);
	}
	
	@GetMapping("/id/{Id}")
	public List<Student21> findById(@PathVariable int Id) {
		return service.findById(Id);
	}
	
	@GetMapping("/")
	public List<Student21> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/sort")
	public List<Student21> sort() {
		return service.SortRecords();
	}
	
	@GetMapping("/m/pagination")
	public List<Student21> pagination() {
		return service.pagination();
	}
	
}
