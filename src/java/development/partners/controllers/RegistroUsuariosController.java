
package development.partners.controllers;

import com.sun.xml.xsom.impl.scd.Iterators;
import development.partners.models.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistroUsuariosController {
    @RequestMapping(value="registroUsuarios", method=RequestMethod.GET)
    public ModelAndView vistaRegistroUsuarios(){
        return new ModelAndView ("usuarios/registroUsuarios","command",new Usuario());
    }
    
    @RequestMapping(value="registroUsuarios", method=RequestMethod.POST)
    public ModelAndView enviarUsuarios(@ModelAttribute("enviarUsuarios") Usuario usuario,Model model){
        model.addAttribute("user",usuario.getUser());
        model.addAttribute("nombre",usuario.getNombre());
        model.addAttribute("pass",usuario.getPass());
        model.addAttribute("apellidos",usuario.getApellidos());
        model.addAttribute("estado",usuario.getEstado());
        model.addAttribute("sexo",usuario.getSexo());
        model.addAttribute("hobbie",usuario.getHobbie());
        return new ModelAndView ("usuarios/resultadoUsuarios") ;
    
    }
    
  
    
@ModelAttribute ("estados")
public Map<String, String> listaEstados(){
    Map<String, String> estados = new HashMap<>(); 
    estados.put("MX", "Mexico");
    estados.put("GD", "Guadalajara");
    estados.put("CH", "Chihuahua");
    return estados;
    
}
@ModelAttribute ("sexo")
public List<String> listaSexo(){
List<String> sexo = new ArrayList();
sexo.add("Masculino");
sexo.add("Femenino");
        return sexo;
}

@ModelAttribute ("hobbie")

public List<String> listaHobbie(){
List<String> hobbie = new ArrayList();
hobbie.add("Musica");
hobbie.add("Leer");
hobbie.add("Bailar");
hobbie.add("Programar");
return hobbie;
}


}




