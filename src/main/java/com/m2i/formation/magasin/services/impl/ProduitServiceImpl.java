package com.m2i.formation.magasin.services.impl;

import com.m2i.formation.magasin.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProduitServiceImpl extends GenericServiceImpl<Produit> {
    public ProduitServiceImpl(JpaRepository<Produit, Long> repository) {
        super(repository);
    }
}
