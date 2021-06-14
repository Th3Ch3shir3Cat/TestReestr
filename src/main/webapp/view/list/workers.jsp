<%@ page import="java.util.List" %>
<%@ page import="com.liferay.docs.servicebuilder.model.Worker" %>
<%@ page import="com.liferay.docs.servicebuilder.service.WorkerLocalServiceUtil" %>
<%@ page import="com.liferay.docs.servicebuilder.model.Bank" %>
<%@ page import="com.liferay.docs.servicebuilder.service.BankLocalServiceUtil" %>
<%@ page import="com.liferay.docs.servicebuilder.model.Position" %>
<%@ page import="com.liferay.docs.servicebuilder.service.PositionLocalServiceUtil" %><%--
  Created by IntelliJ IDEA.
  User: gerbe
  Date: 12.06.2021
  Time: 22:01
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
  <th>Фамилия</th>
  <th>Имя</th>
  <th>Отчество</th>
  <th>Пол</th>
  <th>Дата рождения</th>
  <th>Должность</th>
  <th>Дата трудоустройства</th>
  <th>Уровень зарплаты</th>
  <th>Номер рабочего телефона</th>
  <th>Номер мобильного телефона</th>
  <th>Банковская организация</th>
  <th>Архивность</th>
  <th>Изм.</th>
  </thead>
  <tbody>
  <%
    List<Worker> workers = WorkerLocalServiceUtil.findAll();
    for(Worker worker : workers){
  %>
  <tr>
    <td><%=worker.getWorkerId()%></td>
    <td><%=worker.getFirstName()%></td>
    <td><%=worker.getMiddleName()%></td>
    <td><%=worker.getLastName()%></td>
    <td><%=worker.getGender()%></td>
    <td><%=worker.getDateOfBirth()%></td>
    <%
      Position position = PositionLocalServiceUtil.findById(worker.getPositionId());
    %>
    <td><%=position.getName()%></td>
    <td><%=worker.getEmploymentDate()%></td>
    <td><%=worker.getSalaryLevel()%></td>
    <td><%=worker.getNumberWorkPhone()%></td>
    <td><%=worker.getNumberHomePhone()%></td>
    <%
      Bank bank = BankLocalServiceUtil.findById(worker.getBankId());
    %>
    <td><%=bank.getName()%></td>
    <td>
      <c:choose>
        <c:when test="<%=worker.getArchived()%>">Да</c:when>
        <c:otherwise>Нет</c:otherwise>
      </c:choose>
      </td>
    <portlet:renderURL var="editWorker">
      <portlet:param name="workerId" value="<%=String.valueOf(worker.getWorkerId())%>"/>
      <portlet:param name="jspPage" value="/view/edit/editWorker.jsp"/>
    </portlet:renderURL>
    <td><a class = "btn btn-primary" href="${editWorker}"><i class="icon-edit icon-red"></i></a></td>
  </tr>
  <%
    }
  %>
  </tbody>
</table>
<a class = "btn btn-primary" href="${addWorker}">Добавить сотрудника</a>
<a class = "btn btn-primary" href="${mainPage}"><i class="icon-home icon-white"></i> Главная</a>
</body>
</html>
