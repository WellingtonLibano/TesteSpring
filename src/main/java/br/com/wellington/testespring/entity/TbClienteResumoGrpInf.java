package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_CLIENTE_RESUMO_GRP_INF database table.
 * 
 */
@Entity
@Table(name="TB_CLIENTE_RESUMO_GRP_INF")
@NamedQuery(name="TbClienteResumoGrpInf.findAll", query="SELECT t FROM TbClienteResumoGrpInf t")
public class TbClienteResumoGrpInf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_CLIENTE_RESUMO", nullable=false)
	private int idClienteResumo;

	@Column(name="ID_GRUPO_INFORMACOES", nullable=false)
	private int idGrupoInformacoes;

	@Column(name="QTD_TOTAL", nullable=false, precision=10)
	private BigDecimal qtdTotal;

	public TbClienteResumoGrpInf() {
	}

	public int getIdClienteResumo() {
		return this.idClienteResumo;
	}

	public void setIdClienteResumo(int idClienteResumo) {
		this.idClienteResumo = idClienteResumo;
	}

	public int getIdGrupoInformacoes() {
		return this.idGrupoInformacoes;
	}

	public void setIdGrupoInformacoes(int idGrupoInformacoes) {
		this.idGrupoInformacoes = idGrupoInformacoes;
	}

	public BigDecimal getQtdTotal() {
		return this.qtdTotal;
	}

	public void setQtdTotal(BigDecimal qtdTotal) {
		this.qtdTotal = qtdTotal;
	}

}