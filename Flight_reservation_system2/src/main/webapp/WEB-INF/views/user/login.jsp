<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h1 {
	    padding-left: 8%;
	    text-shadow: 2px 2px 5px green;
	}
	input[type=text],input[type=password],select {
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
	<h1>Login</h1>
	<form  method="post">
			<label for="email">Email Address </label>
            <input type="text" id="email" name="email" placeholder="Your Email(e.g. abc@gmail.com)" required>
            <label for="password">Password </label>
            <input type="password" id="password" name="password" placeholder="Your password" required>
            <input type="reset" value="Reset">
            <input type="submit" value="Login"><br>
	</form>

</body>
</html>