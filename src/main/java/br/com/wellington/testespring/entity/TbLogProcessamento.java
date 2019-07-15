package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TB_LOG_PROCESSAMENTO database table.
 * 
 */
@Entity
@Table(name="TB_LOG_PROCESSAMENTO")
@NamedQuery(name="TbLogProcessamento.findAll", query="SELECT t FROM TbLogProcessamento t")
public class TbLogProcessamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_PROCESSAMENTO", nullable=false)
	private Date dtProcessamento;

	@Column(name="ID_PROCESSAMENTO", nullable=false)
	private int idProcessamento;

	@Column(name="ID_ROTINA", nullable=false)
	private int idRotina;

	public TbLogProcessamento() {
	}

	public Date getDtProcessamento() {
		return this.dtProcessamento;
	}

	public void setDtProcessamento(Date dtProcessamento) {
		this.dtProcessamento = dtProcessamento;
	}

	public int getIdProcessamento() {
		return this.idProcessamento;
	}

	public void setIdProcessamento(int idProcessamento) {
		this.idProcessamento = idProcessamento;
	}

	public int getIdRotina() {
		return this.idRotina;
	}

	public void setIdRotina(int idRotina) {
		this.idRotina = idRotina;
	}

}