<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div class="login">
		<form action="controller" method="post" >
			<label for="email">E-mail: </label>
			<input id="email" name="email"><br>
			<label for="senha">Senha: </label>
			<input id="senha" name="senha"><br>
			<button type="submit" name="enviar" value="login">Enviar</button>
			<c:if test="${USUARIOINVALIDO}">Dados Incorretos!</c:if>
		</form>
	</div>
	
	<div class="cadastro">
		<form action="controller" method="post" >
			<label for="nome">Nome: </label>
			<input id="nome" name="nome"><br>
			<label for="email">E-mail: </label>
			<input id="email" name="email"><br>
			<label for="senha">Senha: </label>
			<input id="senha" name="senha"><br>
			<button type="submit" name="enviar" value="cadastroUsuario">Enviar</button>
		</form>
	</div>
</body>
</html>