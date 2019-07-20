package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_CLIENTE_CARTEIRAS database table.
 * 
 */
@Entity
@Table(name="TB_CLIENTE_CARTEIRAS")
@NamedQuery(name="TbClienteCarteira.findAll", query="SELECT t FROM TbClienteCarteira t")
public class TbClienteCarteira implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CD_CLIENTE", nullable=false, precision=10)
	private BigDecimal cdCliente;

	@Column(name="ID_CLIENTE_CARTEIRA", nullable=false)
	private int idClienteCarteira;

	@Column(name="ID_FORMULA", nullable=false)
	private int idFormula;

	@Column(name="ID_RELATORIO", nullable=false)
	private int idRelatorio;

	public TbClienteCarteira() {
	}

	public BigDecimal getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(BigDecimal cdCliente) {
		this.cdCliente = cdCliente;
	}

	public int getIdClienteCarteira() {
		return this.idClienteCarteira;
	}

	public void setIdClienteCarteira(int idClienteCarteira) {
		this.idClienteCarteira = idClienteCarteira;
	}

	public int getIdFormula() {
		return this.idFormula;
	}

	public void setIdFormula(int idFormula) {
		this.idFormula = idFormula;
	}

	public int getIdRelatorio() {
		return this.idRelatorio;
	}

	public void setIdRelatorio(int idRelatorio) {
		this.idRelatorio = idRelatorio;
	}

}