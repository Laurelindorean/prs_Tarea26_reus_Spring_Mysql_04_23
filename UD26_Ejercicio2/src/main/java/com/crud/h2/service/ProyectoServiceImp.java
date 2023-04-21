/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IProyectoDAO;
import com.crud.h2.dto.Proyecto;

/**
 * @author Palmira
 *
 */
@Service
public class ProyectoServiceImp implements IProyectoService{
	
	@Autowired
	IProyectoDAO iProyectoDao;

	@Override
	public List<Proyecto> listar() {
		return iProyectoDao.findAll();
	}

	@Override
	public Proyecto guardar(Proyecto proyecto) {
		return iProyectoDao.save(proyecto);
	}

	@Override
	public Proyecto proyectoXID(String id) {
		return iProyectoDao.findById(id).get();
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		return iProyectoDao.save(proyecto);
	}

	@Override
	public void eliminarProyecto(String id) {
		iProyectoDao.deleteById(id);
	}

}
