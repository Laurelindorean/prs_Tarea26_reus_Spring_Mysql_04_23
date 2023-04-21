/**
 * 
 */
package com.crud.h2.controller;

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

import com.crud.h2.dto.Facultad;
import com.crud.h2.service.FacultadServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class FacultadController {

	@Autowired
	FacultadServiceImp facultadServiceImp;
	
	@GetMapping("/facultad")
	public List<Facultad> listar() {
		return facultadServiceImp.listar();
	}

	@PostMapping("/facultad")
	public Facultad guardar(@RequestBody Facultad facultad) {
		return facultadServiceImp.guardar(facultad);
	}

	@GetMapping("/facultad/{id}")
	public Facultad facultadXID(@PathVariable(name="id") int id) {
		Facultad facultadxid = facultadServiceImp.facultadXID(id);
		return facultadxid;
	}

	@PutMapping("/facultad/{id}")
	public Facultad actualizarFacultad(@PathVariable(name="id") int id, @RequestBody Facultad facultad) {
		Facultad facultad_sel = facultadServiceImp.facultadXID(id);
		facultad_sel.setNombre(facultad.getNombre());
		return facultadServiceImp.actualizarFacultad(facultad_sel);
	}

	@DeleteMapping("/facultad/{id}")
	public void eliminarFacultad(@PathVariable(name="id") int id) {
		facultadServiceImp.eliminarFacultad(id);
	}
}
