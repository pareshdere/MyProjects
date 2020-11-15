<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- import spring supplied JSP tag lib -->
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	* {
    margin: 0;
    padding: 0;
	}
	
	html{
	    scroll-behavior: smooth;
	}
	
	:root{
	    --navbar-height: 100px;
	}
	
	#navbar{
	    display: flex;
	    align-items: center;
	    top: 0px;
	    position: sticky;
	}
	
	#navbar::before{
	    content: "";
	    background-color:#66ff66;
	    position: absolute;
	    top: 0px;
	    left: 0px;
	    height: 100%;
	    width: 100%;
	    z-index: -1;
	    opacity: 0.7;
	}
	
	#navbar ul{
	    display: flex;
	}
	
	#navbar ul li{
	    list-style: none;
	    font-size: 1.5rem;
	}
	
	#navbar ul li a{
	    color: black;
	    display: block;
	    padding: 3px 22px;
	    border-radius: 20px;
	    text-decoration: none;
	}
	
	#navbar ul li a:hover{
	    color: black;
	    background-color: #e6ffe6;
	}
</style>
</head>
<body>
 
    <nav id="navbar">
      <ul>
          <li class="item"><a href="#home">Home</a></li>
          <li class="item"><a href="/user/login">Search Flight</a></li>
          <li class="item"><a href="/user/login">Login</a></li>
          <li class="item"><a href="/user/login">Contact Us</a></li>
          <li class="item"><a href="/user/login">About Us</a></li>
      </ul>
  </nav>

  <br>
</body>
</html>