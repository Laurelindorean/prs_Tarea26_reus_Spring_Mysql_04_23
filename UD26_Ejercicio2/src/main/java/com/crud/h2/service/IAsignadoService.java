/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Asignado_a;

/**
 * @author Palmira
 *
 */
public interface IAsignadoService {

	// Metodos del CRUD
	public List<Asignado_a> listar();

	public Asignado_a guardar(Asignado_a asignado_a);

	public Asignado_a asignadoXID(int id);

	public Asignado_a actualizarAsignado(Asignado_a asignado_a);

	public void eliminarAsignado(int id);

}
