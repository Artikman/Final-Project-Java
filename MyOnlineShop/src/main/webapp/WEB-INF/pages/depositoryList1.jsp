<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Depository List</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles.css">

</head>
<body>

<jsp:include page="_header.jsp" />
<jsp:include page="_menu.jsp" />

<fmt:setLocale value="en_US" scope="session"/>

<div class="page-title">Depository List</div>

<c:forEach items="${paginationProducts.list}" var="depositoryInfo">
    <div class="product-preview-container">
            <li>Code: ${depositoryInfo.depository_id}</li>
            <li>Goods: ${depositoryInfo.goods}</li>
            <li>Quantity: ${depositoryInfo.quantity}</li>
            <li>Provider: ${depositoryInfo.provider}</li>
            <security:authorize  access="hasRole('ROLE_ADMIN')">
                <li><a style="color:red;"
                       href="${pageContext.request.contextPath}/depositoryDelete?code=${depositoryInfo.depository_id}">
                    Delete Product</a></li>
            </security:authorize>
        </ul>
    </div>

</c:forEach>
<br/>


<c:if test="${paginationProducts.totalPages > 1}">
    <div class="page-navigator">
        <c:forEach items="${paginationProducts.navigationPages}" var = "page">
            <c:if test="${page != -1 }">
                <a href="depositoryList1?page=${page}" class="nav-item">${page}</a>
            </c:if>
            <c:if test="${page == -1 }">
                <span class="nav-item"> ... </span>
            </c:if>
        </c:forEach>

    </div>

</c:if>

<li><a style="color:red;"
       href="${pageContext.request.contextPath}/?code">
    Back</a></li>

<jsp:include page="_footer.jsp" />

</body>
</html>