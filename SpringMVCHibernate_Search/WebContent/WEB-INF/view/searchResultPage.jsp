<%@page import="com.companyname.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${!empty listEmps}">
<table border="1">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Email Id</th>
		<th>Contact Number</th>
		<th>Password</th>
	</tr>
	<c:forEach items="${listEmps}" var="e">
	<tr>
		<td><c:out value="${e.employeeId}"/></td>
			<td><c:out value="${e.employeeName}"/></td>
			<td><c:out value="${e.emailId}"/></td>
			<td><c:out value="${e.contactNumber}"/></td>
			<td><c:out value="${e.password}"/></td>
	</tr>
	</c:forEach>
</table>
</c:if>
<c:if test="${empty listEmps}">
	<h3>No Record found in database.</h3>
</c:if>


<%-- <h3><%= request.getAttribute("employee") %></h3> --%>
</body>
</html>