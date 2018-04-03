<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



 
    <form:form method="Post" modelAttribute="keyUser" action="checklogin.do">
        <table>
          <tr>
          <td>                     
            <p>Email</p><form:input path="email"/>
           
		    <p>Password</p><form:input path="Password"/>
		   
           <input type="submit">
      
              </tr>
              </td>
        </table>
      </form:form>
    </body>
</html>