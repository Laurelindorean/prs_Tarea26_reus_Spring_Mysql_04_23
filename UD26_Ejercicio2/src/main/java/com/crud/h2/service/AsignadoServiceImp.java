/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAsignadoDAO;
import com.crud.h2.dto.Asignado_a;

/**
 * @author Palmira
 *
 */
@Service
public class AsignadoServiceImp implements IAsignadoService{
	
	@Autowired
	IAsignadoDAO iAsignadoDao;

	@Override
	public List<Asignado_a> listar() {
		return iAsignadoDao.findAll();
	}

	@Override
	public Asignado_a guardar(Asignado_a asignado_a) {
		return iAsignadoDao.save(asignado_a);
	}

	@Override
	public Asignado_a asignadoXID(int id) {
		return iAsignadoDao.findById(id).get();
	}

	@Override
	public Asignado_a actualizarAsignado(Asignado_a asignado_a) {
		return iAsignadoDao.save(asignado_a);
	}

	@Override
	public void eliminarAsignado(int id) {
		iAsignadoDao.deleteById(id);
	}

}
