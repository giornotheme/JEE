<%--
  Created by IntelliJ IDEA.
  User: vtang
  Date: 14/05/2022
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accueil</title>
</head>
<body>
<h1> Bienvenue sur mon site </h1>
<p> Bonjour ${empty username ? 'inconnu(e)' : username} vous êtes ${statut}</p>
<%@include file="footer.jsp" %>
</body>
</html>
