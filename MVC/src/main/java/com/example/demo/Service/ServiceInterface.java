package com.example.demo.Service;

import java.util.List;

import com.example.demo.Pojo.Student21;

public interface ServiceInterface {

	public Student21 insert(Student21 student21);
	
	public Student21 findBySection(String Section);
	
	public List<Student21> findById(int Id);
	
	public List<Student21> findAll();
	
	public List<Student21> findAll1();

	public List<Student21> SortRecords();

	public List<Student21> pagination();
}
