package guru.springframework.spring5petclinic.services;

import guru.springframework.spring5petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastname);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
