package br.com.wellington.testespring.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the TB_CARTEIRA_DOCUMENTOS database table.
 * 
 */
@Entity
@IdClass(TbCarteiraDocumentoId.class)
@Table(name="TB_CARTEIRA_DOCUMENTOS")
@NamedQuery(name="TbCarteiraDocumento.findAll", query="SELECT t FROM TbCarteiraDocumento t")
public class TbCarteiraDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CARTEIRA", nullable=false)
	private int idCarteira;

	@Id
	@Column(name="ID_CLIENTE", nullable=false)
	private int idCliente;

	@Id
	@Column(name="ID_DOCUMENTO", nullable=false)
	private int idDocumento;

	@Column(name="CD_INTERNO_CLIENTE", length=50)
	private String cdInternoCliente;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_FINAL")
	private Date dtFinal;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INICIO", nullable=false)
	private Date dtInicio;

	@Column(name="FL_ATIVO", precision=10)
	private BigDecimal flAtivo;
	

	public TbCarteiraDocumento() {
	}

	public String getCdInternoCliente() {
		return this.cdInternoCliente;
	}

	public void setCdInternoCliente(String cdInternoCliente) {
		this.cdInternoCliente = cdInternoCliente;
	}

	public Date getDtFinal() {
		return this.dtFinal;
	}

	public void setDtFinal(Date dtFinal) {
		this.dtFinal = dtFinal;
	}

	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public BigDecimal getFlAtivo() {
		return this.flAtivo;
	}

	public void setFlAtivo(BigDecimal flAtivo) {
		this.flAtivo = flAtivo;
	}

	public int getIdCarteira() {
		return this.idCarteira;
	}

	public void setIdCarteira(int idCarteira) {
		this.idCarteira = idCarteira;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

}