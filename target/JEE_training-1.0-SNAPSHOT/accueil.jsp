<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accueil</title>
</head>
<body>
<h1> Bienvenue sur mon site </h1>
<p><c:out value="Bonjour ${empty user.username ? 'inconnu(e)' : user.username}" />
    <c:out value="vous êtes ${user.admin ? 'admin' : 'un user'}" default="rien ? eh beh..."/></p>

<form method="post" action="accueil">
    <label for="nom">Nom :</label>
    <input type="text" id="nom" name="nom"/>
    <label for="pass">Password :</label>
    <input type="text" id="pass" name="pass"/>
    <input type="submit"/>
</form>
<p><c:out value="${empty authentication.result ? 'Pas connecté' : authentication.result}"/></p>

<c:if test="${!empty authentication.result}"><p><c:out value="${authentication.result}"/></p></c:if>

<%@include file="footer.jsp" %>

</body>
</html>
