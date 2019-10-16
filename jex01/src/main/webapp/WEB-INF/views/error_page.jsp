<%--
  Created by IntelliJ IDEA.
  User: Hong Ji Hun
  Date: 2019-10-16
  Time: 오후 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hong Ji Hun
  Date: 2019-10-16
  Time: 오후 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h4><c:out value="${exception.getMessage()}"></c:out></h4>

<ul>
    <c:forEach items="${exception.getStackTrace()}" var="stack">
        <li><c:out value="${stack}"></c:out></li>
    </c:forEach>
</ul>

</body>
</html>
