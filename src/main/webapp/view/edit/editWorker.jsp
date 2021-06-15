<%@ page import="java.util.List" %>
<%@ page import="com.liferay.docs.servicebuilder.model.Position" %>
<%@ page import="com.liferay.docs.servicebuilder.service.PositionLocalServiceUtil" %>
<%@ page import="com.liferay.docs.servicebuilder.model.Bank" %>
<%@ page import="com.liferay.docs.servicebuilder.service.BankLocalServiceUtil" %>
<%@ page import="com.liferay.docs.servicebuilder.model.Worker" %>
<%@ page import="com.liferay.docs.servicebuilder.service.WorkerLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
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
    Worker worker = WorkerLocalServiceUtil.findById(ParamUtil.getLong(request,"workerId"));
    List<Worker> workers = WorkerLocalServiceUtil.findAll();
    List<Position> positions = PositionLocalServiceUtil.findAll();
    List<Bank> banks = BankLocalServiceUtil.findAll();
    String fio = worker.getFirstName() + " " + worker.getMiddleName() + " " + worker.getLastName();
%>

<html>
<head>
    <title>AddWorker</title>
</head>
<body>
<aui:form action="<%=actionEditWorker%>" method="post" name = "worker" class="form-horizontal">
    <div class="control-group">
        <div class="controls">
            <aui:input name="workerId" type="hidden" value="<%=worker.getWorkerId()%>"/>
            <aui:input label="ФИО" type="text" id="fio" name="fio" value="<%=fio%>">
                <aui:validator name="required" errorMessage="Заполните поле"/>
            </aui:input>
            <aui:input label="Уровень зарплаты" type="text" name="salaryLevel" value="<%=worker.getSalaryLevel()%>">
                <aui:validator name="required" errorMessage="Заполните поле"/>
            </aui:input>
            <aui:input label="Муж." value="Муж." name="male" type="radio" checked='<%=worker.getGender().equals("Муж.")%>'/>
            <aui:input label="Жен." value="Жен." name="male" type="radio" checked='<%=worker.getGender().equals("Жен.")%>'/>
            <%
                DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                Date date = dateFormat.parse(worker.getDateOfBirth());
                dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            %>
            <aui:input label="Дата рождения" name="dateOfBirth" type="date" value="<%=dateFormat.format(date)%>">
                <aui:validator name="required" errorMessage="Заполните поле"/>
            </aui:input>
            <aui:select name="positionId" label="Должность">
                <%
                    for(Position position : positions){
                        boolean exist = false;
                        for(Worker tmpWorker : workers){
                            if(tmpWorker.getPositionId() == position.getPositionId() && tmpWorker.getWorkerId() != worker.getWorkerId())
                                exist = true;
                        }
                        if(!exist){
                %>
                <aui:option value="<%=position.getPositionId()%>"
                            selected="<%=worker.getPositionId() == position.getPositionId()%>"><%=position.getName()%></aui:option>
                <%
                    }
                    }
                %>
            </aui:select>
            <%
                dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                date = dateFormat.parse(worker.getEmploymentDate());
                dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            %>
            <aui:input label="Дата трудоустройства" name="employmentDate" type="date" value="<%=dateFormat.format(date)%>">
                <aui:validator name="required" errorMessage="Заполните поле"/>
            </aui:input>
            <aui:input label="Номер рабочего телефона" type="text" id="numberWorkPhone" name="numberWorkPhone" value="<%=worker.getNumberWorkPhone()%>"/>
            <aui:input label="Номер мобильного телефона" type="text" id="numberHomePhone" name="numberHomePhone" value="<%=worker.getNumberHomePhone()%>"/>
            <aui:select name="bankId" label="Банк">
                <%
                    for(Bank bank : banks){
                %>
                <aui:option value="<%=bank.getBankId()%>" selected="<%=worker.getBankId() == bank.getBankId()%>"><%=bank.getName()%></aui:option>
                <%
                    }
                %>
            </aui:select>
            <aui:input name="is_archived" type="checkbox" label="Архивность" checked="<%=worker.getArchived()%>"/>
        </div>
    </div>
    <div class="control-group">
        <div class="controls">
            <aui:button type="submit" class="btn btn-primary" value="Сохранить"></aui:button>
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
