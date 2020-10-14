package guru.springframework.spring5petclinic.services.map;

import guru.springframework.spring5petclinic.model.Pet;
import guru.springframework.spring5petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet owner) {
        return super.save(owner);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet owner) {
        super.delete(owner);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
