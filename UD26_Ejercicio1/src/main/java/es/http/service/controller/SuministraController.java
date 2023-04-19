/**
 * 
 */
package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Suministra;
import es.http.service.service.SuministraServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServiceImp suministraServiceImp;

	@GetMapping("/suministra")
	public List<Suministra> listarSuministra() {
		return suministraServiceImp.listar();
	}

	@PostMapping("/suministra")
	public Suministra salvarProveedor(@RequestBody Suministra suministra) {
		return suministraServiceImp.guardar(suministra);
	}

	@GetMapping("/suministra/{codigoPieza}")
	public Suministra proveedorXID(@PathVariable(name = "codigoPieza") int codigoPieza) {
		Suministra suministra_xid = new Suministra();
		suministra_xid = suministraServiceImp.suministraXID(codigoPieza);
		return suministra_xid;
	}

	@PutMapping("/suministra/{codigoPieza}")
	public Suministra actualizarSuministra(@PathVariable(name = "codigoPieza") int codigoPieza, @RequestBody Suministra suministra) {
		Suministra suministra_selec = new Suministra();
		suministra_selec = suministraServiceImp.suministraXID(codigoPieza);
		suministra_selec.setPrecio(suministra.getPrecio());
		suministra_selec.setPieza(suministra.getPieza());
		suministra_selec.setProveedor(suministra.getProveedor());
		return suministraServiceImp.actualizarSuministra(suministra_selec);
	}

	@DeleteMapping("/suministra/{codigoPieza}")
	public void eliminarSuministra(@PathVariable(name = "codigoPieza") int codigoPieza) {
		suministraServiceImp.eminiarSuministra(codigoPieza);
	}

}