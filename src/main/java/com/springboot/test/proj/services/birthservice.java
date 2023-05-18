package com.springboot.test.proj.services;

import java.util.List;

import com.springboot.test.proj.entities.familydfbirth;

public interface birthservice 
{
	public List<familydfbirth>getdateofbirth();

	
	public familydfbirth getfamilydfbirth(long parseLong);


	public familydfbirth addfamilydfbirth(familydfbirth course);


	
}
