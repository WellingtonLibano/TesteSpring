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

	@Column(name="CD_CLIENTE", nullable=false, precision=10)
	private BigDecimal cdCliente;

	@Column(name="ID_GRUPO_INFORMACOES", nullable=false)
	private int idGrupoInformacoes;

	@Column(name="ID_PROCESSAMENTO", nullable=false)
	private int idProcessamento;

	@Column(name="QT_TOTAL", nullable=false, precision=10)
	private BigDecimal qtTotal;

	public TbClienteResumoGrpInf() {
	}

	public BigDecimal getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(BigDecimal cdCliente) {
		this.cdCliente = cdCliente;
	}

	public int getIdGrupoInformacoes() {
		return this.idGrupoInformacoes;
	}

	public void setIdGrupoInformacoes(int idGrupoInformacoes) {
		this.idGrupoInformacoes = idGrupoInformacoes;
	}

	public int getIdProcessamento() {
		return this.idProcessamento;
	}

	public void setIdProcessamento(int idProcessamento) {
		this.idProcessamento = idProcessamento;
	}

	public BigDecimal getQtTotal() {
		return this.qtTotal;
	}

	public void setQtTotal(BigDecimal qtTotal) {
		this.qtTotal = qtTotal;
	}

}