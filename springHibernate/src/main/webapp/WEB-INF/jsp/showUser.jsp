<%@page import="org.springframework.ui.ModelMap"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>在此处插入标题</title>
</head>
<body>
	<div align="center">
		<table border="1">
			<c:forEach var="list" items="${users}">
				<tr>
					<td>${list.id }</td>
					<td>${list.username }</td>
					<td>${list.password }</td>
					<td>${list.age }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>