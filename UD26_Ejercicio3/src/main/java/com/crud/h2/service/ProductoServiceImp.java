/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IProductoDAO;
import com.crud.h2.dto.Producto;

/**
 * @author Palmira
 *
 */
@Service
public class ProductoServiceImp implements IProductoService {

	@Autowired
	IProductoDAO iProductoDao;

	@Override
	public List<Producto> listar() {
		return iProductoDao.findAll();
	}

	@Override
	public Producto guardar(Producto producto) {
		return iProductoDao.save(producto);
	}

	@Override
	public Producto productoXID(int id) {
		return iProductoDao.findById(id).get();
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return iProductoDao.save(producto);
	}

	@Override
	public void eliminarProducto(int id) {
		iProductoDao.deleteById(id);
	}

}
