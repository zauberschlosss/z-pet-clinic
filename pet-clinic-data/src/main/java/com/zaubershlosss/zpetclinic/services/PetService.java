package com.zaubershlosss.zpetclinic.services;

import com.zaubershlosss.zpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById();

    Pet save(Pet Pet);

    Set<Pet> findAll();
}
