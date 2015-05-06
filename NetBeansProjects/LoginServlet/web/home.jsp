<%-- 
    Document   : home
    Created on : 05 6, 15, 4:18:26 PM
    Author     : asi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
     <%
        String username=session.getAttribute("username").toString();
      %>
   <h1>Welcome home<%=username%></h1>
   <h2><a href="index.html">HOME</a></h2>  <h2><a href="profile.jsp">profile</a></h2>
    </body>
</html>
