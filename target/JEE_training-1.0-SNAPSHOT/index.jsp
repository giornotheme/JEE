<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Hello Worlddddd!</h1>
<br/>
<p>
    <%
        String variable = (String) request.getAttribute("variable");
        out.println(variable);
    %>
</p>
</body>
</html>