<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Account</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles.css">

</head>
<body>

<jsp:include page="_header.jsp" />

<div class="page-title">Create new account</div>

<h3>Enter information on user</h3>
<br>

<c:if test="${not empty errorMessage }">
    <div class="error-message">
            ${errorMessage}
    </div>
</c:if>

<%--@elvariable id="userForm" type=""--%>
<form:form modelAttribute="userForm" method="POST" enctype="multipart/form-data">
    <table style="text-align:center;">

        <tr>
            <td>USERNAME *</td>
            <td><form:input path="userName" /></td>
            <td><form:errors path="userName" class="error-message" /></td>
        </tr>

        <tr>
            <td>PASSWORD *</td>
            <td><form:input type = "password" path="password"/>
            <td><form:errors path="password" class="error-message" /></td>
        </tr>
        <tr>
            <td>ACTIVE *</td>
            <td><form:input path="active" /></td>
            <td><form:errors path="active" class="error-message" /></td>
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