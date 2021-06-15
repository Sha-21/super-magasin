package com.m2i.formation.magasin.services.impl;

import com.m2i.formation.magasin.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public class ClientServiceImpl extends GenericServiceImpl<Client>{
    public ClientServiceImpl(JpaRepository<Client, Long> repository) {
        super(repository);
    }
}
