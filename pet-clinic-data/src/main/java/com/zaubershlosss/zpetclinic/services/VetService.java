package com.zaubershlosss.zpetclinic.services;

import com.zaubershlosss.zpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById();

    Vet save(Vet Vet);

    Set<Vet> findAll();
}
