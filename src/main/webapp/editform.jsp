<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.example.project4_2.BoardDAO, com.example.project4_2.BoardVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>

<%
	BoardDAO boardDAO = new BoardDAO();
	String id=request.getParameter("id");	
	BoardVO u=boardDAO.getBoard(Integer.parseInt(id));
%>

<h1>Edit Form</h1>
<form action="editpost.jsp" method="post">
<input type="hidden" name="seq" value="<%=u.getSeq() %>"/>
<table>
	<tr><td>Name:</td><td><input type="text" name="name" value="<%= u.getName()%>"/></td></tr>
	<tr><td>Number:</td><td><input type="text" name="number" value="<%= u.getNumber()%>"/></td></tr>
	<tr><td>Email:</td><td><input type="text" name="email" value="<%= u.getEmail()%>" /></td></tr>
	<tr><td>Address:</td><td><textarea cols="50" rows="5" name="address"><%= u.getAddress()%></textarea></td></tr>
	<tr><td>College:</td><td><input type="text" name="college" value="<%= u.getCollege()%>"/></td></tr>
	<tr><td>Department:</td><td><input type="text" name="department" value="<%= u.getDepartment()%>"/></td></tr>
	<tr><td>Hobby:</td><td><input type="text" name="hobby" value="<%= u.getHobby()%>" /></td></tr>
	<tr><td>Religion:</td><td><input type="text" name="religion" value="<%= u.getReligion()%>"/></td></tr>
	<tr><td>Favorite Food:</td><td><input type="text" name="favorite_food" value="<%= u.getFood()%>"/></td></tr>
	<tr><td>Favorite Juice:</td><td><input type="text" name="favorite_juice" value="<%= u.getJuice()%>"/></td></tr>

<tr><td colspan="2"><input type="submit" value="Edit Post"/>
<input type="button" value="Cancel" onclick="history.back()"/></td></tr>
</table>
</form>

</body>
</html>