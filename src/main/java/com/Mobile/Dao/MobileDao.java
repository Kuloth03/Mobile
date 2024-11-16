package com.Mobile.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Mobile.Declare;
import com.Mobile.MobileRepository;

@Repository
public class MobileDao {
	@Autowired
	MobileRepository mr;

	public String Post(List<Declare> e)
	{
		mr.saveAll(e);
		return "Success";
	}
	
	public List<Declare> getAll()
	{
		return mr.findAll();
	}
	
	
	public String update(Declare e)
	{
		 mr.save(e);
		 return "Success";
	}
	
	public List<Declare> getAll1()
	{
		return mr.getAll1();
	}

	public List<Declare> getPrice(int a, int b) {
		return mr.getPrice(a, b);
	}

	public List<Declare> getAl() {
		
		return mr.getAl();
	}

	public Declare getStart(String a) {
		
		return mr.getStart(a);
	}

	public List<Declare> getFind(int a) {
		
		return mr.getFind(a);
	}

	public String PostPrice(Declare a) {
		
		 mr.save(a);
		 return "Success";
	}


	
//	public Map<Integer,String> getAll2()
//	{
//		return mr.getAll2();
//	}
//	
	
	public Declare getOne(int a)
	{
		return mr.getOne(a);
	}

	public Declare getbrand(String a) {
		
		return mr.getbrand(a);
	}

	public Declare getcolor(char a)
	{
		return mr.getcolor(a);
	}
	
	
}
