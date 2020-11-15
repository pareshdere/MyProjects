<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h2>Hello ${sessionScope.passenger_data.firstName}, Please Confirm Your Reservation Details</h2>
	<h4>Airline : ${sessionScope.passenger_data.my_flight.airline}</h4>
	<h4>FROM : ${sessionScope.passenger_data.my_flight.departureCity}</h4>
	<h4>TO     : ${sessionScope.passenger_data.my_flight.arrivalCity}</h4>
	<h4>Date    : ${sessionScope.passenger_data.my_flight.dateOfDeparture}</h4>
	<h4>Time    : ${sessionScope.passenger_data.my_flight.departureTime}</h4>
	<form method="post">
	<input type="submit" value="Confirm Reservation">
	</form>
	
</body>
</html>