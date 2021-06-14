<%--
  Created by IntelliJ IDEA.
  User: gerbe
  Date: 12.06.2021
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/init.jsp"%>


<html>
<head>
    <title>reestr.com</title>
</head>
<body>
<ul class="nav nav-list">
    <li><a href="${listPositions}"><i class="icon-book"></i> Справочник должностей</a></li>
    <li><a href="${listBanks}"><i class="icon-pencil"></i> Справочник банков</a></li>
    <li><a href="${listWorkers}"><i class="icon-user"></i> Реестр работников</a></li>
</ul>
</body>
</html>