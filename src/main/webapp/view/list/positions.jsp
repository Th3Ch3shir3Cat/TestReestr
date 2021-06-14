<%@ page import="com.liferay.docs.servicebuilder.model.Position" %>
<%@ page import="com.liferay.docs.servicebuilder.service.PositionLocalServiceUtil" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: gerbe
  Date: 12.06.2021
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/init.jsp"%>


<html>
<head>
    <title>

    </title>
</head>
<body>
<table class="table table-striped">
  <thead>
    <th>#</th>
    <th>Наименование</th>
    <th>Арх</th>
    <th></th>
    <th >Изм.</th>
  </thead>
  <tbody>
  <%
      List<Position> positions = PositionLocalServiceUtil.findAll();
        for(Position position : positions){
  %>
    <tr>
        <td><%=position.getPositionId()%></td>
        <td><%=position.getName()%></td>
        <td><c:choose>
            <c:when test="<%=position.getArchived()%>">Да</c:when>
            <c:otherwise>Нет</c:otherwise>
            </c:choose>
        <td>
        <portlet:renderURL var="editPosition">
            <portlet:param name="positionId" value="<%=String.valueOf(position.getPositionId())%>"/>
                <portlet:param name="jspPage" value="/view/edit/editPosition.jsp"/>
        </portlet:renderURL>
        <td><a class = "btn btn-primary" href="${editPosition}"><i class="icon-edit icon-red"></i></a></td>
    </tr>
  <%
      }
  %>
  </tbody>
</table>
<a class = "btn btn-primary" href="${addPosition}">Добавить должность</a>
<a class = "btn btn-primary" href="${mainPage}"><i class="icon-home icon-white"></i> Главная</a>
</body>
</html>