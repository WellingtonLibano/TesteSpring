package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_CLIENTE_OPCAO_MATRIZ database table.
 * 
 */
@Entity
@Table(name="TB_CLIENTE_OPCAO_MATRIZ")
@NamedQuery(name="TbClienteOpcaoMatriz.findAll", query="SELECT t FROM TbClienteOpcaoMatriz t")
public class TbClienteOpcaoMatriz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CD_CLIENTE", nullable=false, precision=10)
	private BigDecimal cdCliente;

	@Column(name="FL_FILIAL_ALTERA", precision=10)
	private BigDecimal flFilialAltera;

	@Column(name="FL_INCLUSAO_ACOMP", precision=10)
	private BigDecimal flInclusaoAcomp;

	@Column(name="QT_DIAS_CARENCIA", precision=10)
	private BigDecimal qtDiasCarencia;

	@Column(name="QT_DIAS_DASHBOARD", nullable=false, precision=10)
	private BigDecimal qtDiasDashboard;

	public TbClienteOpcaoMatriz() {
	}

	public BigDecimal getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(BigDecimal cdCliente) {
		this.cdCliente = cdCliente;
	}

	public BigDecimal getFlFilialAltera() {
		return this.flFilialAltera;
	}

	public void setFlFilialAltera(BigDecimal flFilialAltera) {
		this.flFilialAltera = flFilialAltera;
	}

	public BigDecimal getFlInclusaoAcomp() {
		return this.flInclusaoAcomp;
	}

	public void setFlInclusaoAcomp(BigDecimal flInclusaoAcomp) {
		this.flInclusaoAcomp = flInclusaoAcomp;
	}

	public BigDecimal getQtDiasCarencia() {
		return this.qtDiasCarencia;
	}

	public void setQtDiasCarencia(BigDecimal qtDiasCarencia) {
		this.qtDiasCarencia = qtDiasCarencia;
	}

	public BigDecimal getQtDiasDashboard() {
		return this.qtDiasDashboard;
	}

	public void setQtDiasDashboard(BigDecimal qtDiasDashboard) {
		this.qtDiasDashboard = qtDiasDashboard;
	}

}