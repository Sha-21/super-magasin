package com.m2i.formation.magasin.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetClientDTO {
    private String nom;
    private String prenom;
}
