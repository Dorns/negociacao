<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="table-responsive">
	<table class="table">
		<tr>
			<th>Codigo</th>
			<th>Tipo de Mercadoria</th>
			<th>Nome da Mercadoria</th>
			<th>Quantidade</th>
			<th>Preco</th>
			<th>Tipo de Negocio</th>
		</tr>
		<c:forEach var="operacoes" items="${objOper}" varStatus="id">
			<tr>
				<td>${operacoes.codigo}</td>
				<td>${operacoes.tipo}</td>
				<td>${operacoes.nome}</td>
				<td>${operacoes.qtd}</td>
				<td>${operacoes.preco}</td>
				<td>${operacoes.tipoNegocio}</td>
			</tr>
		</c:forEach>
	</table>
</div>
