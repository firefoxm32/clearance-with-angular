<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%--<spring:url value="/resources/dist/scripts/app.min.js" var="appJs" />
<spring:url value="/resources/dist/scripts/vendor.min.js" var="vendorJs" />--%>
<spring:url value="/resources/bower_components/angular/angular.min.js" var="angularJs" />

<script src="${angularJs}"></script>

<!--<script src="${vendorJs}"></script>
<script src="${appJs}"></script>-->