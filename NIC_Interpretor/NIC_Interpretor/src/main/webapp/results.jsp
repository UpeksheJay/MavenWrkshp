<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@page import="Marter.maven.sample.NicInterpretor"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center"><u>NIC Information</u></h1>
        <%
         try{ 
             String number =  request.getParameter("NICNumber");
             NicInterpretor nic = new NicInterpretor(number);
             %>
        <br>
        <h2>Birthday:</h2>
        <% out.println("Year : "+nic.getYear()); %>
        <br>
        <% out.println("Month : "+nic.getMonth()); %>
        <br>
        <% out.println("Date : "+nic.getDate()); %>
        <br>
        <h2> Gender:</h2>
        <% out.println("Genger: " + nic.getGender()); %>
        <br> 
		<%
        }catch(Exception e){
        	out.println("Invalid NIC");
        }%>


    </body>
</html>
