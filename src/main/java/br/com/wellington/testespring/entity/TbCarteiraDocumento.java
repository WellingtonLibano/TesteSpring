package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_CARTEIRA_DOCUMENTOS database table.
 * 
 */
@Entity
@Table(name="TB_CARTEIRA_DOCUMENTOS")
@NamedQuery(name="TbCarteiraDocumento.findAll", query="SELECT t FROM TbCarteiraDocumento t")
public class TbCarteiraDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CD_CLIENTE", nullable=false, precision=10)
	private BigDecimal cdCliente;

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

	@Column(name="ID_CARTEIRA", nullable=false)
	private int idCarteira;

	@Column(name="NU_DOCUMENTO", nullable=false, precision=10)
	private BigDecimal nuDocumento;

	public TbCarteiraDocumento() {
	}

	public BigDecimal getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(BigDecimal cdCliente) {
		this.cdCliente = cdCliente;
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

	public BigDecimal getNuDocumento() {
		return this.nuDocumento;
	}

	public void setNuDocumento(BigDecimal nuDocumento) {
		this.nuDocumento = nuDocumento;
	}

}