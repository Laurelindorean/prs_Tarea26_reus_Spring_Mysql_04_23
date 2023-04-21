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

import com.crud.h2.dto.Venta;
import com.crud.h2.service.VentaServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaServiceImp ventaServiceImp;

	@GetMapping("/venta")
	public List<Venta> listar() {
		return ventaServiceImp.listar();
	}

	@PostMapping("/venta")
	public Venta guardar(@RequestBody Venta venta) {
		return ventaServiceImp.guardar(venta);
	}

	@GetMapping("/venta/{id}")
	public Venta ventaXID(@PathVariable(name = "id") int id) {
		Venta ventaxid = ventaServiceImp.ventaXID(id);
		return ventaxid;
	}

	@PutMapping("/venta/{id}")
	public Venta actualizarVenta(@PathVariable(name = "id") int id, @RequestBody Venta venta) {
		Venta venta_sel = ventaServiceImp.ventaXID(id);
		venta_sel.setCajero(venta.getCajero());
		venta_sel.setMaquina(venta.getMaquina());
		venta_sel.setProducto(venta.getProducto());
		return ventaServiceImp.actualizarVenta(venta_sel);
	}

	@DeleteMapping("/venta/{id}")
	public void eliminarVenta(@PathVariable(name = "id") int id) {
		ventaServiceImp.eliminarVenta(id);
	}

}
