package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_CLIENTE_RESUMO database table.
 * 
 */
@Entity
@Table(name="TB_CLIENTE_RESUMO")
@NamedQuery(name="TbClienteResumo.findAll", query="SELECT t FROM TbClienteResumo t")
public class TbClienteResumo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_CLIENTE", nullable=false)
	private int idCliente;

	@Column(name="ID_CLIENTE_RESUMO", nullable=false)
	private int idClienteResumo;

	@Column(name="ID_PROCESSAMENTO", nullable=false)
	private int idProcessamento;

	@Column(name="QT_ACOMP_ATIVOS", nullable=false, precision=10)
	private BigDecimal qtAcompAtivos;

	@Column(name="TP_RESUMO", precision=10)
	private BigDecimal tpResumo;

	public TbClienteResumo() {
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdClienteResumo() {
		return this.idClienteResumo;
	}

	public void setIdClienteResumo(int idClienteResumo) {
		this.idClienteResumo = idClienteResumo;
	}

	public int getIdProcessamento() {
		return this.idProcessamento;
	}

	public void setIdProcessamento(int idProcessamento) {
		this.idProcessamento = idProcessamento;
	}

	public BigDecimal getQtAcompAtivos() {
		return this.qtAcompAtivos;
	}

	public void setQtAcompAtivos(BigDecimal qtAcompAtivos) {
		this.qtAcompAtivos = qtAcompAtivos;
	}

	public BigDecimal getTpResumo() {
		return this.tpResumo;
	}

	public void setTpResumo(BigDecimal tpResumo) {
		this.tpResumo = tpResumo;
	}

}