package votacionapp.servicio;

import java.util.List;
import votacionapp.modelo.Usuario;

public interface IUsuarioServicio {

    public List<Usuario> listarUsuarios();

    public void guardar(Usuario user);

    public void eliminar(Usuario user);

    public Usuario buscar(Usuario user);
}