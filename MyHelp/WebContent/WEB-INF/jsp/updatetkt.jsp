<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>update ticket</title>
    
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
   update ticket here <br>
    
    <form action="updatesuccess.test" method="post">
    <table>
    <tr><td> Ticket Id:</td><td><input name="ticket_id" /></td></tr>
    <tr><td> Ticket Creator Name:</td><td> <input name="ticket_creator_name"/> </td></tr>
    <tr><td> Ticket Title:</td><td> <input name="ticket_title"/></td></tr>
    <tr><td> Ticket Problem Description:</td><td> <input name="ticket_problem_description"/> </td></tr>
    <tr><td> Ticket Status:</td><td> <select name="ticket_status">     
      <option  value="1">open</option>
      <option  value="2">in progress</option>
      <option  value="3">close</option>
      <option  value="4">rejected</option>
      <option  value="5">revoked</option>
     </select></td></tr>
     
    <tr><td> Ticket Create Date:</td><td> <input name="ticket_create_date" /></td></tr>
    <tr><td> Ticket Priority:</td><td> <select name="ticket_priority"> 
      <option  value="1">low</option>
      <option  value="2">mid-low</option>
      <option  value="3">mid</option>
      <option  value="4">mid-high</option>
      <option  value="5">high</option>
     </select></td></tr>
       
    <tr><td> <input  type="submit"  value="update"/>
    </td><td>
   
    </td></tr>
    </table>
    </form>
   <form action="main.test" method="post"> <input  type="submit"  value="main"/></form>
  </body>
</html>
