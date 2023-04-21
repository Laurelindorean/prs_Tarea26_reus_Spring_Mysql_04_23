/**
 * 
 */
package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Producto;

/**
 * @author Palmira
 *
 */
public interface IProductoDAO extends JpaRepository<Producto, Integer>{

}
