<%@ page import="java.util.List" %>
<%@ page import="com.liferay.docs.servicebuilder.model.Position" %>
<%@ page import="com.liferay.docs.servicebuilder.service.PositionLocalServiceUtil" %>
<%@ page import="com.liferay.docs.servicebuilder.model.Bank" %>
<%@ page import="com.liferay.docs.servicebuilder.service.BankLocalServiceUtil" %>
<%--
  Created by IntelliJ IDEA.
  User: gerbe
  Date: 13.06.2021
  Time: 0:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/init.jsp"%>

<%
  List<Position> positions = PositionLocalServiceUtil.findAll();
  List<Bank> banks = BankLocalServiceUtil.findAll();
%>

<html>
<head>
  <title>AddWorker</title>
</head>
<body>
<aui:form action="<%=actionAddWorker%>" method="post" name = "worker" class="form-horizontal">
  <div class="control-group">
    <div class="controls">
      <aui:input label="ФИО" type="text" id="fio" name="fio">
        <aui:validator name="required" errorMessage="Заполните поле"/>
      </aui:input>
      <aui:input label="Уровень зарплаты" type="text" name="salaryLevel">
        <aui:validator name="required" errorMessage="Заполните поле"/>
      </aui:input>
      <aui:input label="Муж." name="male" type="radio" checked="true"/>
      <aui:input label="Жен." name="male" type="radio"/>
      <aui:input label="Дата рождения" name="dateOfBirth" type="date">
        <aui:validator name="required" errorMessage="Заполните поле"/>
      </aui:input>
      <aui:select name="positionId" label="Должность">
        <%
          for(Position position : positions){
        %>
          <aui:option value="<%=position.getPositionId()%>"><%=position.getName()%>></aui:option>
        <%
          }
        %>
      </aui:select>
      <aui:input label="Дата трудоустройства" name="employmentDate" type="date">
        <aui:validator name="required" errorMessage="Заполните поле"/>
      </aui:input>
      <aui:input label="Номер рабочего телефона" type="text" id="numberWorkPhone" name="numberWorkPhone"/>
      <aui:input label="Номер мобильного телефона" type="text" id="numberHomePhone" name="numberHomePhone"/>
      <aui:select name="bankId" label="Банк">
        <%
          for(Bank bank : banks){
        %>
        <aui:option value="<%=bank.getBankId()%>"><%=bank.getName()%></aui:option>
        <%
          }
        %>
      </aui:select>
      <aui:input name="is_archived" type="checkbox" label="Архивность"/>
    </div>
  </div>
  <div class="control-group">
    <div class="controls">
      <aui:button type="submit" class="btn btn-primary" value="Добавить"></aui:button>
      <aui:button type = "button" class = "btn btn-primary" onClick="<%= listWorkers %>" value="Назад"></aui:button>
    </div>
  </div>
</aui:form>
</body>
<a class = "btn btn-primary" href="${mainPage}"><i class="icon-home icon-white"></i> Главная</a>
</html>

<script>
  //Код jQuery, установливающий маску для ввода телефона элементу input
  //1. После загрузки страницы,  когда все элементы будут доступны выполнить...
  $(function(){
    //2. Получить элемент, к которому необходимо добавить маску
    $("#numberWorkPhone").mask("8(999) 999-9999");
    $("#numberHomePhone").mask("8(999) 999-9999");
  });
</script>
