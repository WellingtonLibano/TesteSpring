package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_CLIENTES database table.
 * 
 */
@Entity
@Table(name="TB_CLIENTES")
@NamedQuery(name="TbCliente.findAll", query="SELECT t FROM TbCliente t")
public class TbCliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CD_CLIENTE", nullable=false, precision=10)
	private BigDecimal cdCliente;

	@Column(name="CD_CLIENTE_MATRIZ", nullable=false, precision=10)
	private BigDecimal cdClienteMatriz;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ACEITE_ELETRONICO", nullable=false)
	private Date dtAceiteEletronico;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ALTERACAO")
	private Date dtAlteracao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_INCLUSAO", nullable=false)
	private Date dtInclusao;

	@Column(name="FL_ATIVO", precision=10)
	private BigDecimal flAtivo;

	public TbCliente() {
	}

	public BigDecimal getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(BigDecimal cdCliente) {
		this.cdCliente = cdCliente;
	}

	public BigDecimal getCdClienteMatriz() {
		return this.cdClienteMatriz;
	}

	public void setCdClienteMatriz(BigDecimal cdClienteMatriz) {
		this.cdClienteMatriz = cdClienteMatriz;
	}

	public Date getDtAceiteEletronico() {
		return this.dtAceiteEletronico;
	}

	public void setDtAceiteEletronico(Date dtAceiteEletronico) {
		this.dtAceiteEletronico = dtAceiteEletronico;
	}

	public Date getDtAlteracao() {
		return this.dtAlteracao;
	}

	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public Date getDtInclusao() {
		return this.dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public BigDecimal getFlAtivo() {
		return this.flAtivo;
	}

	public void setFlAtivo(BigDecimal flAtivo) {
		this.flAtivo = flAtivo;
	}

}