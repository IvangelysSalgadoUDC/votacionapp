package votacionapp.dao;

import org.springframework.data.repository.CrudRepository;
import votacionapp.modelo.Votacion;

public interface IVotacionCrud extends CrudRepository<Votacion, Integer> {

}
