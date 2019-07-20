package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_RATING_TIPO database table.
 * 
 */
@Entity
@Table(name="TB_RATING_TIPO")
@NamedQuery(name="TbRatingTipo.findAll", query="SELECT t FROM TbRatingTipo t")
public class TbRatingTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_RATING_TIPO", nullable=false)
	private int idRatingTipo;

	@Column(name="NM_RATING", nullable=false, length=50)
	private String nmRating;

	public TbRatingTipo() {
	}

	public int getIdRatingTipo() {
		return this.idRatingTipo;
	}

	public void setIdRatingTipo(int idRatingTipo) {
		this.idRatingTipo = idRatingTipo;
	}

	public String getNmRating() {
		return this.nmRating;
	}

	public void setNmRating(String nmRating) {
		this.nmRating = nmRating;
	}

}