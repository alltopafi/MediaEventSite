<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Picture</title>
</head>
<body>
<h2>Add Picture</h2>
	<form action="confirmAddPicture" object="${Picture}" method="post">
        <p>Author: <input type="text" name="author" field="${author}" /></p>
        <p>Description: <input type="text" name="description" field="${description}" /></p>
        <p>Event: <input type="text" name="event" field="${event}" /></p>
        <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
    </form>
</body>
</html>