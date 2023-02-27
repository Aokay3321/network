package com.javatpoint.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;
import com.javatpoint.beans.LogServiceProblem;
import com.javatpoint.beans.Emp;
import com.javatpoint.beans.Revoke; 

public class LogServiceProblemDaoImpl {

	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	public int saveLogServiceProblemDetails(LogServiceProblem LogServiceProblem){  
	    String sql="insert into logserviceproblem(name,organization,designation,logserviceproblem,description) values('"+LogServiceProblem.getName()+"','"+LogServiceProblem.getOrganization()+"','"+LogServiceProblem.getDesignation()+"','"+LogServiceProblem.getLogserviceproblem()+"','"+LogServiceProblem.getDescription()+"')";  
	    return template.update(sql);  
	} 
	
}
