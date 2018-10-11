<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sistema de Controle de Gastos</title>
</head>
<body>
	
	<%@include file="sessionless.jsp" %>
	
	<div class="principal" >
	
		<div class="painel">
			
			<h2>Gastos</h2>

			<c:if test="${not empty LISTAGASTO}">
			<div class="mostraGasto">
				<ul class="valorGasto">
					<c:forEach var="gasto" items="${LISTAGASTO.values()}">
						<li>${gasto.getValorGasto() }</li>
					</c:forEach>
				</ul>
				<ul class="descricao">
					<c:forEach var="gasto" items="${LISTAGASTO.values()}">
						<li>${gasto.getDescricao() }</li>
					</c:forEach>
				</ul>
				<ul class="data">
					<c:forEach var="gasto" items="${LISTAGASTO.values()}">
						<li>${gasto.getData() }</li>
					</c:forEach>
				</ul>
			</div>
			</c:if>
			<c:if test="${empty LISTAGASTO}"><h3>Sem gastos</h3></c:if>
		</div>
		
		<div class="conta">
		<h2>Conta</h2>
			<c:if test="${not empty CONTA }">
				<label for="salarioAtual">Salario Atual: </label><h3>${CONTA.values().getSalarioAtual() }</h3>
				<label for="valorConta">Conta Atual: </label> <h3>${CONTA.values().getValorConta() }</h3>
				<label for="gastoTotal">Gasto Total: </label> <h3>${CONTA.values().getGastoTotal() }</h3>
			</c:if>
			<c:if test="${empty CONTA }"><h3>Sem dados de conta</h3></c:if>
		</div>
		
		<div class="adicionaGasto">
			
			<form action="controller" method="post" >
				<label for="valorGasto">Gasto: </label>
				<input id="valorGasto" name="valorGasto"  /> <br>
				<label for="descricao">Descrição: </label>
				<input id="descricao" name="descricao"  /> <br>
				<button type="submit" name="enviar" value="adicionaGasto" >Enviar</button>
			</form>
			
		</div>
		<div class="adicionaValor">
			<form action="controller" method="post" >
				<label for="addValor" >Adicionar Valor: </label>
				<input id="addValor" name="addValor" /><br>
				<button type="submit" name="enviar" value="adicionaValor" >Enviar</button>
				
			</form>
		</div>
	</div>
	
	
</body>
</html>