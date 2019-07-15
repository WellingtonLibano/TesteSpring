package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_CLIENTE_CARTEIRAS database table.
 * 
 */
@Entity
@Table(name="TB_CLIENTE_CARTEIRAS")
@NamedQuery(name="TbClienteCarteira.findAll", query="SELECT t FROM TbClienteCarteira t")
public class TbClienteCarteira implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_CLIENTE", nullable=false)
	private int idCliente;

	@Column(name="ID_CLIENTE_CARTEIRA", nullable=false)
	private int idClienteCarteira;

	@Column(name="ID_FORMULA", nullable=false)
	private int idFormula;

	@Column(name="ID_RELATORIO", nullable=false)
	private int idRelatorio;

	public TbClienteCarteira() {
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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