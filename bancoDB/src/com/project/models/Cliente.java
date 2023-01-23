package com.project.models;

public class Cliente extends Persona{
	private int id_cliente;
	private int id_gestor;
	private double saldo;
	
	public Cliente(int id_cliente, int id_gestor, String nombre, String apellido, String dni, String usuario, String password, String correo, double saldo) {
		super(nombre, apellido, dni, usuario, password, correo);
		this.id_cliente = id_cliente;
		this.id_gestor = id_gestor;
		this.saldo = saldo;
	}
	
	public Cliente(int id_gestor, String nombre, String apellido, String dni, String usuario, String password, String correo, double saldo) {
		super(nombre, apellido, dni, usuario, password, correo);
		this.id_gestor = id_gestor;
		this.saldo = saldo;
	}
	
	public Cliente(int id_cliente, String actualizar) {
		super(actualizar);
		this.id_cliente = id_cliente;
	}
	
	public Cliente(int id_cliente, int id_gestor) {
		this.id_cliente = id_cliente;
		this.id_gestor = id_gestor;
	}
	
	public Cliente(int id_cliente, double saldo) {
		this.id_cliente = id_cliente;
		this.saldo = saldo;
	}
	
	public Cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	public Cliente(String usuario) {
		super(usuario);
	}

	public int getId_cliente() {return id_cliente;}
	public void setId_cliente(int id_cliente) {this.id_cliente = id_cliente;}

	public int getId_gestor() {return id_gestor;}
	public void setId_gestor(int id_gestor) {this.id_gestor = id_gestor;}

	public double getSaldo() {return saldo;}
	public void setSaldo(double saldo) {this.saldo = saldo;}
	
}