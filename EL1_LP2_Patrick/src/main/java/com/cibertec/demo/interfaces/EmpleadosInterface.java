package com.cibertec.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.demo.model.Empleados;

@Repository
public interface EmpleadosInterface extends CrudRepository<Empleados, Integer> {

}
