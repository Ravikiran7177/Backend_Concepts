package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Pojo.Student21;

public interface Repo extends JpaRepository<Student21,Integer>{
	
	//findBy
	public Student21 findBySection(String Section);
	
	public List<Student21> findById(int Id);
	
	//custom
	@Query(value="from Student21")
	public List<Student21> findAll();
	
	@Query(value="from Student21")
	public List<Student21> findAll(Sort sort);
	
}
