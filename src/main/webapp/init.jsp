<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />


<portlet:actionURL var="actionAddPosition" name = "actionAddPosition"/>
<portlet:actionURL var="actionEditPosition" name = "actionEditPosition"/>

<portlet:actionURL var="actionAddBank" name = "actionAddBank"/>
<portlet:actionURL var="actionEditBank" name = "actionEditBank"/>

<portlet:actionURL var="actionAddWorker" name = "actionAddWorker"/>
<portlet:actionURL var="actionEditWorker" name = "actionEditWorker"/>

<portlet:renderURL var="mainPage">
    <portlet:param name="jspPage" value="/view/mainPage.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="listPositions">
    <portlet:param name="jspPage" value="/view/list/positions.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="listBanks">
    <portlet:param name="jspPage" value="/view/list/banks.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="listWorkers">
    <portlet:param name="jspPage" value="/view/list/workers.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="addPosition">
    <portlet:param name="jspPage" value="/view/add/addPosition.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="addWorker">
    <portlet:param name="jspPage" value="/view/add/addWorker.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="addBank">
    <portlet:param name="jspPage" value="/view/add/addBank.jsp"/>
</portlet:renderURL>