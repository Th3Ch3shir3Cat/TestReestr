<%@ page import="java.util.List" %>
<%@ page import="com.liferay.docs.servicebuilder.model.Bank" %>
<%@ page import="com.liferay.docs.servicebuilder.service.BankLocalServiceUtil" %><%--
  Created by IntelliJ IDEA.
  User: gerbe
  Date: 12.06.2021
  Time: 21:59
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
  <th>БИК</th>
  <th>Адрес</th>
  <th>Изм.</th>
  </thead>
  <tbody>
  <%
    List<Bank> banks = BankLocalServiceUtil.findAll();
    for(Bank bank : banks){
  %>
  <tr>
    <td><%=bank.getBankId()%></td>
    <td><%=bank.getName()%></td>
    <td><%=bank.getBik()%></td>
    <td><%=bank.getAddress()%></td>
      <portlet:renderURL var="editBank">
        <portlet:param name="bankId" value="<%=String.valueOf(bank.getBankId())%>"/>
        <portlet:param name="jspPage" value="/view/edit/editBank.jsp"/>
      </portlet:renderURL>
    <td><a class = "btn btn-primary" href="${editBank}"><i class="icon-edit icon-red"></i></a></td>
  </tr>
  <%
    }
  %>
  </tbody>
</table>
<a class = "btn btn-primary" href="${addBank}">Добавить банк</a>
<a class = "btn btn-primary" href="${mainPage}"><i class="icon-home icon-white"></i> Главная</a>
</body>
</html>
