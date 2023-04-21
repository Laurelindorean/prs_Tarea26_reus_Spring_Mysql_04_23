/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IReservaDAO;
import com.crud.h2.dto.Reserva;

/**
 * @author Palmira
 *
 */
@Service
public class ReservaServiceImp implements IReservaService {

	@Autowired
	IReservaDAO iReservaDao;

	@Override
	public List<Reserva> listar() {
		return iReservaDao.findAll();
	}

	@Override
	public Reserva guardar(Reserva reserva) {
		return iReservaDao.save(reserva);
	}

	@Override
	public Reserva reservaXID(int id) {
		return iReservaDao.findById(id).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		return iReservaDao.save(reserva);
	}

	@Override
	public void eliminarReserva(int id) {
		iReservaDao.deleteById(id);
	}

}
