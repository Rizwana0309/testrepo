package com.springboot.test.proj.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.proj.entities.familydfbirth;
import com.springboot.test.proj.services.birthservice;


@RestController
public class controller
{
	
	@Autowired
	private birthservice Birthservice;
	
	
     @GetMapping("/myself") 
	public String myself()
	{
		return "my name is Rizwana";
	}
	
     @GetMapping("/dateofbirth")
     public List<familydfbirth>getdateofbirth()
     {
    	 return this.Birthservice.getdateofbirth();
    	 
     }
	
     @GetMapping("/datebirth /{coursrID}")
     public familydfbirth getfamilydfbirth(@PathVariable String courseID)
     {
		return this.Birthservice.getfamilydfbirth(Long.parseLong(courseID));
    	 
     }
     
     @PostMapping("/birth")
     public familydfbirth addfamilydfbirth(@RequestBody familydfbirth course)
     {
    	 return this.Birthservice.addfamilydfbirth(course);
     }
}
