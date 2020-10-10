package guru.springframework.spring5petclinic.services;

import guru.springframework.spring5petclinic.Owner;

//extends passes in the objects required by the interface generics
//    notice we did not implement the interface, only extended it. (so body not required)
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastname);
    //deleted methods that are inherited from CrudService interface
}
