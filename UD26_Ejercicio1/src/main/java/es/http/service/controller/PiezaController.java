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

import es.http.service.dto.Pieza;
import es.http.service.service.PiezaServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImp piezaServiceImp;

	@GetMapping("/piezas")
	public List<Pieza> listarPiezas() {
		return piezaServiceImp.listar();
	}

	@PostMapping("/piezas")
	public Pieza salvarPieza(@RequestBody Pieza pieza) {
		return piezaServiceImp.guardar(pieza);
	}

	@GetMapping("/piezas/{codigo}")
	public Pieza piezaXID(@PathVariable(name = "codigo") int codigo) {
		Pieza pieza_xid = new Pieza();
		pieza_xid = piezaServiceImp.piezaXID(codigo);
		return pieza_xid;
	}

	@PutMapping("/piezas/{codigo}")
	public Pieza actualizarPieza(@PathVariable(name = "codigo") int codigo, @RequestBody Pieza pieza) {
		Pieza pieza_selec = new Pieza();
		pieza_selec = piezaServiceImp.piezaXID(codigo);
		pieza_selec.setNombre(pieza.getNombre());
		return piezaServiceImp.actualizarPieza(pieza_selec);
	}

	@DeleteMapping("/piezas/{codigo}")
	public void eliminarPieza(@PathVariable(name = "codigo") int codigo) {
		piezaServiceImp.eminiarPieza(codigo);
	}

}
