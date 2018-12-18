<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/css" var="css"></spring:url>
<spring:url value="/resources/js" var="js"></spring:url>
<spring:url value="/resources/fonts" var="fonts"></spring:url>


<c:set var="contextRoot" value="${pageContext.request.contextPath }"></c:set>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title }</title>
<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${ css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap flaty theme 
<link href="${ css}/bootstrap-flaty-theme.css" rel="stylesheet">  -->


<!-- Custom styles for this template -->
<link href="${ css}/myapp.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
</head>

<body>
	<div class="wrapper">

		<!-- Navigation -->

		<%@include file="./shared/navbar.jsp"%>



		<!-- Page Content -->

		<div class="content">
			<!-- /.container -->
			<!-- Loading the Home content here -->
			<c:if test="${ userClickHome==true}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${ userClickAbout==true}">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${ userClickContact==true}">
				<%@include file="contact.jsp"%>
			</c:if>

		</div>

		<!-- Footer 
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2017</p>
      </div>
       /.container 
    </footer>
    -->
		<%@ include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="js/jquery.min.js"></script>
		<!--   <script src="${ js}/bootstrap.bundle.min.js"></script>   -->
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
			integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
			crossorigin="anonymous"></script>
		<script src="${js}/myapp.js"}></script>
	</div>
</body>

</html>
