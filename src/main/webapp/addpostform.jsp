<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="addpost.jsp" method="post">
<table>
    <tr><td>Name:</td><td><input type="text" name="name" /></td></tr>
    <tr><td>Number:</td><td><input type="text" name="number" /></td></tr>
    <tr><td>Email:</td><td><input type="text" name="email" /></td></tr>
    <tr><td>Address:</td><td><input type="text" name="address" /></td></tr>
    <tr><td>College:</td><td><input type="text" name="college" /></td></tr>
    <tr><td>Department:</td><td><input type="text" name="department" /></td></tr>
    <tr><td>Hobby:</td><td><input type="text" name="hobby" /></td></tr>
    <tr><td>Religion:</td><td><input type="text" name="religion" /></td></tr>
    <tr><td>Food:</td><td><input type="text" name="favorite_food" /></td></tr>
    <tr><td>Juice:</td><td><input type="text" name="favorite_juice" /></td></tr>


<tr><td><a href="posts.jsp">View All Records</a></td><td align="right"><input type="submit" value="Add Post"/></td></tr>
</table>
</form>

</body>
</html>