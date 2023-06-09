/**
 * 
 */
package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IPiezaDAO;
import es.http.service.dto.Pieza;

/**
 * @author Palmira
 *
 */
@Service
public class PiezaServiceImp implements IPiezaService {

	@Autowired
	IPiezaDAO iPiezaDAO;

	@Override
	public List<Pieza> listar() {
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza guardar(Pieza pieza) {
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza piezaXID(int id) {
		return iPiezaDAO.findById(id).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(int id) {
		iPiezaDAO.deleteById(id);

	}

}
