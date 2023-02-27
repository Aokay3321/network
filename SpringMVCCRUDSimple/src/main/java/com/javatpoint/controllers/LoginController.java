package com.javatpoint.controllers;   
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;   
import com.javatpoint.beans.Login;  
import com.javatpoint.dao.EmpDao;  
import java.util.Map;
@Controller
@RequestMapping(value = "/login")

public class LoginController {  
   // @Autowired  
    //EmpDao dao;//will inject dao from xml file  
      
    /*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
	@RequestMapping(method = RequestMethod.GET)
    public String LoginMap(Map<String, Object> model) {  
    	//m.addAttribute("command", new Emp());
		
		
			Login loginForm = new Login();		
			model.put("loginForm", loginForm);

    	return "Login"; 
    }  
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String processLogin(@ModelAttribute("loginForm") Login loginForm, 
			Map<String, Object> model) {
		
		// implement your own registration logic here...
		
		// for testing purpose:
		System.out.println("username: " + loginForm.getUsername());
		System.out.println("password: " + loginForm.getPassword());
		
    return "home";
	} 

}  