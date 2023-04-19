/**
 * 
 */
package es.http.service.service;

import java.util.List;

import es.http.service.dto.Suministra;

/**
 * @author Palmira
 *
 */
public interface ISuministraService {

	// Metodos del CRUD
	public List<Suministra> listar();

	public Suministra guardar(Suministra suministra);

	public Suministra suministraXID(int id);

	public Suministra actualizarSuministra(Suministra suministra);

	public void eminiarSuministra(int id);
}
