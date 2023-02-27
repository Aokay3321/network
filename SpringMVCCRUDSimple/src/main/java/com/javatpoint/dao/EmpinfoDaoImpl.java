package com.javatpoint.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.javatpoint.beans.Emp;
import com.javatpoint.beans.Empinfo;
import com.javatpoint.beans.Revoke; 

public class EmpinfoDaoImpl {

	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	public int saveEmpinfoDetails(Empinfo empinfo){  
	    String sql="insert into empInfo(firstname,employeeid,middlename,designation,lastname) values('"+empinfo.getFirstname()+"','"+empinfo.getEmployeeid()+"','"+empinfo.getMiddlename()+"','"+empinfo.getDesignation()+"','"+empinfo.getLastname()+"')";  
	    return template.update(sql);  
	} 
	
}