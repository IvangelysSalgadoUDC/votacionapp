package votacionapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        log.info("Ejecutando el controlador Inicio MVC");
        return "index";
    }
}