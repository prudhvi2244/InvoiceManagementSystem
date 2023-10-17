<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

	<div class="container">

		<h1 style="text-align: center;">${msg}</h1>
		<hr />

		<form action="register" method="post">

			<div class="form-group">
				<label>Name</label> <input class="form-control" name="name" />
			</div>
			<div class="form-group">
				<label>Location</label> <input class="form-control" name="location" />
			</div>
			<div class="form-group">
				<label>Amount</label> <input class="form-control" name="amount" />
			</div>
			<div>
				<input class="btn btn-primary" type="submit" value="Save Invoice" />
				<input class="btn btn-danger" type="reset" value="Reset" /> <a
					class="btn btn-success" href="/invoice/">Home</a>
			</div>

		</form>
		<hr />
		<c:if test="${sm!=null}">
			<h4 class="text-success">${sm}</h4>
		</c:if>
	</div>
</body>
</html>