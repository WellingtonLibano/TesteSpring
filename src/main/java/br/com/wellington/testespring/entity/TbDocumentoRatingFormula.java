package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TB_DOCUMENTO_RATING_FORMULA database table.
 * 
 */
@Entity
@Table(name="TB_DOCUMENTO_RATING_FORMULA")
@NamedQuery(name="TbDocumentoRatingFormula.findAll", query="SELECT t FROM TbDocumentoRatingFormula t")
public class TbDocumentoRatingFormula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_RATING", nullable=false)
	private Date dtRating;

	@Column(name="ID_DOCUMENTO", nullable=false)
	private int idDocumento;

	@Column(name="ID_FORMULA", nullable=false)
	private int idFormula;

	@Column(name="ID_RATING_CLASSIFICACAO", nullable=false)
	private int idRatingClassificacao;

	public TbDocumentoRatingFormula() {
	}

	public Date getDtRating() {
		return this.dtRating;
	}

	public void setDtRating(Date dtRating) {
		this.dtRating = dtRating;
	}

	public int getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

	public int getIdFormula() {
		return this.idFormula;
	}

	public void setIdFormula(int idFormula) {
		this.idFormula = idFormula;
	}

	public int getIdRatingClassificacao() {
		return this.idRatingClassificacao;
	}

	public void setIdRatingClassificacao(int idRatingClassificacao) {
		this.idRatingClassificacao = idRatingClassificacao;
	}

}