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

import com.crud.h2.dto.MaquinaRegistradora;
import com.crud.h2.service.MaquinaServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class MaquinaController {

	@Autowired
	MaquinaServiceImp maquinaServiceImp;

	@GetMapping("/maquinas_registradoras")
	public List<MaquinaRegistradora> listar() {
		return maquinaServiceImp.listar();
	}

	@PostMapping("/maquinas_registradoras")
	public MaquinaRegistradora guardar(@RequestBody MaquinaRegistradora maquina) {
		return maquinaServiceImp.guardar(maquina);
	}

	@GetMapping("/maquinas_registradoras/{id}")
	public MaquinaRegistradora maquinaXID(@PathVariable(name = "id") int id) {
		MaquinaRegistradora maquinaxid = maquinaServiceImp.maquinaXID(id);
		return maquinaxid;
	}

	@PutMapping("/maquinas_registradoras/{id}")
	public MaquinaRegistradora actualizarMaquina(@PathVariable(name = "id") int id,
			@RequestBody MaquinaRegistradora maquina) {
		MaquinaRegistradora maquina_sel = maquinaServiceImp.maquinaXID(id);
		maquina_sel.setPiso(maquina.getPiso());
		return maquinaServiceImp.actualizarMaquina(maquina_sel);
	}

	@DeleteMapping("/maquinas_registradoras/{id}")
	public void eliminarMaquina(@PathVariable(name = "id") int id) {
		maquinaServiceImp.eliminarMaquina(id);
	}

}
