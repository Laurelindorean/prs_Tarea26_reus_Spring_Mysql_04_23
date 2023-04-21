/**
 * 
 */
package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Investigador;

/**
 * @author Palmira
 *
 */
public interface IInvestigadorDAO extends JpaRepository<Investigador, String>{

}
