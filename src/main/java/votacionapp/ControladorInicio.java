package votacionapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ControladorInicio {

    private static final Logger log = LoggerFactory.getLogger(ControladorInicio.class);

    @GetMapping("/")
    public String inicio() {
        log.info("Ejecutando el controlador Inicio");
        return "Este es el inicio V2";
    }
}
