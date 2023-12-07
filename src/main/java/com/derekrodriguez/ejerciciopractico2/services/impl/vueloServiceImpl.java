/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.derekrodriguez.ejerciciopractico2.services.impl;

import com.derekrodriguez.ejerciciopractico2.dao.vueloDao;
import com.derekrodriguez.ejerciciopractico2.domain.vuelo;
import com.derekrodriguez.ejerciciopractico2.services.vueloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author derek
 */
@Service
public class vueloServiceImpl implements vueloService{
    @Autowired
    private vueloDao vueloDao;

    @Override
    @Transactional(readOnly = true)
    public List<vuelo> getvuelos() {
        var lista = vueloDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public vuelo getvuelo(vuelo vuelo) {
        return vueloDao.findById(vuelo.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void save(vuelo vuelo) {
        vueloDao.save(vuelo);
    }

    @Override
    @Transactional
    public void delete(vuelo vuelo) {
        vueloDao.delete(vuelo);
    }
}
