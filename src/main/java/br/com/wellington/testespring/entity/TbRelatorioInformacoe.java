package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_RELATORIO_INFORMACOES database table.
 * 
 */
@Entity
@Table(name="TB_RELATORIO_INFORMACOES")
@NamedQuery(name="TbRelatorioInformacoe.findAll", query="SELECT t FROM TbRelatorioInformacoe t")
public class TbRelatorioInformacoe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_MAPA_INFORMACOES", nullable=false)
	private int idMapaInformacoes;

	@Column(name="ID_RELATORIO", nullable=false)
	private int idRelatorio;

	public TbRelatorioInformacoe() {
	}

	public int getIdMapaInformacoes() {
		return this.idMapaInformacoes;
	}

	public void setIdMapaInformacoes(int idMapaInformacoes) {
		this.idMapaInformacoes = idMapaInformacoes;
	}

	public int getIdRelatorio() {
		return this.idRelatorio;
	}

	public void setIdRelatorio(int idRelatorio) {
		this.idRelatorio = idRelatorio;
	}

}