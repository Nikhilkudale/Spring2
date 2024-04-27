package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aliencontroller {
	
	Springrepository sp;
	@Autowired
	public Aliencontroller(Springrepository sp) {
		this.sp = sp;
	}
//	@GetMapping("/insert")
//	public String insert()
//	{
//		Alien a=new Alien();
//		a.setAid(4);
//		a.setAcolor("white");
//		a.setAname("Kattapa");
//		
//		sp.save(a);
//		return "Student Stored Succesfully";
//		
//	}
	@PostMapping("/index")
	public Alien Save(@RequestBody Alien ep)
	{
		return sp.save(ep);
	}
	
	

}
