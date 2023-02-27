package com.javatpoint.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.javatpoint.beans.Password;
import com.javatpoint.beans.Revoke;

public class PasswordDaoImpl {

	
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int savePasswordDetails(Password password){  
	    String sql="insert into password(oldpassword,newpassword,cnfpassword) values('"+password.getOldpw()+"','"+password.getNewpw()+"','"+password.getCnfpw()+"')";  
	    return template.update(sql);  
	} 
}
