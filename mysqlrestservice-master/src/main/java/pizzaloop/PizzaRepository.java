package pizzaloop;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface PizzaRepository extends CrudRepository<PizzaDetails, Integer>{

    List<PizzaDetails> findByPizzaId(Integer id);

    
    List<PizzaDetails> deleteByPizzaId(Integer id);
}
