<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h1 {
	    text-shadow: 2px 2px 5px green;
	}
	input[type=text],input[type=number],input[type=date],select {
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
	<h1>Enter Payment Details</h1>
	<form  method="post">
		<label for="cardNumber">Enter Card Number</label>
            <input type="number" id="cardNumber" name="cardNumber">
            <label for="name">Enter Card Holder Name </label>
            <input type="text" id="name" name="name">
            <label for="expDate">Enter Card Expiry Date </label>
            <input type="date" id="expDate" name="expDate">
            <label for="cvv">Enter Card CVV </label>
            <input type="number" id="cvv" name="cvv">
            <input type="reset" value="Reset">
            <input type="submit" value="Proceed"><br>

	</form>
</body>
</html>