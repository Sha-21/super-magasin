package controllers;

import models.Commande;
import models.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.impl.CommandeServiceImpl;
import services.impl.ProduitServiceImpl;

import java.util.List;

@RestController
@RequestMapping("produit")
@CrossOrigin
public class ProduitController {
    @Autowired
    private ProduitServiceImpl service;

    @GetMapping("")
    public List<Produit> findAll(){ return this.service.findall(); }

    @GetMapping("{id}")
    public Produit findById(@PathVariable Long id){return this.service.findById(id);}

    @PostMapping("")
    public Produit save(@RequestBody Produit produit){ return this.service.save(produit); };

    @PutMapping("")
    public Produit update(@RequestBody Produit produit){ return this.service.update(produit);}

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){ this.service.delete(id); }
}
