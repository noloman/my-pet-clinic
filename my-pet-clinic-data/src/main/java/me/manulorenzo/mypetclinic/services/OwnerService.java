package me.manulorenzo.mypetclinic.services;

import me.manulorenzo.mypetclinic.model.Owner;
import me.manulorenzo.mypetclinic.model.Pet;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Pet> findAll();
}
