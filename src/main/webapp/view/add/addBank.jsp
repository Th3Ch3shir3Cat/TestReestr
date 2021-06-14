<%--
  Created by IntelliJ IDEA.
  User: gerbe
  Date: 13.06.2021
  Time: 0:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/init.jsp"%>
<html>
<head>
  <title>AddBank</title>
</head>
<body>

<aui:form action="<%=actionAddBank%>" method="post" name = "bank" class="form-horizontal">
  <div class="control-group">
    <div class="controls">
      <aui:input label="Наименование" type="text" name="name">
        <aui:validator name="required" errorMessage="Заполните поле"/>
      </aui:input>
      <aui:input label="БИК" type="text" name="bik">
        <aui:validator name="required" errorMessage="Заполните поле"/>
      </aui:input>
      <aui:input label="Адрес" type="text" name="address">
        <aui:validator name="required" errorMessage="Заполните поле"/>
      </aui:input>
    </div>
  </div>
  <div class="control-group">
    <div class="controls">
      <aui:button type="submit" class="btn btn-primary" value="Добавить"></aui:button>
      <aui:button type = "button" class = "btn btn-primary" onClick="<%= listBanks %>" value="Назад"></aui:button>
    </div>
  </div>
</aui:form>
</body>
<a class = "btn btn-primary" href="${mainPage}"><i class="icon-home icon-white"></i> Главная</a>
</html>

