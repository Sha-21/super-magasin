package com.m2i.formation.magasin.services.impl;

import com.m2i.formation.magasin.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public class CommandeServiceImpl extends GenericServiceImpl<Commande>{
    public CommandeServiceImpl(JpaRepository<Commande, Long> repository) {
        super(repository);
    }
}
