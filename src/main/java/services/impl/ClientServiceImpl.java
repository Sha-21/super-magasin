package services.impl;

import models.Categorie;
import models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public class ClientServiceImpl extends GenericServiceImpl<Client>{
    public ClientServiceImpl(JpaRepository<Client, Long> repository) {
        super(repository);
    }
}
