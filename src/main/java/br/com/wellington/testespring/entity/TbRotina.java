package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_ROTINA database table.
 * 
 */
@Entity
@Table(name="TB_ROTINA")
@NamedQuery(name="TbRotina.findAll", query="SELECT t FROM TbRotina t")
public class TbRotina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DS_ROTINA", nullable=false, length=150)
	private String dsRotina;

	@Column(name="ID_ROTINA", nullable=false)
	private int idRotina;

	@Column(name="ID_SISTEMA", nullable=false)
	private int idSistema;

	public TbRotina() {
	}

	public String getDsRotina() {
		return this.dsRotina;
	}

	public void setDsRotina(String dsRotina) {
		this.dsRotina = dsRotina;
	}

	public int getIdRotina() {
		return this.idRotina;
	}

	public void setIdRotina(int idRotina) {
		this.idRotina = idRotina;
	}

	public int getIdSistema() {
		return this.idSistema;
	}

	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

}