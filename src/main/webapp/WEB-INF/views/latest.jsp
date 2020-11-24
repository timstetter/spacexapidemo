<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Latest Launch: ${ launch.name }</title>
</head>
<body>
<h2>${ launch.name }</h2>
Date: ${ launch.static_fire_date_utc }
<p>${ launch.details }</p>
</body>
</html>