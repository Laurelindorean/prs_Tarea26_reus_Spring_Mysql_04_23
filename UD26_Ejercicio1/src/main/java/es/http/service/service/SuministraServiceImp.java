/**
 * 
 */
package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ISuministraDAO;
import es.http.service.dto.Suministra;

/**
 * @author Palmira
 *
 */
@Service
public class SuministraServiceImp implements ISuministraService {

	@Autowired
	ISuministraDAO iSuministraDAO;

	@Override
	public List<Suministra> listar() {
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra guardar(Suministra suministra) {
		return iSuministraDAO.save(suministra);
	}

	@Override
	public Suministra suministraXID(int id) {
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		return iSuministraDAO.save(suministra);
	}

	@Override
	public void eminiarSuministra(int id) {
		iSuministraDAO.deleteById(id);

	}

}
