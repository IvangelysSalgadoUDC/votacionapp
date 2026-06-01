package votacionapp.dao;

import votacionapp.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioCrud extends CrudRepository<Usuario, String> {
}
