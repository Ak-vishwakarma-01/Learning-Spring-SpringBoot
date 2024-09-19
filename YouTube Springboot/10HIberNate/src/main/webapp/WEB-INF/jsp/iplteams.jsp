<%@ page import="java.util.List" language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="com.example.demo.Ipltema" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Your Page Title</title>
</head>
<body>
    <h1>Welcome to My JSP Page</h1>
    <table border="2">
    <tr>
        <th>TeamName</th>
        <th>Trophies</th>
        <th>OwnerName</th>
        <th>CaptainName</th>
    </tr>
    <%
    List<Ipltema> ipl = (List<Ipltema>) request.getAttribute("iplteams");
    for (Ipltema iplteam : ipl) {

    %>
    <tr>
        <td><%= iplteam.getTeamName() %></td>
        <td><%= iplteam.getTrophies() %></td>
        <td><%= iplteam.getOwnername() %></td>
        <td><%= iplteam.getTemaCaptionname() %></td>
    </tr>
    <% } %>
    </table>
</body>
</html>
