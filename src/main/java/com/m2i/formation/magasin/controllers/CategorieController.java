package com.m2i.formation.magasin.controllers;

import com.m2i.formation.magasin.models.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.m2i.formation.magasin.services.impl.CategorieServiceImpl;

import java.util.List;

@RestController
@RequestMapping("categorie")
@CrossOrigin
public class CategorieController {

    @Autowired
    private CategorieServiceImpl service;

    @GetMapping("")
    public List<Categorie> findAll(){ return this.service.findall(); }

    @GetMapping("{id}")
    public Categorie findById(@PathVariable Long id){return this.service.findById(id);}

    @PostMapping("")
    public Categorie save(@RequestBody Categorie categorie){ return this.service.save(categorie); };

    @PutMapping("")
    public Categorie update(@RequestBody Categorie categorie){ return this.service.update(categorie);}

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){ this.service.delete(id); }

}
