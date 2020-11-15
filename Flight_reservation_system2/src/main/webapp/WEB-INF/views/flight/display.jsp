<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<%--import JSTL supplied core tag lib --%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%--import spring supplied JSP tag lib --%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet"
		href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
		integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
		crossorigin="anonymous">
	</head>
	<body>
	<br><h1 style="padding-left: 37%; text-shadow: 2px 2px 5px green;">Available Flights </h1><br>
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">Airline</th>
					<th scope="col">Departure City</th>
					<th scope="col">Arrival City</th>
					<th scope="col">Departure Date</th>
					<th scope="col">Departure Time</th>
					<th scope="col">Book Ticket</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="f" items="${requestScope.flightList}">
					<tr>
						<td>${f.airline}</td>
						<td>${f.departureCity}</td>
						<td>${f.arrivalCity}</td>
						<td>${f.dateOfDeparture}</td>
						<td>${f.departureTime}</td>
	
						<td><a href="<spring:url value='/passenger/details?fid=${f.flightId}'/>">Book Ticket</a></td>
					</tr>
	
				</c:forEach>
			</tbody>
		</table>
	
	</body>
	</html>