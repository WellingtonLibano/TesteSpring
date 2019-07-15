package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
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

	@Temporal(TemporalType.DATE)
	@Column(name="DH_CONSULTA", nullable=false)
	private Date dhConsulta;

	@Column(name="ID_CARTEIRA", nullable=false)
	private int idCarteira;

	@Column(name="ID_CLIENTE", nullable=false)
	private int idCliente;

	@Column(name="ID_CLIENTE_CONSULTA", nullable=false)
	private int idClienteConsulta;

	public TbClienteConsulta() {
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

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdClienteConsulta() {
		return this.idClienteConsulta;
	}

	public void setIdClienteConsulta(int idClienteConsulta) {
		this.idClienteConsulta = idClienteConsulta;
	}

}