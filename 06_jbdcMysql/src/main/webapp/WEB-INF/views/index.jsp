<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
	<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h2>안녕하세요hhdddh</h2>
<c:forEach var="dto" items="${lists}">
	<div>${dto.id} / ${dto.title}</div>
</c:forEach>
</body>
</html>