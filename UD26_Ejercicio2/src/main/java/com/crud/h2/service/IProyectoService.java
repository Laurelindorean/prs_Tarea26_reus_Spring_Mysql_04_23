/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Proyecto;

/**
 * @author Palmira
 *
 */
public interface IProyectoService {

	// Metodos del CRUD
	public List<Proyecto> listar();

	public Proyecto guardar(Proyecto proyecto);

	public Proyecto proyectoXID(String id);

	public Proyecto actualizarProyecto(Proyecto proyecto);

	public void eliminarProyecto(String id);
}
