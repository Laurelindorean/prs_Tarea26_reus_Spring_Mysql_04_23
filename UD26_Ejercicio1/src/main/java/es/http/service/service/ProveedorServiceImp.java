/**
 * 
 */
package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IProveedorDAO;
import es.http.service.dto.Proveedor;

/**
 * @author Palmira
 *
 */
@Service
public class ProveedorServiceImp implements IProveedorService {

	@Autowired
	IProveedorDAO iProveedorDAO;

	@Override
	public List<Proveedor> listar() {
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor guardar(Proveedor proveedor) {
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public Proveedor proveedorXID(String id) {
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public void eminiarProveedor(String id) {
		iProveedorDAO.deleteById(id);
	}

}
