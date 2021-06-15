package com.m2i.formation.magasin.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "commande")
@NoArgsConstructor
@AllArgsConstructor
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToMany
    @JoinTable(
            name="commande_has_produit",
            joinColumns = @JoinColumn(name = "commande_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id", referencedColumnName = "id")
    )
    private List<Produit> produits;
}
