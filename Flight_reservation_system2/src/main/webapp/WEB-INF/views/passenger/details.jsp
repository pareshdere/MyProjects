<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h1 {
	    text-shadow: 2px 2px 5px green;
	}
	input[type=text],input[type=number],input[type=password],select {
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
	
	div {
	    border-radius: 5px;
	    background-color: #f2f2f2;
	    padding: 20px;
	}
</style>
</head>
<body>
	<h1>Enter Passenger Details</h1>
	<form:form  method="post" modelAttribute="passenger">
			<label for="email">Enter Passenger Email</label>
            <form:input type="text" id="email" name="email" path="email" placeholder="Your Email(e.g. abc@gmail.com)" />
            <label for="firstName">Enter Passenger FirstName </label>
            <form:input type="text" id="firstName" name="firstName" path="firstName" />
            <label for="lastName">Enter Passenger LastName </label>
            <form:input type="text" id="lastName" name="lastName" path="lastName" />
            <label for="phoneNo">Enter Passenger Phone No </label><br>
            <form:input type="number" id="phoneNo" name="phoneNo" path="phoneNo" />
            <label for="my_flight">Flight No </label>
            <form:input type="text" path="my_flight" name="my_flight" readonly="true"/>
            <input type="reset" value="Reset">
            <input type="submit" value="Proceed">
    </form:form>
		
</body>
</html>