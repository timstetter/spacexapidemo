<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rocket Details</title>
</head>
<body>
	<h2>${ rocket.name }</h2>
	
	<p>Stages: ${ rocket.stages }</p>
	<p>Cost: ${ rocket.cost_per_launch }</p>
	<a href="${ rocket.wikipedia }">Wikipedia</a>
	<p>${ rocket.description }</p>
	
	<h3>Height</h3>
	
	<p>${ rocket.height.meters }m</p>
	<p>${ rocket.height.feet }ft</p>
	
	<h3>Diameter</h3>
	
	<p>${ rocket.diameter.meters }m</p>
	<p>${ rocket.diameter.feet }ft</p>
	
</body>
</html>