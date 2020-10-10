package guru.springframework.spring5petclinic.services.map;

import guru.springframework.spring5petclinic.model.Pet;
import guru.springframework.spring5petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet owner) {
        return super.save(owner.getId(), owner);
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
