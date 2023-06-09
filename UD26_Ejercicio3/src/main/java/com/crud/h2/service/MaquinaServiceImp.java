/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IMaquinaDAO;
import com.crud.h2.dto.MaquinaRegistradora;

/**
 * @author Palmira
 *
 */
@Service
public class MaquinaServiceImp implements IMaquinaService {

	@Autowired
	IMaquinaDAO iMaquinaDao;

	@Override
	public List<MaquinaRegistradora> listar() {
		return iMaquinaDao.findAll();
	}

	@Override
	public MaquinaRegistradora guardar(MaquinaRegistradora maquina) {
		return iMaquinaDao.save(maquina);
	}

	@Override
	public MaquinaRegistradora maquinaXID(int id) {
		return iMaquinaDao.findById(id).get();
	}

	@Override
	public MaquinaRegistradora actualizarMaquina(MaquinaRegistradora maquina) {
		return iMaquinaDao.save(maquina);
	}

	@Override
	public void eliminarMaquina(int id) {
		iMaquinaDao.deleteById(id);
	}

}
