<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<div class="menu-container">

    <a href="${pageContext.request.contextPath}/">Home</a>
    |
    <a href="${pageContext.request.contextPath}/productList">
        Product List
    </a>
    |
    <a href="${pageContext.request.contextPath}/depositoryList1">
        My Depository
    </a>
    |
    <a href="${pageContext.request.contextPath}/shoppingCart">
        My Basket
    </a>
    |
    <security:authorize  access="hasAnyRole('ROLE_ADMIN','ROLE_USER')">
        <a href="${pageContext.request.contextPath}/orderList">
            Order List
        </a>
        |
    </security:authorize>

    <security:authorize  access="hasRole('ROLE_ADMIN')">
        <a href="${pageContext.request.contextPath}/product">
            Add Product
        </a>
        |
    </security:authorize>

</div>