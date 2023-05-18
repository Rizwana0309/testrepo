package com.springboot.test.proj.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.test.proj.entities.familydfbirth;

@Service
public class birthserviceimpl implements birthservice
{
	List<familydfbirth>list;
	
	
	public birthserviceimpl()
    {	
		list = new ArrayList<>();
		
		list.add(new familydfbirth(03,"september",2002,456));
		list.add(new familydfbirth(04,"september",1998,345));
		list.add(new familydfbirth(04,"february",1991,876));
		list.add(new familydfbirth(15,"september",2004,234));
		
	}
	
	@Override
	public List<familydfbirth> getdateofbirth()
	{
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public familydfbirth getfamilydfbirth(long courseID) 
	{
		familydfbirth B = null;
		for(familydfbirth familybirth:list)
		{
			if(familybirth.getID() == courseID)
			{
				B = familybirth;
				break;
			}
		}
		return B;
	}

	@Override
	public familydfbirth addfamilydfbirth(familydfbirth course) 
	{
		list.add(course);
		return course;
	}

	
}
