package com.cibertec.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.cibertec.demo.model.Empleados;

public interface InterfaceEmpleadoService {
	public List<Empleados>listar();
	public Optional<Empleados>listarId(int idEmpleado);
	public int save(Empleados e);
	public void eliminar(int idEmpleado);
}
