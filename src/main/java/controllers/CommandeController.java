package controllers;

import models.Client;
import models.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.impl.ClientServiceImpl;
import services.impl.CommandeServiceImpl;

import java.util.List;

@RestController
@RequestMapping("commande")
@CrossOrigin
public class CommandeController {
    @Autowired
    private CommandeServiceImpl service;

    @GetMapping("")
    public List<Commande> findAll(){ return this.service.findall(); }

    @GetMapping("{id}")
    public Commande findById(@PathVariable Long id){return this.service.findById(id);}

    @PostMapping("")
    public Commande save(@RequestBody Commande commande){ return this.service.save(commande); };

    @PutMapping("")
    public Commande update(@RequestBody Commande commande){ return this.service.update(commande);}

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){ this.service.delete(id); }
}
