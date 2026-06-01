package votacionapp.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import votacionapp.dao.IVotacionCrud;
import votacionapp.modelo.Votacion;

@Service
public class VotacionServicioImp implements IVotacionServicio {

    @Autowired
    IVotacionCrud crudVotacion;

    @Transactional(readOnly = true)
    @Override
    public List<Votacion> listarVotaciones() {
        return (List<Votacion>) crudVotacion.findAll();
    }

    @Transactional
    @Override
    public void guardar(Votacion votacion) {
        crudVotacion.save(votacion);
    }

    @Transactional
    @Override
    public void eliminar(Votacion votacion) {
        crudVotacion.delete(votacion);
    }

    @Transactional(readOnly = true)
    @Override
    public Votacion buscar(Votacion votacion) {
        return crudVotacion.findById(votacion.getId()).orElse(null);
    }
}
