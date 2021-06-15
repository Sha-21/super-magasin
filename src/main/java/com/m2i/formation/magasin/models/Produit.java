package com.m2i.formation.magasin.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produit")
public class Produit {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String nom;
    private double prix;

    @ManyToOne
    @JoinColumn(name = "categorie_id", nullable = false)
    private Categorie categorie;

    /*
    @ManyToMany(mappedBy = "produit")
    Set<Commande> commande;*/

}
