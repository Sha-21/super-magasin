package config;

import models.Produit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repositories.ICategorieRepository;
import repositories.IClientRepository;
import repositories.ICommandeRepository;
import repositories.IProduitRepository;
import services.impl.CategorieServiceImpl;
import services.impl.ClientServiceImpl;
import services.impl.CommandeServiceImpl;
import services.impl.ProduitServiceImpl;

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
