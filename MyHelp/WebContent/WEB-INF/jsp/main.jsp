<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h2> Welcome to Help Information Management System <br></h2>
     <h5> Frameworks used: Spring MVC, Hibernate, Spring </h5>
      <h5>Database: Oracle </h5>
     <h5> Programming Language: Java EE </h5>
     <h5> Core Operations: CRUD (Create, Retrieve, Update, Delete)</h5><h5>Programmer: Bobo Liu</h5>

      
     <h2>Please make choices here: </h2>
     
 <table>
 <tr><td>    
  <form action="add_ticket.test" method="post"> <input  type="submit"  value="add ticket"/></form>
 </td><td>
  <form action="show_ticket.test" method="post"> <input  type="submit"  value="show ticket"/></form> 
 </td><td>
  <form action="delete_ticket.test" method="post"> <input  type="submit"  value="delete ticket"/></form>
</td><td>
 <form action="update_ticket.test" method="post"> <input  type="submit"  value="update ticket"/></form>
 
 </table>
 </body>
</html>
