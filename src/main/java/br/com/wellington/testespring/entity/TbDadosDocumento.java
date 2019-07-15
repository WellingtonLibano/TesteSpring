package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TB_DADOS_DOCUMENTO database table.
 * 
 */
@Entity
@Table(name="TB_DADOS_DOCUMENTO")
@NamedQuery(name="TbDadosDocumento.findAll", query="SELECT t FROM TbDadosDocumento t")
public class TbDadosDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INFORMACAO", nullable=false)
	private Date dtInformacao;

	@Column(name="ID_DOCUMENTO", nullable=false)
	private int idDocumento;

	@Column(name="ID_MAPA", nullable=false)
	private int idMapa;

	@Column(name="VL_INFORMACAO", nullable=false, length=200)
	private String vlInformacao;

	public TbDadosDocumento() {
	}

	public Date getDtInformacao() {
		return this.dtInformacao;
	}

	public void setDtInformacao(Date dtInformacao) {
		this.dtInformacao = dtInformacao;
	}

	public int getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

	public int getIdMapa() {
		return this.idMapa;
	}

	public void setIdMapa(int idMapa) {
		this.idMapa = idMapa;
	}

	public String getVlInformacao() {
		return this.vlInformacao;
	}

	public void setVlInformacao(String vlInformacao) {
		this.vlInformacao = vlInformacao;
	}

}