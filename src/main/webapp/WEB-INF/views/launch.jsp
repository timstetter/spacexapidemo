<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Launch Details</title>
</head>
<body>
	<h2>${ launch.name }</h2>
Date: ${ launch.getStatic_fire_date_utc() }
<p>${ launch.details }</p>
<p>Success: ${ launch.success }</p>
<p><a href="/rocket/${ launch.rocket }">Rocket</a></p>
</body>
</html>