package com.zaubershlosss.zpetclinic.services.map;

import com.zaubershlosss.zpetclinic.model.Pet;
import com.zaubershlosss.zpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapServices<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}