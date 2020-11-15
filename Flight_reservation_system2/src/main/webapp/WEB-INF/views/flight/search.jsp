<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h1 {
	    padding-left: 4%;
	}
	input[type=date],select {
	    display: block;
	    width: 25%;
	    padding: 12px 20px;
	    margin: 8px 0px ;
	    border: 1px solid rgb(182, 174, 174);
	    border-radius: 4px;
	    box-sizing: border-box;
	    text-align: center;
	}
	input[type=submit],input[type=reset] ,a{
	    display: inline-block;
	    width: 10%;
	    background-color: #75df79;
	    color: white;
	    padding: 14px 20px;
	    margin: 8px 10px;
	    border: none;
	    border-radius: 4px;
	    cursor: pointer;
	    text-decoration: none;
	    text-align: center;
	}
	
	input[type=submit]:hover ,input[type=reset]:hover ,a:hover{
	    background-color: #3f9c44;
	}
</style>
</head>
<body>
	<h1>Hello, ${sessionScope.valid_user.firstName}</h1>
	<form method="post" >
			<label for="arrivalCity">Choose a Arrival City:</label>
				<select name="arrivalCity" >
				  <option value="PUNE">PUNE</option>
				  <option value="MUMBAI">MUMBAI</option>
				  <option value="DELHI">DELHI</option>
				  <option value="HYDERABAD">HYDERABAD</option>
				  <option value="BANGLORE">BANGLORE</option>
				  <option value="CALCUTTA">CALCUTTA</option>
				  <option value="NAGPUR">NAGPUR</option>
				  <option value="CHENNAI">CHENNAI</option>
				  <option value="AHMEDABAD">AHMEDABAD</option>
				  <option value="JAIPUR">JAIPUR</option>
				</select>
			<label for="departureCity">Choose a Departure City:</label>
				<select name="departureCity" >
				  <option value="PUNE">PUNE</option>
				  <option value="MUMBAI">MUMBAI</option>
				  <option value="DELHI">DELHI</option>
				  <option value="HYDERABAD">HYDERABAD</option>
				  <option value="BANGLORE">BANGLORE</option>
				  <option value="CALCUTTA">CALCUTTA</option>
				  <option value="NAGPUR">NAGPUR</option>
				  <option value="CHENNAI">CHENNAI</option>
				  <option value="AHMEDABAD">AHMEDABAD</option>
				  <option value="JAIPUR">JAIPUR</option>
				</select>
			<label for="dateOfDeparture">Enter Departure Date </label>
			<input type="date" name="dateOfDeparture" />
			<input type="submit" value="search" />
	</form> 
	
</body>
</html>