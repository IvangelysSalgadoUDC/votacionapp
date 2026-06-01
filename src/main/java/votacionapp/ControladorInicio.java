package votacionapp;

import java.util.List;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import votacionapp.modelo.Usuario;
import votacionapp.servicio.IUsuarioServicio;

@Controller
public class ControladorInicio {

    private static final Logger log = LoggerFactory.getLogger(ControladorInicio.class);

    @Autowired
    IUsuarioServicio userServicio;

    @GetMapping("/")
    public String inicio(Model modelo) {
        List<Usuario> listaUsuarios = userServicio.listarUsuarios();
        modelo.addAttribute("usuarios", listaUsuarios);
        log.info("Ejecutando el controlador Inicio MVC");
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Usuario usuario) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Usuario usuario, Errors errores) {
        if (errores.hasErrors()) {
            return "modificar";
        }
        userServicio.guardar(usuario);
        return "redirect:/";
    }

    @GetMapping("/editar/{cedula}")
    public String editar(Usuario usuario, Model modelo) {
        log.info("Invocando el metodo EDITAR");
        usuario = userServicio.buscar(usuario);
        modelo.addAttribute("usuario", usuario);
        return "modificar";
    }

    @GetMapping("/eliminar")
    public String eliminar(Usuario usuario) {
        log.info("Invocando el metodo ELIMINAR");
        userServicio.eliminar(usuario);
        return "redirect:/";
    }
}