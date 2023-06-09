/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IFacultadDAO;
import com.crud.h2.dto.Facultad;

/**
 * @author Palmira
 *
 */
@Service
public class FacultadServiceImp implements IFacultadService {

	@Autowired
	IFacultadDAO iFacultadDao;

	@Override
	public List<Facultad> listar() {
		return iFacultadDao.findAll();
	}

	@Override
	public Facultad guardar(Facultad facultad) {
		return iFacultadDao.save(facultad);
	}

	@Override
	public Facultad facultadXID(int id) {
		return iFacultadDao.findById(id).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad facultad) {
		return iFacultadDao.save(facultad);
	}

	@Override
	public void eliminarFacultad(int id) {
		iFacultadDao.deleteById(id);
	}

}
