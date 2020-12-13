package me.manulorenzo.mypetclinic.services;

import me.manulorenzo.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
