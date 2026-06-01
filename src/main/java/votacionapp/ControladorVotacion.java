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
import org.springframework.web.bind.annotation.RequestMapping;
import votacionapp.modelo.Votacion;
import votacionapp.servicio.IVotacionServicio;

@Controller
@RequestMapping("/votacion")
public class ControladorVotacion {

    private static final Logger log = LoggerFactory.getLogger(ControladorVotacion.class);

    @Autowired
    IVotacionServicio votacionServicio;

    @GetMapping("/listar")
    public String listar(Model modelo) {
        List<Votacion> listaVotaciones = votacionServicio.listarVotaciones();
        modelo.addAttribute("votaciones", listaVotaciones);
        log.info("Listando votaciones");
        return "votacion/listar";
    }

    @GetMapping("/agregar")
    public String agregar(Votacion votacion) {
        return "votacion/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Votacion votacion, Errors errores) {
        if (errores.hasErrors()) {
            return "votacion/formulario";
        }
        votacionServicio.guardar(votacion);
        log.info("Votacion guardada: " + votacion.getCandidato());
        return "redirect:/votacion/listar";
    }

    @GetMapping("/editar")
    public String editar(Votacion votacion, Model modelo) {
        log.info("Editando votacion id: " + votacion.getId());
        votacion = votacionServicio.buscar(votacion);
        modelo.addAttribute("votacion", votacion);
        return "votacion/formulario";
    }

    @GetMapping("/eliminar")
    public String eliminar(Votacion votacion) {
        log.info("Eliminando votacion id: " + votacion.getId());
        votacionServicio.eliminar(votacion);
        return "redirect:/votacion/listar";
    }
}
