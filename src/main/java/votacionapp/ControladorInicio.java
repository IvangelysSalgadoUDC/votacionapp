package votacionapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import votacionapp.modelo.Usuario;

@Controller
public class ControladorInicio {

    private static final Logger log = LoggerFactory.getLogger(ControladorInicio.class);

    @Value("${index.mensaje}")
    String dato;

    @GetMapping("/")
    public String inicio(Model modelo) {
        String mensaje = "Saludos desde Spring MVC con paso de información";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);

        Usuario u = new Usuario();
        u.setCedula("1234677");
        u.setClave("Abcd");
        u.setNombre("Ivangelys Victoria Salgado Gutierrez");
        u.setEmail("ivangelissalgado@gmail.com");
        modelo.addAttribute("alguien", u);

        log.info("Ejecutando el controlador Inicio MVC");
        return "index";
    }
}