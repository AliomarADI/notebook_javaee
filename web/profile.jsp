<%--
  Created by IntelliJ IDEA.
  User: Echo
  Date: 14.03.2021
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>

</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
<br>
<br>

    <div class="row" style="padding: 2%">
        <div class="col-2">
            <button class="btn btn-primary">+ Создать новую запись</button>
        </div>
        <div class="col-10">
            <input class="input-group" style="width: 100%;" placeholder="Введите название">
            <textarea style="width: 100%;height: 400%" placeholder="text..."></textarea>
        </div>
    </div>


<br>
<br>
<footer>
    <div style="margin-top: 20%">
        <jsp:include page="footer.jsp"></jsp:include>
    </div>
</footer>



</body>
</html>
