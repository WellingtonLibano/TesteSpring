package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_FORMULAS database table.
 * 
 */
@Entity
@Table(name="TB_FORMULAS")
@NamedQuery(name="TbFormula.findAll", query="SELECT t FROM TbFormula t")
public class TbFormula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DS_FORMULA", length=150)
	private String dsFormula;

	@Column(name="ID_FORMULA", nullable=false)
	private int idFormula;

	@Column(name="ID_TIPO_RATING", nullable=false)
	private int idTipoRating;

	@Column(name="NM_FORMULA", length=50)
	private String nmFormula;

	public TbFormula() {
	}

	public String getDsFormula() {
		return this.dsFormula;
	}

	public void setDsFormula(String dsFormula) {
		this.dsFormula = dsFormula;
	}

	public int getIdFormula() {
		return this.idFormula;
	}

	public void setIdFormula(int idFormula) {
		this.idFormula = idFormula;
	}

	public int getIdTipoRating() {
		return this.idTipoRating;
	}

	public void setIdTipoRating(int idTipoRating) {
		this.idTipoRating = idTipoRating;
	}

	public String getNmFormula() {
		return this.nmFormula;
	}

	public void setNmFormula(String nmFormula) {
		this.nmFormula = nmFormula;
	}

}