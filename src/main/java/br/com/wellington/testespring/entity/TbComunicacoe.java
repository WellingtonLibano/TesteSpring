package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_COMUNICACOES database table.
 * 
 */
@Entity
@Table(name="TB_COMUNICACOES")
@NamedQuery(name="TbComunicacoe.findAll", query="SELECT t FROM TbComunicacoe t")
public class TbComunicacoe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CD_CLIENTE", nullable=false, precision=10)
	private BigDecimal cdCliente;

	@Column(name="ID_COMUNICACAO", nullable=false)
	private int idComunicacao;

	@Column(name="TP_COMUNICACAO", precision=10)
	private BigDecimal tpComunicacao;

	@Lob
	@Column(name="VL_CONTEUDO", nullable=false)
	private byte[] vlConteudo;

	public TbComunicacoe() {
	}

	public BigDecimal getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(BigDecimal cdCliente) {
		this.cdCliente = cdCliente;
	}

	public int getIdComunicacao() {
		return this.idComunicacao;
	}

	public void setIdComunicacao(int idComunicacao) {
		this.idComunicacao = idComunicacao;
	}

	public BigDecimal getTpComunicacao() {
		return this.tpComunicacao;
	}

	public void setTpComunicacao(BigDecimal tpComunicacao) {
		this.tpComunicacao = tpComunicacao;
	}

	public byte[] getVlConteudo() {
		return this.vlConteudo;
	}

	public void setVlConteudo(byte[] vlConteudo) {
		this.vlConteudo = vlConteudo;
	}

}