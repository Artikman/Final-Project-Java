<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Depository</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles.css">

</head>
<body>

<jsp:include page="_header.jsp" />
<jsp:include page="_menu.jsp" />

<div class="page-title">Depository</div>

<c:if test="${not empty errorMessage }">
    <div class="error-message">
            ${errorMessage}
    </div>
</c:if>

<%--@elvariable id="depositoryForm" type=""--%>
<form:form modelAttribute="depositoryForm" method="POST" enctype="multipart/form-data">
    <table style="text-align:left;">
        <tr>
            <td>Code *</td>
            <td style="color:red;">
                <c:if test="${not empty depositoryForm.depository_id}">
                    <form:hidden path="depository_id"/>
                    ${depositoryForm.depository_id}
                </c:if>
                <c:if test="${empty depositoryForm.depository_id}">
                    <form:input path="depository_id1" />
                    <form:hidden path="newGoods" />
                </c:if>
            </td>
            <td><form:errors path="code" class="error-message" /></td>
        </tr>

        <tr>
            <td>Goods *</td>
            <td><form:input path="goods" /></td>
            <td><form:errors path="goods" class="error-message" /></td>
        </tr>

        <tr>
            <td>Quantity *</td>
            <td><form:input path="quantity" /></td>
            <td><form:errors path="quantity" class="error-message" /></td>
        </tr>
        <tr>
            <td>Provider *</td>
            <td><form:input path="provider" /></td>
            <td><form:errors path="provider" class="error-message" /></td>
        </tr>

        <tr>
            <td>&nbsp;</td>
            <td><input type="submit" value="Submit" /> <input type="reset"
                                                              value="Reset" /></td>
        </tr>
    </table>
</form:form>

<jsp:include page="_footer.jsp" />

</body>
</html>