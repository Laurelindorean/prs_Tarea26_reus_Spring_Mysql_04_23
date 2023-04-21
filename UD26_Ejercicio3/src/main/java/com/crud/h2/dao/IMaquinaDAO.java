/**
 * 
 */
package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.MaquinaRegistradora;

/**
 * @author Palmira
 *
 */
public interface IMaquinaDAO extends JpaRepository<MaquinaRegistradora, Integer>{

}
