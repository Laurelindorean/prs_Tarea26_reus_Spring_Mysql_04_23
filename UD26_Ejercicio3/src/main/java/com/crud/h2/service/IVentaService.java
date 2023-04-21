/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Venta;

/**
 * @author Palmira
 *
 */
public interface IVentaService {

	// Metodos del CRUD
	public List<Venta> listar();

	public Venta guardar(Venta venta);

	public Venta ventaXID(int id);

	public Venta actualizarVenta(Venta venta);

	public void eliminarVenta(int id);
	
}
