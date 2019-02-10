/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package development.partners.controllers;

import development.partners.daos.EquipoDaoImpl;
import development.partners.models.Equipo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author damian.atanacio
 */
@Controller
public class CatalogoEquipoController {
    @RequestMapping(value="catalogoEquipos", method=RequestMethod.GET)
    public ModelAndView verCatalogoEquipos(ModelMap model){
        EquipoDaoImpl equipoDI= new EquipoDaoImpl();
        
        
        
        return new ModelAndView("catalogos/catalogoEquipos","command",new Equipo());
    }
    
    @ModelAttribute("listaMarcas")
    public Map<String, String> getListaMarcas() {
        Map<String, String> listaMarcas = new HashMap<>();
        listaMarcas.put("lv", "Lenovo");
        listaMarcas.put("hp", "HP");
        listaMarcas.put("ac", "Acer");
        listaMarcas.put("app", "Apple");
        listaMarcas.put("th", "Toshiba");
        listaMarcas.put("sm", "Samsung");
        listaMarcas.put("gt", "Gateway");
        listaMarcas.put("cq", "Compaq");
        listaMarcas.put("sy", "Sony");
        listaMarcas.put("lg", "LG");
        listaMarcas.put("lx", "Lanix");
        listaMarcas.put("ibm", "IBM");
        listaMarcas.put("pn", "panasonic");
        listaMarcas.put("aw", "Alienware");
        return listaMarcas;
    }
    @ModelAttribute("listaSO")
    public Map<String, String> getSistemaOperativo(){
    Map<String, String> listaSO = new HashMap<>();
    listaSO.put("xp", "Windows XP" );
    listaSO.put("wv", "Windows Vista");
    listaSO.put("w7", "Windows 7");
    listaSO.put("w8", "Windows 8");
    listaSO.put("w10", "Windows 10");
            
    return listaSO;
    }
    
    
    
    @ModelAttribute("capacidadHD")
    public List<String> getCapacidadHD(){
    List<String> capacidadHD = new ArrayList<>();
    capacidadHD.add("320 GB");
    capacidadHD.add("500 GB");
    capacidadHD.add("1 TB");
    
    return capacidadHD;
    }
    @ModelAttribute("velocidadRam")
    public List<String> getVelocidaRam(){
        List<String> velocidadRam = new ArrayList<>();        
        velocidadRam.add("4 ");
        velocidadRam.add("8 ");
        velocidadRam.add("16 Gb");
    return velocidadRam;
    }
}

