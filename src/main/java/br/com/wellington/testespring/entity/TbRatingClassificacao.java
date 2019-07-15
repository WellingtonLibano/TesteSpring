package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_RATING_CLASSIFICACAO database table.
 * 
 */
@Entity
@Table(name="TB_RATING_CLASSIFICACAO")
@NamedQuery(name="TbRatingClassificacao.findAll", query="SELECT t FROM TbRatingClassificacao t")
public class TbRatingClassificacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CD_RATING", nullable=false, length=3)
	private String cdRating;

	@Column(name="DS_RATING", nullable=false, length=200)
	private String dsRating;

	@Column(name="ID_RATING_CLASSIFICACAO", nullable=false)
	private int idRatingClassificacao;

	@Column(name="ID_RATING_TIPO", nullable=false)
	private int idRatingTipo;

	public TbRatingClassificacao() {
	}

	public String getCdRating() {
		return this.cdRating;
	}

	public void setCdRating(String cdRating) {
		this.cdRating = cdRating;
	}

	public String getDsRating() {
		return this.dsRating;
	}

	public void setDsRating(String dsRating) {
		this.dsRating = dsRating;
	}

	public int getIdRatingClassificacao() {
		return this.idRatingClassificacao;
	}

	public void setIdRatingClassificacao(int idRatingClassificacao) {
		this.idRatingClassificacao = idRatingClassificacao;
	}

	public int getIdRatingTipo() {
		return this.idRatingTipo;
	}

	public void setIdRatingTipo(int idRatingTipo) {
		this.idRatingTipo = idRatingTipo;
	}

}