<%--
  Created by IntelliJ IDEA.
  User: gerbe
  Date: 12.06.2021
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/init.jsp"%>

<html>
<head>
    <title>AddPosition</title>
</head>
<body>

<aui:form action="<%=actionAddPosition%>" name="<portlet:namespace />fm" class="form-horizontal">
    <aui:fieldset>
    <div class="control-group">
        <div class="controls">
            <aui:input type="hidden" id="positionId" name="positionId" value="<%=null%>"/>
            <aui:input label="Наименование" type="text" id="namePosition" name="name">
                <aui:validator name="required" errorMessage="Заполните поле"/>
            </aui:input>
            <aui:input name="archived" label="Архивность" type="checkbox"/>
        </div>
    </div>
    </aui:fieldset>
    <div class="control-group">
        <div class="controls">
            <aui:button type="submit" class="btn btn-primary" value="Добавить"/>
            <aui:button type = "button" class = "btn btn-primary" onClick="<%= listPositions %>" value="Назад"/>
        </div>
    </div>
</aui:form>
</body>
<a class = "btn btn-primary" href="${mainPage}"><i class="icon-home icon-white"></i> Главная</a>
</html>
