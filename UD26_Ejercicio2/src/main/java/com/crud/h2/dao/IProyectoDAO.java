/**
 * 
 */
package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Proyecto;

/**
 * @author Palmira
 *
 */
public interface IProyectoDAO extends JpaRepository<Proyecto, String>{

	
}
