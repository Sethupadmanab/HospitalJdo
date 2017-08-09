<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Expires" content="0" />
<title>Profile Page</title>
<style>
	body{
	background-image: url("http://previews.123rf.com/images/hxdbzxy/hxdbzxy1302/hxdbzxy130200239/17828300-Chairs-in-the-hospital-hallway-hospital-interior-Stock-Photo.jpg");
}  
</style>
			 
</head>
<body >
	 
	
	<h1>Hi!...You can see your profile details here...</h1>
		<!--<a href="/logout"><button type="submit" name="logout" >LogOut</button></a>-->
	
	<table>
	
		 
		<tr><td>Patient Id</td> 
		<td><input type="text"  value="<%= request.getAttribute("patientid") %>"></td></tr>

		<tr><td>Patient Name</td> 
		<td><input type="text"  value="<%= request.getAttribute("patientname") %>"></td></tr>

		<tr><td>Patient Age</td> 
		<td><input type="text"  value="<%= request.getAttribute("patientage") %>"></td></tr>

		<tr><td>Patient DOB</td> 
		<td><input type="text"  value="<%= request.getAttribute("patientdob") %>"></td></tr>

		<tr><td>Patient Adress</td> 
		<td><input type="text"  value="<%= request.getAttribute("patientaddress") %>"></td></tr>

		<tr><td>Patient Phone</td> 
		<td><input type="text"  value="<%= request.getAttribute("patientphone") %>"></td></tr>

		<tr><td>Patient Mail</td> 
		<td><input type="text"  value="<%= request.getAttribute("patientmail") %>"></td></tr>

		<tr><td>Patient Ward</td> 
		<td><input type="text"  value="<%= request.getAttribute("patientward") %>"></td></tr>
		 
			 
		 
</table> 
<input id="push" type="submit" value="click here to go login page" onclick="myPage2()" />
<script>
 function myPage2()
 {
 window.location.assign("administrator.html").reset();
 }
 
</script>

</body>
</html>
