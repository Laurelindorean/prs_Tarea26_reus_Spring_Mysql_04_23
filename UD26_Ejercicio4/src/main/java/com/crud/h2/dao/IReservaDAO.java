/**
 * 
 */
package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Reserva;

/**
 * @author Palmira
 *
 */
public interface IReservaDAO extends JpaRepository<Reserva, Integer>{

}
