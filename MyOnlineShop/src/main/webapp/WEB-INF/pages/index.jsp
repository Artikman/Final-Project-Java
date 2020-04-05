<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <title>Fashion World</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles.css">

</head>
<body>


<jsp:include page="_header.jsp" />

<div class="page-title">Online Shop</div>

<div class="demo-container">
    <h2>Important Information</h2>

    <ul>
        <li>The Law on the Protection of Consumer Rights and the Rules for the Sale
            of Goods during Retail Sales on Samples requires that the following
            information be indicated for each product unt he online store: product
            name, product description,price, warranty period, information about the
            consumer and manufacturer, certificate.
        </li>
    </ul>
</div>


<jsp:include page="_footer.jsp" />

</body>
</html>