/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package development.partners.controllers;

import development.partners.models.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DeveloperSr
 */
@Controller
public class LoginController {
    
    @RequestMapping(value="login" ,method=RequestMethod.GET)
    public ModelAndView verLogin(){
    
        return new ModelAndView("inicioSession/login","command",new Login());
    }
    
    @RequestMapping(value="login", method=RequestMethod.POST)
    public ModelAndView enviarLogin(@ModelAttribute("enviarLogin") Login login, Model model){
        
        model.addAttribute("nombre_usuario",login.getNombre_usuario());
        model.addAttribute("contraseña", login.getContraseña());
        return new ModelAndView("Home");
    }
}
