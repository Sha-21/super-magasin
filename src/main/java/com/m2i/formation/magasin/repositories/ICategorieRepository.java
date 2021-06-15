package com.m2i.formation.magasin.repositories;

import com.m2i.formation.magasin.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategorieRepository extends JpaRepository<Categorie, Long> {
}
