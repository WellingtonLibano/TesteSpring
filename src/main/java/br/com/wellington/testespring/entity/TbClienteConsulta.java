package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_CLIENTE_CONSULTAS database table.
 * 
 */
@Entity
@Table(name="TB_CLIENTE_CONSULTAS")
@NamedQuery(name="TbClienteConsulta.findAll", query="SELECT t FROM TbClienteConsulta t")
public class TbClienteConsulta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CD_CLIENTE", nullable=false, precision=10)
	private BigDecimal cdCliente;

	@Temporal(TemporalType.DATE)
	@Column(name="DH_CONSULTA", nullable=false)
	private Date dhConsulta;

	@Column(name="ID_CARTEIRA", nullable=false)
	private int idCarteira;

	@Column(name="ID_CLIENTE_CONSULTA", nullable=false)
	private int idClienteConsulta;

	@Column(name="NU_DOCUMENTO", nullable=false, precision=10)
	private BigDecimal nuDocumento;

	public TbClienteConsulta() {
	}

	public BigDecimal getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(BigDecimal cdCliente) {
		this.cdCliente = cdCliente;
	}

	public Date getDhConsulta() {
		return this.dhConsulta;
	}

	public void setDhConsulta(Date dhConsulta) {
		this.dhConsulta = dhConsulta;
	}

	public int getIdCarteira() {
		return this.idCarteira;
	}

	public void setIdCarteira(int idCarteira) {
		this.idCarteira = idCarteira;
	}

	public int getIdClienteConsulta() {
		return this.idClienteConsulta;
	}

	public void setIdClienteConsulta(int idClienteConsulta) {
		this.idClienteConsulta = idClienteConsulta;
	}

	public BigDecimal getNuDocumento() {
		return this.nuDocumento;
	}

	public void setNuDocumento(BigDecimal nuDocumento) {
		this.nuDocumento = nuDocumento;
	}

}