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
import com.javatpoint.dao.RevokeDaoImpl;

import java.util.Map;
import com.javatpoint.beans.Revoke;
@Controller
@RequestMapping(value = "/revoke")

public class RevokeController {  
    @Autowired  
    RevokeDaoImpl revokeDao;//will inject dao from xml file  
      
    /*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
	@RequestMapping(method = RequestMethod.GET)
    public String LoginMap(Map<String, Object> model) {  
    	//m.addAttribute("command", new Emp());
		
		
			Revoke revokeForm = new Revoke();		
			model.put("revokeForm", revokeForm);

    	return "revoke"; 
    }  
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String processRevoke(@ModelAttribute("revokeForm") Revoke revokeForm, 
			Map<String, Object> model) {
		
		// implement your own registration logic here...
		
		// for testing purpose:
		System.out.println("username: " + revokeForm.getName());
		System.out.println("password: " + revokeForm.getOrganization());
		
		int flag= revokeDao.saveRevokeDetails(revokeForm);
		if(flag>0)
			return "revokesuccess";
		else	
      return "revoke";
	} 

}  