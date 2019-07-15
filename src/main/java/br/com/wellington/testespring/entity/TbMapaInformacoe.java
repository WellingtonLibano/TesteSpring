package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_MAPA_INFORMACOES database table.
 * 
 */
@Entity
@Table(name="TB_MAPA_INFORMACOES")
@NamedQuery(name="TbMapaInformacoe.findAll", query="SELECT t FROM TbMapaInformacoe t")
public class TbMapaInformacoe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_GRUPO_INFORMACOES", nullable=false)
	private int idGrupoInformacoes;

	@Column(name="ID_MAPA_INFORMACOES", nullable=false)
	private int idMapaInformacoes;

	@Column(name="NM_INFORMACAO_ENTRADA", nullable=false, length=30)
	private String nmInformacaoEntrada;

	@Column(name="NM_INFORMACAO_SISTEMA", nullable=false, length=30)
	private String nmInformacaoSistema;

	public TbMapaInformacoe() {
	}

	public int getIdGrupoInformacoes() {
		return this.idGrupoInformacoes;
	}

	public void setIdGrupoInformacoes(int idGrupoInformacoes) {
		this.idGrupoInformacoes = idGrupoInformacoes;
	}

	public int getIdMapaInformacoes() {
		return this.idMapaInformacoes;
	}

	public void setIdMapaInformacoes(int idMapaInformacoes) {
		this.idMapaInformacoes = idMapaInformacoes;
	}

	public String getNmInformacaoEntrada() {
		return this.nmInformacaoEntrada;
	}

	public void setNmInformacaoEntrada(String nmInformacaoEntrada) {
		this.nmInformacaoEntrada = nmInformacaoEntrada;
	}

	public String getNmInformacaoSistema() {
		return this.nmInformacaoSistema;
	}

	public void setNmInformacaoSistema(String nmInformacaoSistema) {
		this.nmInformacaoSistema = nmInformacaoSistema;
	}

}