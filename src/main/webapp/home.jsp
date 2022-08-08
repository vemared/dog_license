<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department for Pet Protection - Dog License Application</title>
</head>
<body>

	<form action="saveApplication">
		<img src="images/dogs.jpeg" alt="Dog License Applciation" width="500" height="300">
		<table>
			<tr>
				<th>
					<h1 style="color:gray;">Application for a Dog License</h1>
				</th>
			</tr>	
		</table>
		<table>
			<tr>
	      	  <td>Please enter Dog ID</td>
	          <td><input type="text" name="id"></td>
	        </tr>
	        <tr></tr>
	       <tr>
	      	  <td>Please enter Dog Name</td>
	          <td><input type="text" name="name"></td>
	        </tr>
	        <tr></tr>
	        <tr>
	       <tr>
	      	  <td>Please enter Dog Color</td>
	          <td><input type="text" name="color"></td>
	        </tr>
	        <tr></tr>
	        <tr>
	        <tr>
	      	  <td>Please enter Dog Breed</td>
	          <td><input type="text" name="breed"></td>
	        </tr>
	         <tr>
	      	  <td>Please enter Dog Year of Birth</td>
	          <td><input type="text" name="birthYear"></td>
	        </tr>
	        <tr>
	          <td></td>
	          <td><input type="submit" value="Save Application" /></td>
	        </tr>
      	</table>
	</form>
</body>
</html>