<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <style>
      /* Style for the side navigation bar */
      .sidenav {
        height: 100%;
        width: 200px;
        position: fixed;
        z-index: 1;
        top: 120px;
        left: 0;
        background-color: #cae7ff;
        overflow-x: hidden;
        border: 1px solid gray;
      }
      
      /* Style for the navigation links */
      .sidenav a {
        padding: 8px 8px 8px 32px;
        text-decoration: none;
        font-size: 25px;
        color: #818181;
        display: block;
        transition: 0.3s;
        border-bottom: 1px solid black;
      }
      
      /* Style for the navigation links on hover */
      .sidenav a:hover {
        color: #000;
      }
      
      /* Style for the web page name division */
      .top {
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        background-color: #4267b1;
        color: white;
        padding: 18px;
        text-align: center;
        font-size: 20px;

      }
      /* Style for the Home page content div*/
      .HomeContent{
      	margin-top: 150px;
      	
      	text-color: black;
      	width: 100%;
      	height: 100px;
      	text-align: center;
      }
      .HomeContent h1{
      	background-color: #cae7ff;
      	border: 1px solid gray;
      }
      
       /* Style for the data table */
      table {
        width: 80%;
        border-collapse: collapse;
        margin-left: 250px;
      }
      th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
      }
      th {
        background-color: #f2f2f2;
      }

      /* Style for the submit buttons */
      .submit-buttons {
        
        justify-content: space-between;
        margin-top: 40px;
        padding: 10px;
      }
      
      .submit-buttons input[type="submit"] {
        width: 25%;
        padding: 5px;
        font-size: 20px;
      }
      
      .submit-buttons input:hover {
        background-color: #cae7ff;
      }
    </style>
  </head>
  <body>
    <!-- Web page name division -->
    
    <div class="top">
      <h2>Network Service Center</h2>
    </div>
    
  
    <!-- Side navigation bar -->
    <div class="sidenav">
      <a href="home.jsp">Home</a>
      <a href="password">Change Password</a>
      <a href="revoke">Revoke Digital Signature</a>
      <a href="empinfo">Change Profile</a>
      <a href="LogServiceProblem">Log Service Problem</a>
    </div>
	<form:form action="empinfo" method="post" modelAttribute="empinfoForm" >
		
	  <div class="HomeContent">
    	<h1>Employee information</h1>
    	
    	<br><br>
      <table>
        <tr>
          <th>First name</th>
          <td><form:input path="firstname"/></td>
        </tr>
        <tr>
          <th>Employee Id</th>
          <td><form:input path="employeeid"/></td>
        </tr>
        <tr>
          <th>Middle Name</th>
          <td><form:input path="middlename"/></td>
        </tr>
        <tr>
          <th>Designation</th>
          <td><form:input path="designation"/></td>
        </tr>
        <tr>
          <th>Last Name</th>
          <td><form:input path="lastname"/></td>
        </tr>
      </table>
      <div class="submit-buttons">
        <input type="submit" value="Update">
         &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        <input type="submit" value="Cancel">
        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        <input type="submit" value="Reset">
      </div>  
    </div>
    </form:form>
	
  </body>
</html>