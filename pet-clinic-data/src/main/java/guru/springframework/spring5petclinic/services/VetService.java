package guru.springframework.spring5petclinic.services;

import guru.springframework.spring5petclinic.Vet;

//extends passes in the objects required by the interface generics
//    notice we did not implement the interface, only extended it. (so body not required)
public interface VetService extends CrudService<Vet, Long> {
    //deleted methods that are inherited from CrudService interface
}
