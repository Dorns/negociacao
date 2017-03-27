package br.com.mercadorias.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MERCADORIA")
@SequenceGenerator(name = "seqMercadoria", sequenceName = "SQ_TB_MERCADORIA", allocationSize = 1)
public class Mercadoria {
	
	@Id
	@Column(name = "CD_MERCADORIA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqMercadoria")
	private int codigo;
	
	@Column(name="DS_TIPO") 
	private String tipo;

	@Column(name="NM_NOME")
	private String nome;
	
	@Column(name="NR_QTD")
	private int qtd;
	
	@Column(name="VL_PRECO")
	private float preco; 	
	
	@Column(name="NR_TIPO_NEGOC")
	private TipoNegocio tipoNegocio;
}