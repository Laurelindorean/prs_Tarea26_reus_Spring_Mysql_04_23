/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Reserva;

/**
 * @author Palmira
 *
 */
public interface IReservaService {

	// Metodos del CRUD
	public List<Reserva> listar();

	public Reserva guardar(Reserva reserva);

	public Reserva reservaXID(int id);

	public Reserva actualizarReserva(Reserva reserva);

	public void eliminarReserva(int id);
}
