package com.m2i.formation.magasin.repositories;

import com.m2i.formation.magasin.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client, Long> {
}
