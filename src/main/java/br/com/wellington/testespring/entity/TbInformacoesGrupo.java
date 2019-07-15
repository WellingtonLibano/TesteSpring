package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_INFORMACOES_GRUPO database table.
 * 
 */
@Entity
@Table(name="TB_INFORMACOES_GRUPO")
@NamedQuery(name="TbInformacoesGrupo.findAll", query="SELECT t FROM TbInformacoesGrupo t")
public class TbInformacoesGrupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DS_GRUPO_INFORMACOES", nullable=false, length=50)
	private String dsGrupoInformacoes;

	@Column(name="ID_GRUPO_INFORMACOES", nullable=false)
	private int idGrupoInformacoes;

	public TbInformacoesGrupo() {
	}

	public String getDsGrupoInformacoes() {
		return this.dsGrupoInformacoes;
	}

	public void setDsGrupoInformacoes(String dsGrupoInformacoes) {
		this.dsGrupoInformacoes = dsGrupoInformacoes;
	}

	public int getIdGrupoInformacoes() {
		return this.idGrupoInformacoes;
	}

	public void setIdGrupoInformacoes(int idGrupoInformacoes) {
		this.idGrupoInformacoes = idGrupoInformacoes;
	}

}