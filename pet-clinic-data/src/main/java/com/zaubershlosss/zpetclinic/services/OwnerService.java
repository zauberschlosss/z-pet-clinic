package com.zaubershlosss.zpetclinic.services;

import com.zaubershlosss.zpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById();

    Owner save(Owner owner);

    Set<Owner> findAll();
}
