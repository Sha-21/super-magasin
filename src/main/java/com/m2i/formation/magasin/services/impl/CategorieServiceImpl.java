package com.m2i.formation.magasin.services.impl;

import com.m2i.formation.magasin.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public class CategorieServiceImpl extends GenericServiceImpl<Categorie> {
    public CategorieServiceImpl(JpaRepository<Categorie, Long> repository){ super(repository);}
}
