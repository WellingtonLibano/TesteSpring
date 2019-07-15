package br.com.wellington.testespring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_USUARIO database table.
 * 
 */
@Entity
@Table(name="TB_USUARIO")
@NamedQuery(name="TbUsuario.findAll", query="SELECT t FROM TbUsuario t")
public class TbUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CD_PERFIL", precision=10)
	private BigDecimal cdPerfil;

	@Column(name="CD_PERMISSAO_ACESSO", precision=10)
	private BigDecimal cdPermissaoAcesso;

	@Column(name="DS_CORREIO_ELETRONICO", nullable=false, length=150)
	private String dsCorreioEletronico;

	@Column(name="DS_USUARIO_REDE", nullable=false, length=100)
	private String dsUsuarioRede;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_EXPIRACAO", nullable=false)
	private Date dtExpiracao;

	@Column(name="FL_ACESSO_DOMINGO", precision=10)
	private BigDecimal flAcessoDomingo;

	@Column(name="FL_ACESSO_QUARTA", precision=10)
	private BigDecimal flAcessoQuarta;

	@Column(name="FL_ACESSO_QUINTA", precision=10)
	private BigDecimal flAcessoQuinta;

	@Column(name="FL_ACESSO_SABADO", precision=10)
	private BigDecimal flAcessoSabado;

	@Column(name="FL_ACESSO_SEGUNDA", precision=10)
	private BigDecimal flAcessoSegunda;

	@Column(name="FL_ACESSO_SEXTA", precision=10)
	private BigDecimal flAcessoSexta;

	@Column(name="FL_ACESSO_TERCA", precision=10)
	private BigDecimal flAcessoTerca;

	@Id
	@Column(name="ID_USUARIO", nullable=false)
	private int idUsuario;

	@Column(name="NM_USUARIO", nullable=false, length=100)
	private String nmUsuario;

	public TbUsuario() {
	}

	public BigDecimal getCdPerfil() {
		return this.cdPerfil;
	}

	public void setCdPerfil(BigDecimal cdPerfil) {
		this.cdPerfil = cdPerfil;
	}

	public BigDecimal getCdPermissaoAcesso() {
		return this.cdPermissaoAcesso;
	}

	public void setCdPermissaoAcesso(BigDecimal cdPermissaoAcesso) {
		this.cdPermissaoAcesso = cdPermissaoAcesso;
	}

	public String getDsCorreioEletronico() {
		return this.dsCorreioEletronico;
	}

	public void setDsCorreioEletronico(String dsCorreioEletronico) {
		this.dsCorreioEletronico = dsCorreioEletronico;
	}

	public String getDsUsuarioRede() {
		return this.dsUsuarioRede;
	}

	public void setDsUsuarioRede(String dsUsuarioRede) {
		this.dsUsuarioRede = dsUsuarioRede;
	}

	public Date getDtExpiracao() {
		return this.dtExpiracao;
	}

	public void setDtExpiracao(Date dtExpiracao) {
		this.dtExpiracao = dtExpiracao;
	}

	public BigDecimal getFlAcessoDomingo() {
		return this.flAcessoDomingo;
	}

	public void setFlAcessoDomingo(BigDecimal flAcessoDomingo) {
		this.flAcessoDomingo = flAcessoDomingo;
	}

	public BigDecimal getFlAcessoQuarta() {
		return this.flAcessoQuarta;
	}

	public void setFlAcessoQuarta(BigDecimal flAcessoQuarta) {
		this.flAcessoQuarta = flAcessoQuarta;
	}

	public BigDecimal getFlAcessoQuinta() {
		return this.flAcessoQuinta;
	}

	public void setFlAcessoQuinta(BigDecimal flAcessoQuinta) {
		this.flAcessoQuinta = flAcessoQuinta;
	}

	public BigDecimal getFlAcessoSabado() {
		return this.flAcessoSabado;
	}

	public void setFlAcessoSabado(BigDecimal flAcessoSabado) {
		this.flAcessoSabado = flAcessoSabado;
	}

	public BigDecimal getFlAcessoSegunda() {
		return this.flAcessoSegunda;
	}

	public void setFlAcessoSegunda(BigDecimal flAcessoSegunda) {
		this.flAcessoSegunda = flAcessoSegunda;
	}

	public BigDecimal getFlAcessoSexta() {
		return this.flAcessoSexta;
	}

	public void setFlAcessoSexta(BigDecimal flAcessoSexta) {
		this.flAcessoSexta = flAcessoSexta;
	}

	public BigDecimal getFlAcessoTerca() {
		return this.flAcessoTerca;
	}

	public void setFlAcessoTerca(BigDecimal flAcessoTerca) {
		this.flAcessoTerca = flAcessoTerca;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNmUsuario() {
		return this.nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

}