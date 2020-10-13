package guru.springframework.spring5petclinic.services.map;

import guru.springframework.spring5petclinic.model.Vet;
import guru.springframework.spring5petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet owner) {
        super.delete(owner);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
