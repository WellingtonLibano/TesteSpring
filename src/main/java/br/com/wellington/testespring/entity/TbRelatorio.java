package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_RELATORIOS database table.
 * 
 */
@Entity
@Table(name="TB_RELATORIOS")
@NamedQuery(name="TbRelatorio.findAll", query="SELECT t FROM TbRelatorio t")
public class TbRelatorio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DS_RELATORIO", nullable=false, length=50)
	private String dsRelatorio;

	@Id
	@Column(name="ID_RELATORIO", nullable=false)
	private int idRelatorio;

	public TbRelatorio() {
	}

	public String getDsRelatorio() {
		return this.dsRelatorio;
	}

	public void setDsRelatorio(String dsRelatorio) {
		this.dsRelatorio = dsRelatorio;
	}

	public int getIdRelatorio() {
		return this.idRelatorio;
	}

	public void setIdRelatorio(int idRelatorio) {
		this.idRelatorio = idRelatorio;
	}

}