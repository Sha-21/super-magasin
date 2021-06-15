package dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetProduitDTO {
    private String nom;
    private double prix;
}
