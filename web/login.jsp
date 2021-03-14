<%--
  Created by IntelliJ IDEA.
  User: Echo
  Date: 13.03.2021
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>

    <link href="WEB-INF/style/login.css">
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
        <h3 class="text-white">Login</h3>
        </center>
        <br>
        <br>
        <form action="admin">

            <input style="width: 80%" class="input-group" type="text" placeholder="Login" name="username">
            <br>
            <br>
            <input  style="width: 80%" class="input-group" type="password" placeholder="password" name="password">
            <br>
            <br>
                <button class="btn btn-primary" type="submit" value="login">Login</button>
        </form>

        <br>
        <br>
        <br>
        <br>


    <%--        <form action="welcome">--%>
    <%--            <button class="btn btn-primary">Go to Welcome</button>--%>
    <%--        </form>--%>
    </div>
</center>

<br>
<br>
<br>
<br>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
