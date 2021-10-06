package com.TiendaGrupo2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Usuarios")
public class Persona {
	
	@Id
	private int Cedula_Usua;
	private String Nombre_Usua;
	private String Correo_Usua;
	private String Usuario;
	private String Clave;
	
	public Persona()
	{
		
	}
	
	public Persona(int Cedula, String Nombre, String Correo, String User, String Password )
	{
		super();
		Cedula_Usua = Cedula;
		Nombre_Usua = Nombre;
		Correo_Usua = Correo;
		Usuario = User;
		Clave = Password;
	}

	public int getCedula_Usua() {
		return Cedula_Usua;
	}

	public void setCedula_Usua(int Cedula) {
		Cedula_Usua = Cedula;
	}

	public String getNombre_Usua() {
		return Nombre_Usua;
	}

	public void setNombre_Usua(String Nombre) {
		Nombre_Usua = Nombre;
	}

	public String getCorreo_Usua() {
		return Correo_Usua;
	}

	public void setCorreo_Usua(String Correo) {
		Correo_Usua = Correo;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String User) {
		Usuario = User;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String Password) {
		Clave = Password;
	}
	
}
