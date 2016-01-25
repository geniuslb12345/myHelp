<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>delete ticket</title>
</head>
<body>
 <h2>enter here the Id of ticket needed to be updated: </h2>
 
    <form action="updatedelete.test" method="post">
     
    <table>
    <tr><td> Ticket Id:</td><td><input name="ticket_id" /></td></tr>     
    <tr><td> <input  type="submit"  value="update"/>
    </td><td>  
    </td></tr>
    </table>
       
    </form>
   <form action="main.test" method="post"> <input  type="submit"  value="main"/></form>
 
</body>
</html>