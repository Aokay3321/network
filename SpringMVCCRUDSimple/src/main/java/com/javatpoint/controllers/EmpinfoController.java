package com.javatpoint.controllers;   
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.javatpoint.beans.Empinfo;
import com.javatpoint.dao.EmpinfoDaoImpl;

//import com.javatpoint.beans.Password;
//import com.javatpoint.dao.PasswordDaoImpl;
import java.util.Map;
@Controller
@RequestMapping(value = "/empinfo")

public class EmpinfoController {  
    @Autowired  
    EmpinfoDaoImpl empinfoDao;//will inject dao from xml file  
      
    /*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
	@RequestMapping(method = RequestMethod.GET)
    public String LoginMap(Map<String, Object> model) {  
    	//m.addAttribute("command", new Emp());
		
		
			Empinfo empinfoForm = new Empinfo();		
			model.put("empinfoForm", empinfoForm);

    	return "empInfo"; 
    }  
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String processEmpinfo(@ModelAttribute("empinfoForm") Empinfo empinfoForm, 
			Map<String, Object> model) {
		
		// implement your own registration logic here...
		
		// for testing purpose:
		System.out.println("first name: " + empinfoForm.getFirstname());
		System.out.println("employee id: " + empinfoForm.getEmployeeid());
		System.out.println("middle name: " + empinfoForm.getMiddlename());
		System.out.println("designation: " + empinfoForm.getDesignation());
		System.out.println("last namee: " + empinfoForm.getLastname());
		
		int flag= empinfoDao.saveEmpinfoDetails(empinfoForm);
		if(flag>0)
			return "empinfosuccess";
		else	
      return "empinfo";
	} 

}  