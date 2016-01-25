<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>show ticket</title>
    
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
     <form action="showticketlist.test" method="post"> <input  type="submit"  value="show ticket"/></form>
     
    <form action="addticketSucc.test" method="post">
  
      <table border = "1" cellpadding="1" style="background-color: #ffffcc;">
  

      <tr><td>ticket_id</td><td>ticket_creator_name</td><td>ticket_title</td><td>ticket_problem_description</td><td>ticket_status</td><td>ticket_create_date</td><td>ticket_priority</td></tr>

  

  <c:forEach  items="${ticketlist}"  var="ticketvar">
      <tr><td>${ticketvar.ticket_id}</td><td>${ticketvar.ticket_creator_name}</td>
      <td>${ticketvar.ticket_title}</td><td>${ticketvar.ticket_problem_description}</td>
      <td>      
      <c:choose>
      <c:when test="${ (ticketvar.ticket_status=='1')}">open</c:when>
      <c:when test="${ (ticketvar.ticket_status=='2')}">in progress</c:when>
      <c:when test="${ (ticketvar.ticket_status=='3')}">closed</c:when>
      <c:when test="${ (ticketvar.ticket_status=='4')}">rejected</c:when>
      <c:when test="${ (ticketvar.ticket_status=='5')}">revoked</c:when>
      </c:choose>
      </td>
          
      <td>${ticketvar.ticket_create_date}</td>
      <td>
      <c:choose>
      <c:when test="${ (ticketvar.ticket_priority=='5')}">high</c:when>
      <c:when test="${ (ticketvar.ticket_priority=='4')}">mid-high</c:when>
      <c:when test="${ (ticketvar.ticket_priority=='3')}">mid</c:when>
      <c:when test="${ (ticketvar.ticket_priority=='2')}">mid-low</c:when>
      <c:when test="${ (ticketvar.ticket_priority=='1')}">low</c:when>
      </c:choose>    
      </td></tr>
  
  </c:forEach>

    </table>
    </form>
    
    
   <form action="main.test" method="post"> <input  type="submit"  value="main"/></form>
  </body>
</html>
