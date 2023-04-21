/**
 * 
 */
package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Equipo;

/**
 * @author Palmira
 *
 */
public interface IEquipoDAO extends JpaRepository<Equipo, String>{

}
