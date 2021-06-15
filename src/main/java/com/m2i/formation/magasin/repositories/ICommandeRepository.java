package com.m2i.formation.magasin.repositories;

import com.m2i.formation.magasin.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommandeRepository extends JpaRepository<Commande, Long> {
}
