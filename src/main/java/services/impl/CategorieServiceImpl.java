package services.impl;

import models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public class CategorieServiceImpl extends GenericServiceImpl<Categorie> {
    public CategorieServiceImpl(JpaRepository<Categorie, Long> repository){ super(repository);}
}
