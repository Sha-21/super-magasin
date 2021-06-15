package services.impl;

import models.Categorie;
import models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public class CommandeServiceImpl extends GenericServiceImpl<Commande>{
    public CommandeServiceImpl(JpaRepository<Categorie, Long> repository) {
        super(repository);
    }
}
