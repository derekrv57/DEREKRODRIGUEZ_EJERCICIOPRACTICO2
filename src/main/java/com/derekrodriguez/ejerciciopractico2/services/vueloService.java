/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.derekrodriguez.ejerciciopractico2.services;

import com.derekrodriguez.ejerciciopractico2.domain.vuelo;
import java.util.List;

/**
 *
 * @author derek
 */
public interface vueloService {
    public List<vuelo> getvuelos();
    
    // Se obtiene un vuelo, a partir del id de un vuelo
    public vuelo getvuelo(vuelo vuelo);
    
    // Se inserta un nuevo vuelo si el id del vuelo esta vacío
    // Se actualiza un vuelo si el id del vuelo NO esta vacío
    public void save(vuelo vuelo);
    
    // Se elimina el vuelo que tiene el id pasado por parámetro
    public void delete(vuelo vuelo);
}
