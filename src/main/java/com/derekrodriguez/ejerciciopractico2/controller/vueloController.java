package com.derekrodriguez.ejerciciopractico2.controller;


import com.derekrodriguez.ejerciciopractico2.domain.vuelo;
import com.derekrodriguez.ejerciciopractico2.services.vueloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
@Slf4j
@RequestMapping("/")
public class vueloController {

    @Autowired
    private vueloService vueloService;
    @GetMapping("/")
    public String inicio(Model model) {
        var vuelos = vueloService.getvuelos();
        model.addAttribute("vuelos", vuelos);
        model.addAttribute("totalvuelos", vuelos.size());
        return "/index";
    }
    
    @GetMapping("/nuevo")
    public String vueloNuevo(vuelo vuelo) {
        return "/vuelo/modifica";
    }    

    @GetMapping("/eliminar/{idvuelo}")
    public String vueloEliminar(vuelo vuelo) {
        vueloService.delete(vuelo);
        return "redirect:/";
    }

    @GetMapping("/modificar/{idvuelo}")
    public String vueloModificar(vuelo vuelo, Model model) {
        vuelo = vueloService.getvuelo(vuelo);
        model.addAttribute("vuelo", vuelo);
        return "/vuelo/modifica";
    }
}