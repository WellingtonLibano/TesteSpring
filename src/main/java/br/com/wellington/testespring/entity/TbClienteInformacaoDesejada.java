package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_CLIENTE_INFORMACAO_DESEJADA database table.
 * 
 */
@Entity
@Table(name="TB_CLIENTE_INFORMACAO_DESEJADA")
@NamedQuery(name="TbClienteInformacaoDesejada.findAll", query="SELECT t FROM TbClienteInformacaoDesejada t")
public class TbClienteInformacaoDesejada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="FL_FIXA", precision=10)
	private BigDecimal flFixa;

	@Column(name="ID_CLIENTE", nullable=false)
	private int idCliente;

	@Column(name="ID_GRUPO_INFORMACOES", nullable=false)
	private int idGrupoInformacoes;

	public TbClienteInformacaoDesejada() {
	}

	public BigDecimal getFlFixa() {
		return this.flFixa;
	}

	public void setFlFixa(BigDecimal flFixa) {
		this.flFixa = flFixa;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdGrupoInformacoes() {
		return this.idGrupoInformacoes;
	}

	public void setIdGrupoInformacoes(int idGrupoInformacoes) {
		this.idGrupoInformacoes = idGrupoInformacoes;
	}

}