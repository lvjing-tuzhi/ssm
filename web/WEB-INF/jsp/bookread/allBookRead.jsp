<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/12/6
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>借阅列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>借阅列表 —— 显示所有借阅信息</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增借阅信息</a>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>借阅ID</th>
                    <th>书籍名字</th>
                    <th>借阅人</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="bookread" items="${list}">
                    <tr>
                        <td>${bookread.id}</td>
                        <td>${bookread.bookName}</td>
                        <td>${bookread.userName}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${bookread.id}">更改</a> |
                            <a href="${pageContext.request.contextPath}/book/del/${bookread.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
