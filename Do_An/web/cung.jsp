<%-- 
    Document   : cung
    Created on : Mar 19, 2025, 4:57:51 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%String name = (String) request.getAttribute("name");%>
        <%String zodiacSign = (String) request.getAttribute("zodiacSign");%>
        <%String message = (String) request.getAttribute("message");%>
        <% if (message != null) {%>
        <span><%= name%></span> 
        <span><%= zodiacSign%></span> 
        <span><%= message%></span> 
        <% }%>
    </body>
</html>
