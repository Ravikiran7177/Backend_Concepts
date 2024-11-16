package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Repo;
import com.example.demo.Pojo.Student21;

@Service
public class ServiceImpl implements ServiceInterface{
	@Autowired
	private Repo repo;
	
	//predefined
	@Override
	public Student21 insert(Student21 student21) {
		return repo.save(student21);
	}

	//findBy
	@Override
	public Student21 findBySection(String Section) {
		return repo.findBySection(Section);
	}

	@Override
	public List<Student21> findById(int Id) {
		return repo.findById(Id);
	}

	//custom
	@Override
	public List<Student21> findAll() {
		return repo.findAll();
	}

	@Override
	public List<Student21> findAll1() {		
		return repo.findAll(Sort.by("roll"));
	}

	@Override
	public List<Student21> SortRecords() {
		return repo.findAll(Sort.by("roll").descending());
	}

	@Override
	public List<Student21> pagination() {
		PageRequest pagerequest=PageRequest.of(0, 2);
		Page<Student21> page=repo.findAll(pagerequest);
		return page.getContent();
	}
	

}
