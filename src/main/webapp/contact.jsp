<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact us</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<%@ include file="navbar.jsp" %>
<body>

 <div class="form-container">
 <form action="Contact" method="post"> 
 <h3>Please fill the required details</h3>
 
 <label for="uName">Name</label>
 <br>
 <input name="uName" id="uName" type="text" placeholder="Enter your name">
 
 <label for="pNumber">Phone Number</label>
 <br>
 <input name="pNumber" id="pNumber" type="number" placeholder="Enter your phone number">
 
 <label for="email">Email</label>
 <br>
 <input name="email" id="email" type="email" placeholder="Enter your email">
 
 <label for="comment">Comment</label>
 <br>
 <textarea name="comment" id="comment" rows="6" cols="40"></textarea>
 
 <button type="submit">Submit</button>
 </form>
 </div>

</body>
</html>