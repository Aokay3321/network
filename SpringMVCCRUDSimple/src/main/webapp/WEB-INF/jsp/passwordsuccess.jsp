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
      	margin-top: 200px;
      	margin-left: 300px;
      	text-color: black;
      	width: 400px;
      	height: 100px;
      	text-align: center;
      }
      .HomeContent2{
      	margin-top: 20px;
      	margin-left: 300px;
      	text-color: black;
      	width: 1000px;
      	height: 100%;
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
	
	  <div class="HomeContent">
    	<h1>Password Reset Successfully</h1>
    	<p>Welcome to the Network Service Center.</p>
    </div>
	
	
    <div class="HomeContent2">
    	<h3>Password Reset Successfully</h3>
    	<p>
    		Lorem Ipsum is simply dummy text of the printing and typesetting industry.
    		Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
    		when an unknown printer 
    		took a galley of type and scrambled it to make a type specimen book. It has 
    		survived not only five centuries, 
    		but also the leap into electronic typesetting, remaining essentially unchanged. 
    		It was popularised in the 1960s 
    		with the release of Letraset sheets containing Lorem Ipsum 
    		passages, and more recently with desktop publishing software 
    		like Aldus PageMaker including versions of Lorem Ipsum.
    	</p>
    </div>
  </body>
</html>