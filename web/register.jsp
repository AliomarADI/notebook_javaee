<%--
  Created by IntelliJ IDEA.
  User: Echo
  Date: 13.03.2021
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<br>
<br>
<br>
<br>

<center>
    <div class="container bg-dark" style="width: 25%;">
        <br>
        <br>
        <center>
            <h3 class="text-white">Registration</h3>
        </center>
        <br>
        <br>

        <form action="register">
            <input style="width: 80%" class="input-group" type="text" placeholder="Login" name="username"><br><br>
            <input style="width: 80%" class="input-group" type="password" placeholder="Password" name="password"><br><br>
<%--            <input style="width: 80%" class="input-group" type="password" placeholder="Re-password" name="repassword"><br><br>--%>
            <button class="btn btn-primary">Register</button>
        </form>

        <br>
        <br>
        <br>
        <br>
    </div>
</center>

<br>
<br>
<br>
<br>
<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
