package com.Mobile.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Mobile.Declare;
import com.Mobile.Exception.CustomException;
import com.Mobile.Service.MobileService;

@RestController
@RequestMapping(value = "/Phone")
public class MobileController {

	@Autowired
	MobileService ms;

	@PostMapping(value = "/postAll")
	public String PostPost(@RequestBody List<Declare> d) {
		return ms.PostPost(d);
	}

	@GetMapping(value = "/getDisc")
	public List<Integer> Dicount() {
		return ms.Dicount();
	}

	@GetMapping(value = "/getAll")
	public List<Declare> getAll() {
		return ms.getAll();
	}

//	@GetMapping(value="/getAll2")
//  public Map<Integer,String> getAll2()
//  {
//		return ms.getAll2();
//  }

	@GetMapping(value = "/getPrice")
	public List<Declare> getprice(@RequestParam int a, int b) {
		return ms.getPrice(a, b);
	}
	
	@GetMapping(value="/getalll")
	public List<Declare> getAl()
	{
		return ms.getAl();
	}
	
	@GetMapping(value ="/getStart/{a}")
     public Declare getStart(@PathVariable String a)
{
		return ms.getStart(a);
		}
	
	@GetMapping(value="/getFind/{a}")
	public List<Declare> getFind(@PathVariable int a)
	{
		return ms.getFind(a);
	}
	
	@PostMapping(value="/priceInsert")
public String postPrice(@RequestBody Declare a) throws CustomException
{
		return ms.postPrice(a);
}
	
	@GetMapping(value ="/GetOne/{a}")
	public Declare getOne(@PathVariable int a) throws CustomException
	{
		return ms.getOne(a);
	}
	
	@GetMapping(value ="/GetBrand/{a}")
	public Declare getOne(@PathVariable String a) throws CustomException
	{
		return ms.getbrand(a);
	}
	
	@GetMapping(value ="/GetColor/{a}")
	public Declare getOne(@PathVariable char a) throws CustomException
	{
		return ms.getcolor(a);
	}
}
