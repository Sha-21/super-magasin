package com.m2i.formation.magasin.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="categorie")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Categorie{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "nom")
    private String nom;
/*
    @OneToMany(mappedBy = "categorie")
    private Set<Produit> produitSet;*/
}