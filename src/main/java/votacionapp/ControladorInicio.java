package votacionapp;

import java.util.Arrays;
import java.util.List;
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

        Usuario u1 = new Usuario();
        u1.setCedula("1234");
        u1.setClave("Abcd");
        u1.setNombre("Ivangelys Victoria Salgado Gutierrez");
        u1.setEmail("ivangelissalgado@gmail.com");
        modelo.addAttribute("alguien", u1);

        Usuario u2 = new Usuario();
        u2.setCedula("777");
        u2.setClave("El mejor");
        u2.setNombre("JESUS DE NAZARET");
        u2.setEmail("jesuscristo@iglesia.com");

        Usuario u3 = new Usuario();
        u3.setCedula("4321");
        u3.setClave("*xyz*");
        u3.setNombre("FULANITO DE TAL");
        u3.setEmail("fulanito@gmail.com");

        List<Usuario> listaUsuarios = Arrays.asList(u2, u3);
        modelo.addAttribute("usuarios", listaUsuarios);

        log.info("Ejecutando el controlador Inicio MVC");
        return "index";
    }
}