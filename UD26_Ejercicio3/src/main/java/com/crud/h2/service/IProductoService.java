/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Producto;

/**
 * @author Palmira
 *
 */
public interface IProductoService {

	// Metodos del CRUD
	public List<Producto> listar();

	public Producto guardar(Producto producto);

	public Producto productoXID(int id);

	public Producto actualizarProducto(Producto producto);

	public void eliminarProducto(int id);
	
}
