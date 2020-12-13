package me.manulorenzo.mypetclinic.services.map;

import me.manulorenzo.mypetclinic.model.Owner;
import me.manulorenzo.mypetclinic.services.CrudService;

import java.util.Set;


public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        super.save(object.getId(), object);
        return object;
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
