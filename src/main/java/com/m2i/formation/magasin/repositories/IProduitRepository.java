package com.m2i.formation.magasin.repositories;

import com.m2i.formation.magasin.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduitRepository extends JpaRepository<Produit, Long> {
}
