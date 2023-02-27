package com.javatpoint.controllers;   
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;   
import com.javatpoint.beans.Password;
import com.javatpoint.dao.PasswordDaoImpl;
import java.util.Map;
@Controller
@RequestMapping(value = "/password")

public class PasswordController {  
    @Autowired  
    PasswordDaoImpl passwordDao;//will inject dao from xml file  
      
    /*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
	@RequestMapping(method = RequestMethod.GET)
    public String LoginMap(Map<String, Object> model) {  
    	//m.addAttribute("command", new Emp());
		
		
			Password passwordForm = new Password();		
			model.put("passwordForm", passwordForm);

    	return "password"; 
    }  
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String processPassword(@ModelAttribute("passwordForm") Password passwordForm, 
			Map<String, Object> model) {
		
		// implement your own registration logic here...
		
		// for testing purpose:
		System.out.println("Old Password: " + passwordForm.getOldpw());
		System.out.println("New Password: " + passwordForm.getNewpw());
		System.out.println("Confirm Password: " + passwordForm.getCnfpw());
		
		int flag= passwordDao.savePasswordDetails(passwordForm);
		if(flag>0)
			return "passwordsuccess";
		else	
      return "password";
	} 

}  