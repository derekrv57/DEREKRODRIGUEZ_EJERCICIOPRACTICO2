/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.derekrodriguez.ejerciciopractico2.dao;

import com.derekrodriguez.ejerciciopractico2.domain.vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author derek
 */
public interface vueloDao extends JpaRepository <vuelo, Long>{
    
}
