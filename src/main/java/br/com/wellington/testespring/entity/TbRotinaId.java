package br.com.wellington.testespring.entity;

import java.io.Serializable;

public class TbRotinaId implements Serializable{
	private static final long serialVersionUID = 1L;
	private int idRotina;
	private int idSistema;

	public TbRotinaId() {
		 
	}
 
	public TbRotinaId(int idRotina, int idSistema) {
		this.idRotina = idRotina;
		this.idSistema = idSistema;
	}

	public int getIdRotina() {
		return idRotina;
	}

	public int getIdSistema() {
		return idSistema;
	}

	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + idEmployee;
		return result;
	}
 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeId other = (EmployeeId) obj;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (idEmployee != other.idEmployee)
			return false;
		return true;
	}
	*/
 	
 }
