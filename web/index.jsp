<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/12/6
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>首页</title>
  <style type="text/css">
    a {
      text-decoration: none;
      color: black;
      font-size: 18px;
    }
    h3 {
      width: 180px;
      height: 38px;
      margin: 100px auto;
      text-align: center;
      line-height: 38px;
      background: #ff315f;
      border-radius: 4px;
    }
    h1 {
      width: 100%;
      height: 38px;
      margin: 100px auto;
      text-align: center;
      line-height: 38px;
      background: #ff315f;
      border-radius: 4px;
    }
  </style>
</head>
<body>
  <h1>图书管理系统</h1>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">图书管理</a>
  </h3>
  <h3><a href="${pageContext.request.contextPath}/user/allUser">会员管理</a></h3>
  <h3><a href="${pageContext.request.contextPath}/bookread/allBookRead">借阅管理</a></h3>
</body>
</html>
