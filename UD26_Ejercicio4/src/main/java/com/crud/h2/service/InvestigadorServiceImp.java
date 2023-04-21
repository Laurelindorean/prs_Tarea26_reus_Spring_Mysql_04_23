/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IInvestigadorDAO;
import com.crud.h2.dto.Investigador;

/**
 * @author Palmira
 *
 */
@Service
public class InvestigadorServiceImp implements IInvestigadorService {

	@Autowired
	IInvestigadorDAO iInvesDao;

	@Override
	public List<Investigador> listar() {
		return iInvesDao.findAll();
	}

	@Override
	public Investigador guardar(Investigador inves) {
		return iInvesDao.save(inves);
	}

	@Override
	public Investigador investigadorXID(String id) {
		return iInvesDao.findById(id).get();
	}

	@Override
	public Investigador acualizarInvestigador(Investigador inves) {
		return iInvesDao.save(inves);
	}

	@Override
	public void eliminarInvestigador(String id) {
		iInvesDao.deleteById(id);
	}

}
