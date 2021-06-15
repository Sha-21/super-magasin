package com.m2i.formation.magasin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.m2i.formation.magasin.repositories.ICategorieRepository;
import com.m2i.formation.magasin.repositories.IClientRepository;
import com.m2i.formation.magasin.repositories.ICommandeRepository;
import com.m2i.formation.magasin.repositories.IProduitRepository;
import com.m2i.formation.magasin.services.impl.CategorieServiceImpl;
import com.m2i.formation.magasin.services.impl.ClientServiceImpl;
import com.m2i.formation.magasin.services.impl.CommandeServiceImpl;
import com.m2i.formation.magasin.services.impl.ProduitServiceImpl;

@Configuration
public class ServiceConfig {
    @Bean
    public CategorieServiceImpl categorieServiceFactory(ICategorieRepository categorieRepository)
    {
        return new CategorieServiceImpl(categorieRepository);
    }

    @Bean
    public ClientServiceImpl clientServiceFactory(IClientRepository clientRepository)
    {
        return new ClientServiceImpl(clientRepository);
    }

    @Bean
    public CommandeServiceImpl commandeServiceFactory(ICommandeRepository commandeRepository)
    {
        return new CommandeServiceImpl(commandeRepository);
    }

    @Bean
    public ProduitServiceImpl produitServiceFactory(IProduitRepository produitRepository)
    {
        return new ProduitServiceImpl(produitRepository);
    }

}
