package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_SISTEMA database table.
 * 
 */
@Entity
@Table(name="TB_SISTEMA")
@NamedQuery(name="TbSistema.findAll", query="SELECT t FROM TbSistema t")
public class TbSistema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DS_SISTEMA", nullable=false, length=50)
	private String dsSistema;

	@Column(name="ID_SISTEMA", nullable=false)
	private int idSistema;

	public TbSistema() {
	}

	public String getDsSistema() {
		return this.dsSistema;
	}

	public void setDsSistema(String dsSistema) {
		this.dsSistema = dsSistema;
	}

	public int getIdSistema() {
		return this.idSistema;
	}

	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

}