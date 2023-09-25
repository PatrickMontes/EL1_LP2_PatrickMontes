package com.cibertec.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Empleados") // El nombre de la tabla debe coincidir con el de la base de datos
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado") // El nombre de la columna debe coincidir con el de la base de datos
    private int IdEmpleado;

    @Column(name = "Apellidos") // El nombre de la columna debe coincidir con el de la base de datos
    private String Apellidos;

    @Column(name = "Nombres") // El nombre de la columna debe coincidir con el de la base de datos
    private String Nombres;

    @Column(name = "Edad") // El nombre de la columna debe coincidir con el de la base de datos
    private int Edad;

    @Column(name = "Sexo") // El nombre de la columna debe coincidir con el de la base de datos
    private String Sexo;

    @Column(name = "Salario") // El nombre de la columna debe coincidir con el de la base de datos
    private double Salario;
    
	public Empleados() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleados(int idEmpleado, String apellidos, String nombres, int edad, String sexo, double salario) {
		super();
		IdEmpleado = idEmpleado;
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		Sexo = sexo;
		Salario = salario;
	}

	public int getIdEmpleado() {
		return IdEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		IdEmpleado = idEmpleado;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
	

    
    

}