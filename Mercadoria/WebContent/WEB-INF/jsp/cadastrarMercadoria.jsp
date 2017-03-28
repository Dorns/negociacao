<div class="container">
	<form id="formMercadoria" method="post"
		action="ServletMercadoria?origem=cadastroNegoc">
		<div class="form-group">
			<label for="codigoMercadoria">C�digo da Marcadoria:</label> <input
				type="text" class="form-control" id="cdMercadoria"
				name="cdMercadoria">
		</div>
		<div class="form-group">
			<label for="tipoMercadoria">Tipo de Mercadoria:</label> <input
				type="text" class="form-control" id="tpoMercadoria"
				name="tpoMercadoria">
		</div>
		<div class="form-group">
			<label for="nomeMercadoria">Nome da Mercadoria:</label> <input
				type="text" class="form-control" id="nmMercadoria"
				name="nmMercadoria">
		</div>
		<div class="form-group">
			<label for="quantidadeMercadoria">Quantidade:</label> <input
				type="text" class="form-control" id="qtdMercadoria"
				name="qtdMercadoria">
		</div>
		<div class="form-group">
			<label for="valorMercadoria">Valor:</label> <input type="text"
				class="form-control" id="vlrMercadoria" name="vlrMercadoria">
		</div>
		<div class="form-group">
			<label for="tipoNegociacao">Tipo de Negocia��o:</label> <select
				class="form-control" id="tpoNegociacao" name="tpoNegociacao">
				<option value="compra">Compra</option>
				<option value="venda">Venda</option>
			</select>
		</div>
		<button type="submit" class="btn btn-default">Cadastrar</button>
		<span id="msg"></span>
	</form>
</div>