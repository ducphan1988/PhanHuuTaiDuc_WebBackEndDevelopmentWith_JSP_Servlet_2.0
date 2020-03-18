<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/18/2020
  Time: 10:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form action="/calculate" method="post">
  Số thứ 1 : <input type="text" name="soThuNhat"> <br>
  Chọn phép tính : <select name="phepTinh">
  <option value="+">+</option>
  <option value="-">-</option>
  <option value="*">*</option>
  <option value="/">/</option>
</select><br>
  Số thứ 2 : <input type="text" name="soThuHai"><br>
  <input type="submit" value="Tính">
</form>
</body>
</html>
