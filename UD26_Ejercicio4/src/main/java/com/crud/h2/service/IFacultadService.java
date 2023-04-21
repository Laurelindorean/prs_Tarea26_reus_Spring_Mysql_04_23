/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Facultad;

/**
 * @author Palmira
 *
 */
public interface IFacultadService {

	// Metodos del CRUD
	public List<Facultad> listar();

	public Facultad guardar(Facultad facultad);

	public Facultad facultadXID(int id);

	public Facultad actualizarFacultad(Facultad facultad);

	public void eliminarFacultad(int id);
}
