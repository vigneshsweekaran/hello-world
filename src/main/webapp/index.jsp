<%@page import="com.helloworld.MyCalculator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mycalculator</title>
</head>
<body>
    <%
    MyCalculator calculator = new MyCalculator();
    int num1 = Integer.parseInt(request.getParameter("number1"));
    int num2 = Integer.parseInt(request.getParameter("number2"));
    %>

    Addition
    <%= calculator.addition(num1, num2) %>

    <br><br> Subtraction
    <%= calculator.subtraction(num1, num2) %>

    <br><br> Multiplication
    <%= calculator.multiplication(num1, num2) %>

    <br><br> Division
    <%= calculator.division(num1, num2) %>
</body>
</html>
