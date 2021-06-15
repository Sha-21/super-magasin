package services.impl;

import models.Categorie;
import models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProduitServiceImpl extends GenericServiceImpl<Produit> {
    public ProduitServiceImpl(JpaRepository<Produit, Long> repository) {
        super(repository);
    }
}
