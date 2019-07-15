package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
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

	@Column(name="DS_COLUNA_ALTERADA", nullable=false, length=50)
	private String dsColunaAlterada;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ALTERACAO", nullable=false)
	private Date dtAlteracao;

	@Column(name="ID_CLIENTE", nullable=false)
	private int idCliente;

	@Column(name="ID_CLIENTE_ALTERACAO")
	private int idClienteAlteracao;

	@Column(name="VL_ANTIGO", nullable=false, length=150)
	private String vlAntigo;

	@Column(name="VL_NOVO", nullable=false, length=150)
	private String vlNovo;

	public TbClienteHistorico() {
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

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdClienteAlteracao() {
		return this.idClienteAlteracao;
	}

	public void setIdClienteAlteracao(int idClienteAlteracao) {
		this.idClienteAlteracao = idClienteAlteracao;
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