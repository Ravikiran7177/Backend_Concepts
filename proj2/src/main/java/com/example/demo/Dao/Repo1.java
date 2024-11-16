package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Pojo.FoodItems;

public interface Repo1 extends CrudRepository<FoodItems, Integer>{
	
	//FoodItems save(FoodItems fooditems);

	@Query(value="from FoodItems")
	public List<FoodItems> findAll();

	 List<FoodItems> findByName(String name);


}