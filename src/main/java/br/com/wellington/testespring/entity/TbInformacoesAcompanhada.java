package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_INFORMACOES_ACOMPANHADAS database table.
 * 
 */
@Entity
@Table(name="TB_INFORMACOES_ACOMPANHADAS")
@NamedQuery(name="TbInformacoesAcompanhada.findAll", query="SELECT t FROM TbInformacoesAcompanhada t")
public class TbInformacoesAcompanhada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CD_CLIENTE", nullable=false, precision=10)
	private BigDecimal cdCliente;

	@Column(name="ID_CARTEIRA", nullable=false)
	private int idCarteira;

	@Column(name="ID_GRUPO_INFORMACOES", nullable=false)
	private int idGrupoInformacoes;

	@Column(name="NU_DOCUMENTO", nullable=false, precision=10)
	private BigDecimal nuDocumento;

	public TbInformacoesAcompanhada() {
	}

	public BigDecimal getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(BigDecimal cdCliente) {
		this.cdCliente = cdCliente;
	}

	public int getIdCarteira() {
		return this.idCarteira;
	}

	public void setIdCarteira(int idCarteira) {
		this.idCarteira = idCarteira;
	}

	public int getIdGrupoInformacoes() {
		return this.idGrupoInformacoes;
	}

	public void setIdGrupoInformacoes(int idGrupoInformacoes) {
		this.idGrupoInformacoes = idGrupoInformacoes;
	}

	public BigDecimal getNuDocumento() {
		return this.nuDocumento;
	}

	public void setNuDocumento(BigDecimal nuDocumento) {
		this.nuDocumento = nuDocumento;
	}

}