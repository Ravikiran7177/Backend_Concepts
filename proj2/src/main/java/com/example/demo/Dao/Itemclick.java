package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.Pojo.ItemsClick;

public interface Itemclick extends CrudRepository<ItemsClick,Integer>{
	@Query(value="from ItemsClick")
	public List<ItemsClick> findAll();

}
