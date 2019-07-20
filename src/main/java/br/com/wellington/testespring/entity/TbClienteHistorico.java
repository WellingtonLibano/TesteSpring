package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_CLIENTE_HISTORICO database table.
 * 
 */
@Entity
@Table(name="TB_CLIENTE_HISTORICO")
@NamedQuery(name="TbClienteHistorico.findAll", query="SELECT t FROM TbClienteHistorico t")
public class TbClienteHistorico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CD_CLIENTE", nullable=false, precision=10)
	private BigDecimal cdCliente;

	@Column(name="DS_COLUNA_ALTERADA", nullable=false, length=50)
	private String dsColunaAlterada;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ALTERACAO", nullable=false)
	private Date dtAlteracao;

	@Column(name="VL_ANTIGO", nullable=false, length=150)
	private String vlAntigo;

	@Column(name="VL_NOVO", nullable=false, length=150)
	private String vlNovo;

	public TbClienteHistorico() {
	}

	public BigDecimal getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(BigDecimal cdCliente) {
		this.cdCliente = cdCliente;
	}

	public String getDsColunaAlterada() {
		return this.dsColunaAlterada;
	}

	public void setDsColunaAlterada(String dsColunaAlterada) {
		this.dsColunaAlterada = dsColunaAlterada;
	}

	public Date getDtAlteracao() {
		return this.dtAlteracao;
	}

	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public String getVlAntigo() {
		return this.vlAntigo;
	}

	public void setVlAntigo(String vlAntigo) {
		this.vlAntigo = vlAntigo;
	}

	public String getVlNovo() {
		return this.vlNovo;
	}

	public void setVlNovo(String vlNovo) {
		this.vlNovo = vlNovo;
	}

}