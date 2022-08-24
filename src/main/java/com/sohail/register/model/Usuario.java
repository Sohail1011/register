package com.sohail.register.model;

public class Usuario {

	private String Codigo;
	private String Nombres;
	private String Apellidos;
	private String Email;
	private String TipoDoc;
	private Integer NDoc;
	private String Contrasena;

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTipoDoc() {
		return TipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		TipoDoc = tipoDoc;
	}

	public Integer getNDoc() {
		return NDoc;
	}

	public void setNDoc(Integer nDoc) {
		NDoc = nDoc;
	}

	public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}

	public Usuario(String codigo, String nombres, String apellidos, String email, String tipoDoc, Integer nDoc,
			String contrasena) {
		super();
		Codigo = codigo;
		Nombres = nombres;
		Apellidos = apellidos;
		Email = email;
		TipoDoc = tipoDoc;
		NDoc = nDoc;
		Contrasena = contrasena;
	}

	public Usuario() {

	}

}
