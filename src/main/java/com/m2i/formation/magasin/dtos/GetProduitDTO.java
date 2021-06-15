package com.m2i.formation.magasin.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProduitDTO {
    private String nom;
    private double prix;
}
