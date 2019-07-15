package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_DADOS_FORMULAS database table.
 * 
 */
@Entity
@Table(name="TB_DADOS_FORMULAS")
@NamedQuery(name="TbDadosFormula.findAll", query="SELECT t FROM TbDadosFormula t")
public class TbDadosFormula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_FORMULA", nullable=false)
	private int idFormula;

	@Column(name="ID_MAPA", nullable=false)
	private int idMapa;

	public TbDadosFormula() {
	}

	public int getIdFormula() {
		return this.idFormula;
	}

	public void setIdFormula(int idFormula) {
		this.idFormula = idFormula;
	}

	public int getIdMapa() {
		return this.idMapa;
	}

	public void setIdMapa(int idMapa) {
		this.idMapa = idMapa;
	}

}