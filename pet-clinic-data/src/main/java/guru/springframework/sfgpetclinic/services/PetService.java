package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(String lastName);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
