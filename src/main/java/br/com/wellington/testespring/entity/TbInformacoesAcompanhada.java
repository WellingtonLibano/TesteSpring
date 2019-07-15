package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_INFORMACOES_ACOMPANHADAS database table.
 * 
 */
@Entity
@Table(name="TB_INFORMACOES_ACOMPANHADAS")
@NamedQuery(name="TbInformacoesAcompanhada.findAll", query="SELECT t FROM TbInformacoesAcompanhada t")
public class TbInformacoesAcompanhada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_CARTEIRA", nullable=false)
	private int idCarteira;

	@Column(name="ID_CLIENTE", nullable=false)
	private int idCliente;

	@Column(name="ID_GRUPO_INFORMACOES", nullable=false)
	private int idGrupoInformacoes;

	public TbInformacoesAcompanhada() {
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

	public int getIdGrupoInformacoes() {
		return this.idGrupoInformacoes;
	}

	public void setIdGrupoInformacoes(int idGrupoInformacoes) {
		this.idGrupoInformacoes = idGrupoInformacoes;
	}

}