package com.zaubershlosss.zpetclinic.services;

import com.zaubershlosss.zpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
