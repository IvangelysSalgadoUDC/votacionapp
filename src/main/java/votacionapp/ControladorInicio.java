package votacionapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {

    private static final Logger log = LoggerFactory.getLogger(ControladorInicio.class);

    @GetMapping("/")
    public String inicio() {
        log.info("Ejecutando el controlador Inicio MVC");
        return "index";
    }
}