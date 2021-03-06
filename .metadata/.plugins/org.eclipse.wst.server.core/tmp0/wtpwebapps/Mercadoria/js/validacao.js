$(document).ready(function() {
	$("#formMercadoria").validate({
		// Define as regras
		rules : {
			cdMercadoria : {
				required : true,
				number : true
			},
			tpoMercadoria : {
				required : true,
				maxlength : 40
			},
			nmMercadoria : {
				required : true,
				maxlength : 40
			},
			qtdMercadoria : {
				required : true,
				number : true
			},
			vlrMercadoria : {
				required : true,
				number : true
			},
			tpoNegociacao : {
				required : true,
			}
		},
		messages : {
			cdMercadoria : {
				required : "Esse campo n&atilde;o pode ser vazio",
				number : "Este campo &eacute; num&eacute;rico"
			},
			tpoMercadoria : {
				required : "Esse campo n&atilde;o pode ser vazio",
				maxlength : "Apenas 40 caracteres"
			},
			nmMercadoria : {
				required : "Esse campo n&atilde;o pode ser vazio",
				maxlength : "Apenas 40 caracteres"
			},
			qtdMercadoria : {
				required : "Esse campo n&atilde;o pode ser vazio",
				number : "Este campo &eacute; num&eacute;rico"
			},
			vlrMercadoria : {
				required : "Esse campo n&atilde;o pode ser vazio",
				number : "Este campo &eacute; num&eacute;rico"
			},
			tpoNegociacao : {
				required : "Esse campo n&atilde;o pode ser vazio",
			}

		}
	});
});
