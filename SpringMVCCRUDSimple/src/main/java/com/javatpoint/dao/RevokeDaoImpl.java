package com.javatpoint.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.javatpoint.beans.Emp;
import com.javatpoint.beans.Revoke; 

public class RevokeDaoImpl {

	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	public int saveRevokeDetails(Revoke revoke){  
	    String sql="insert into revokeDigitalSignature(name,organization,designation,reason,description) values('"+revoke.getName()+"','"+revoke.getOrganization()+"','"+revoke.getDesignation()+"','"+revoke.getReason()+"','"+revoke.getDescription()+"')";  
	    return template.update(sql);  
	} 
	
}
