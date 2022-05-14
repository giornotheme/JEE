<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accueil</title>
</head>
<body>
<h1> Bienvenue sur mon site </h1>
<p> Bonjour ${empty user.username ? 'inconnu(e)' : user.username}
    vous êtes ${user.admin ? 'admin' : "un user"}</p>

<p><c:out value="test jstl"/></p>
<%@include file="footer.jsp" %>
</body>
</html>
