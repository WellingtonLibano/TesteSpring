package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_CLIENTE_TELEFONES database table.
 * 
 */
@Entity
@Table(name="TB_CLIENTE_TELEFONES")
@NamedQuery(name="TbClienteTelefone.findAll", query="SELECT t FROM TbClienteTelefone t")
public class TbClienteTelefone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CD_CLIENTE", nullable=false, precision=10)
	private BigDecimal cdCliente;

	@Column(name="NU_DDD", nullable=false, precision=10)
	private BigDecimal nuDdd;

	@Column(name="NU_TELEFONE", nullable=false, precision=10)
	private BigDecimal nuTelefone;

	public TbClienteTelefone() {
	}

	public BigDecimal getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(BigDecimal cdCliente) {
		this.cdCliente = cdCliente;
	}

	public BigDecimal getNuDdd() {
		return this.nuDdd;
	}

	public void setNuDdd(BigDecimal nuDdd) {
		this.nuDdd = nuDdd;
	}

	public BigDecimal getNuTelefone() {
		return this.nuTelefone;
	}

	public void setNuTelefone(BigDecimal nuTelefone) {
		this.nuTelefone = nuTelefone;
	}

}