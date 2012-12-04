<%@ page import="java.util.List" %>
<%@ page import="statusapp.components.Statuses" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html>
<meta http-equiv="refresh" content="10" />
<head>
    <title>Status App ! </title>
</head>
<body>


     <% for (String status : (List<String>) request.getAttribute("statuslist")) { %>
    <tr>
        <td>    <%= status  %> </td>  
    </tr><br />
    <% } %>
</body>
</html>