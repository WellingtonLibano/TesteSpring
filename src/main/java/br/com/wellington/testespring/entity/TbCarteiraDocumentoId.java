package br.com.wellington.testespring.entity;

import java.io.Serializable;

public class TbCarteiraDocumentoId implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idCarteira;
	private int idCliente;
	private int idDocumento;
	
	public TbCarteiraDocumentoId() {
		
	}

	public TbCarteiraDocumentoId( int idCarteira, int idCliente, int idDocumento){
		this.idCarteira = idCarteira;
		this.idCliente = idCliente;
		this.idDocumento = idDocumento;
	}

	public int getIdCarteira() {
		return idCarteira;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public int getIdDocumento() {
		return idDocumento;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		TbCarteiraDocumentoId other = (TbCarteiraDocumentoId) obj;

		if (idCarteira != other.idCarteira)
			return false;
		
		if (idCliente != other.idCliente)
			return false;

		if (idDocumento != other.idDocumento)
			return false;
		
		return true;
	}
}
