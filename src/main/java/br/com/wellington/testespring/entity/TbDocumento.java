package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="TB_DOCUMENTOS")
@NamedQuery(name="TbDocumento.findAll", query="SELECT t FROM TbDocumento t")
public class TbDocumento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name="DS_NOME", nullable=false, length=200)
	private String dsNome;

	@Id
	@Column(name="ID_DOCUMENTO", nullable=false)
	private int idDocumento;

	@Column(name="NU_DOCUMENTO", nullable=false, precision=10)
	private BigDecimal nuDocumento;

	@Column(name="TP_PESSOA", precision=10)
	private BigDecimal tpPessoa;

	public TbDocumento() {
	}

	public String getDsNome() {
		return this.dsNome;
	}

	public void setDsNome(String dsNome) {
		this.dsNome = dsNome;
	}

	public int getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

	public BigDecimal getNuDocumento() {
		return this.nuDocumento;
	}

	public void setNuDocumento(BigDecimal nuDocumento) {
		this.nuDocumento = nuDocumento;
	}

	public BigDecimal getTpPessoa() {
		return this.tpPessoa;
	}

	public void setTpPessoa(BigDecimal tpPessoa) {
		this.tpPessoa = tpPessoa;
	}

}