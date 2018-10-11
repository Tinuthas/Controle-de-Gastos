<c:if test="${(empty USUARIO) }">
  	<form method="post" name="retorno" action="controller">
  	<input type="hidden" name="enviar" value="logout" /> 
		<script type="text/javascript">
   			 document.retorno.submit();
		</script>
	</form>
</c:if>