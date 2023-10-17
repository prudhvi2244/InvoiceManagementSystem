<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
	
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>All Invoices</title>
</head>
<body>
	<div class="container">
		<h1>All Invoices</h1>
		<a class="btn btn-success" href="/invoice/">Home</a>
		<hr/>
		<table class="table table-bordered">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Location</th>
				<th>Amount</th>
				<th></th>
			</tr>
			<c:forEach items="${allInvoices}" var="invoices">
			<tr>
				<td><c:out value="${invoices.id}"/></td>
				<td><c:out value="${invoices.name}"/></td>
				<td><c:out value="${invoices.location}"/></td>
				<td><c:out value="${invoices.amount}"/></td>
				<td><a href="" class="btn btn-primary">Edit</a>|<a href="" class="btn btn-danger">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>