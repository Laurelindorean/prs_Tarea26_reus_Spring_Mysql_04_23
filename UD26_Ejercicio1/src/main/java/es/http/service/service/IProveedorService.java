/**
 * 
 */
package es.http.service.service;

import java.util.List;

import es.http.service.dto.Proveedor;

/**
 * @author Palmira
 *
 */
public interface IProveedorService {

	// Metodos del CRUD
	public List<Proveedor> listar();

	public Proveedor guardar(Proveedor proveedor);

	public Proveedor proveedorXID(String id);

	public Proveedor actualizarProveedor(Proveedor proveedor);

	public void eminiarProveedor(String id);

}
