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

	@Id
	@Column(name="ID_SISTEMA", nullable=false)
	private int idSistema;

	@Column(name="NM_SISTEMA", nullable=false, length=50)
	private String nmSistema;

	public TbSistema() {
	}

	public int getIdSistema() {
		return this.idSistema;
	}

	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

	public String getNmSistema() {
		return this.nmSistema;
	}

	public void setNmSistema(String nmSistema) {
		this.nmSistema = nmSistema;
	}

}