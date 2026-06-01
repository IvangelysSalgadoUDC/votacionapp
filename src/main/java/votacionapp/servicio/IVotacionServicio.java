package votacionapp.servicio;

import java.util.List;
import votacionapp.modelo.Votacion;

public interface IVotacionServicio {
    public List<Votacion> listarVotaciones();
    public void guardar(Votacion votacion);
    public void eliminar(Votacion votacion);
    public Votacion buscar(Votacion votacion);
}
