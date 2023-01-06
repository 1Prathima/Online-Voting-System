<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome voter!</title>
</head>
<%@ include file="navbar.jsp"%>
<body>

<div class="form-container">
 <form action="Vote" method="post"> 
 
 <h3>Please fill the required details</h3>

 <label for="voterNumber">Voter ID</label>
 <br>
 <input name="voterNumber" id="voterNumber" type="text" placeholder="Enter your voter number">
 <br>
 
 <label for="party">Choose a party:</label>
 
 <select name="party" id="party">
 <option value="congress">Congress</option>
 <option value="aap">Aam Aadmi Party</option>
 <option value="bjp">BJP</option>
 <option value="jds">JDS</option>
 </select>
 
 <button type="submit">Login</button>
 
 </form>
 </div>

</body>
</html>