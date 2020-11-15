<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
		background-color: #DFDF52;
		text-align: center;
	}
</style>
</head>
<body>
	<h2><a href="/user/logout" style="margin-left: 85%; ">Log Out</a></h2>
	<h1 align="center">Flight Ticket Details</h1>
	<hr>
	<br>
	<h2><strong>Booking Id : ${requestScope.reservation_data.pnr}</strong></h2>
	<h2><strong>Booking Date :</strong></h2>
	<p><%
         Date dNow = new Date( );
         SimpleDateFormat ft =
         new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss ");
         out.print( "<h2>" + ft.format(dNow) + "</h2>");
      %></p><br><hr>
    <h2><strong>Passenger Details :</strong></h2>
    <p>Name : ${requestScope.reservation_data.currentPassenger.firstName} ${requestScope.reservation_data.currentPassenger.lastName}</p>
	<p>Email : ${requestScope.reservation_data.currentPassenger.email}</p>
	<p>Phone No : ${requestScope.reservation_data.currentPassenger.phoneNo}</p><br><hr>
	<h2><strong>Flight Details :</strong></h2>
	<p>Flight No :${requestScope.reservation_data.currentPassenger.my_flight.flightId}</p>
	<p>Airline :${requestScope.reservation_data.currentPassenger.my_flight.airline}</p>
	<p>FROM : ${requestScope.reservation_data.currentPassenger.my_flight.departureCity}</p>
	<p>TO     : ${requestScope.reservation_data.currentPassenger.my_flight.arrivalCity}</p>
	<p>Date     : ${requestScope.reservation_data.currentPassenger.my_flight.dateOfDeparture}</p>
	<p>Time     : ${requestScope.reservation_data.currentPassenger.my_flight.departureTime}</p>
	
</body>
</html>