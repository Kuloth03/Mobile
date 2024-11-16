package com.Mobile.Service;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mobile.Declare;
import com.Mobile.Dao.MobileDao;
import com.Mobile.Exception.CustomException;
@Service
public class MobileService {

	@Autowired
	MobileDao md;
	
	public String Post(List<Declare>d)
	{
		return md.Post(d);
	}
	
	
	public List<Integer> Dicount()
	{
		
		List<Declare> dis =md.getAll();
		return 	dis.stream().map(x->x.getPrice()-x.getPrice()*x.getRating()/100).collect(Collectors.toList());
		
		
	}
	
	public String Update(Declare e)
	{
		return md.update(e);
	}
	
	public List<Declare> getAll()
	{
		return md.getAll1();
	}


	public List<Declare> getPrice(int a, int b) {	
		return md.getPrice(a,b);
	}


	public List<Declare> getAl() {
		
		return md.getAl();
	}


	public Declare getStart(String a) {
		
		return md.getStart(a);
	}


	public List<Declare> getFind(int a) {
		
		return md.getFind(a);
	}

	
	
	
	
	
	
	
	
	
	
	
	

	public String postPrice(Declare a) throws CustomException  {
//		try
//		{
//		if(a.getPrice()>25000)
//		{
//			return md.PostPrice(a);
//			
//		}
//		else
//		{
//			throw new CustomException("price was below");
//		}
//		}
//		catch(Exception e)
//		{
//		return ""+e;
//	     }
		if(a.getPrice()>25000)
			{
				return md.PostPrice(a);
				
			}
		else
			{
				throw new CustomException("price was below");
			}
		
		
		
		}
	
	public Declare getOne(int a) throws CustomException
	{
		
		List<Declare> val =md.getAll1();
		
		Declare get =val.get(0);
		for(int i=0;i<val.size();i++)
		{
			if(val.get(i).getPrice()==a)
			{
				get=val.get(i);
			}
		}
		if(get.getPrice()==a)
			
		{
			return md.getOne(a);
		}
			else
			{
				throw new CustomException("invalid");
			}
		}
	
	
	public Declare getbrand(String a) throws CustomException
	{
		List<Declare> val1 =md.getAll1();
		Declare get1 =val1.get(0);
		for(int j=0;j<val1.size();j++)
		{
			if(val1.get(j).getBrand().equals(a))
			{
				get1=val1.get(j);
			}
		}
		if(get1.getBrand().equals(a))
		{
			return md.getbrand(a);
		}
		else
		{
			throw new CustomException("Error");
		}
	}
	
	
	
	
	
	public Declare getcolor(char a ) throws CustomException
	{
		List<Declare> val2 =md.getAll1();
		Declare get2 =val2.get(0);
		for(int k=0;k<val2.size();k++)
		{
			if(val2.get(k).getColor().charAt(0)==a)
			{
				get2 = val2.get(k);
			}
		}
		if(get2.getColor().charAt(0) == a)
		{
			return md.getcolor(a);
		}
		else
		{
			throw new CustomException("Error");
		}
		
	}
	
	
	
	
	

	}
	
	
	


	
//	public Map<Integer,String> getAll2()
//	{
//		return md.getAll2();
//	}
	

