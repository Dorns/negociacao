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

	@Column(name = "DS_TIPO")
	private String tipo;

	@Column(name = "NM_NOME")
	private String nome;

	@Column(name = "NR_QTD")
	private int qtd;

	@Column(name = "VL_PRECO")
	private float preco;

	@Column(name = "NR_TIPO_NEGOC")
	private TipoNegocio tipoNegocio;

	public Mercadoria() {
		super();
	}

	public Mercadoria(int codigo, String tipo, String nome, int qtd, float preco, TipoNegocio tipoNegocio) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
		this.tipoNegocio = tipoNegocio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public TipoNegocio getTipoNegocio() {
		return tipoNegocio;
	}

	public void setTipoNegocio(TipoNegocio tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

}