package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_CLIENTE_EMAILS database table.
 * 
 */
@Entity
@Table(name="TB_CLIENTE_EMAILS")
@NamedQuery(name="TbClienteEmail.findAll", query="SELECT t FROM TbClienteEmail t")
public class TbClienteEmail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DS_EMAIL", nullable=false, length=100)
	private String dsEmail;

	@Column(name="ID_CLIENTE", nullable=false)
	private int idCliente;

	public TbClienteEmail() {
	}

	public String getDsEmail() {
		return this.dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

}