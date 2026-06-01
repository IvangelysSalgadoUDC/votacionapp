package votacionapp.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import votacionapp.dao.IUsuarioCrud;
import votacionapp.modelo.Usuario;

@Service
public class UsuarioServicioImp implements IUsuarioServicio {

    @Autowired
    IUsuarioCrud crudUsuario;

    @Transactional(readOnly = true)
    @Override
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) crudUsuario.findAll();
    }

    @Transactional
    @Override
    public void guardar(Usuario user) {
        crudUsuario.save(user);
    }

    @Transactional
    @Override
    public void eliminar(Usuario user) {
        crudUsuario.delete(user);
    }

    @Transactional(readOnly = true)
    @Override
    public Usuario buscar(Usuario user) {
        return crudUsuario.findById(user.getCedula()).orElse(null);
    }
}
