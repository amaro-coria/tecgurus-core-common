package net.tecgurus.common.dto;

import java.io.Serializable;

public class ClienteDTO implements Serializable {

	private int idCte;
	private String apeMatCte;
	private String apePatCte;
	private String dirCte;
	private int idEdoCte;
	private String nomCte;
	private String telCte;
	public int getIdCte() {
		return idCte;
	}
	public void setIdCte(int idCte) {
		this.idCte = idCte;
	}
	public String getApeMatCte() {
		return apeMatCte;
	}
	public void setApeMatCte(String apeMatCte) {
		this.apeMatCte = apeMatCte;
	}
	public String getApePatCte() {
		return apePatCte;
	}
	public void setApePatCte(String apePatCte) {
		this.apePatCte = apePatCte;
	}
	public String getDirCte() {
		return dirCte;
	}
	public void setDirCte(String dirCte) {
		this.dirCte = dirCte;
	}
	public int getIdEdoCte() {
		return idEdoCte;
	}
	public void setIdEdoCte(int idEdoCte) {
		this.idEdoCte = idEdoCte;
	}
	public String getNomCte() {
		return nomCte;
	}
	public void setNomCte(String nomCte) {
		this.nomCte = nomCte;
	}
	public String getTelCte() {
		return telCte;
	}
	public void setTelCte(String telCte) {
		this.telCte = telCte;
	}
	
	
}
