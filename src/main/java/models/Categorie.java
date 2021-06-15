package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="categorie")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Categorie{

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String nom;
    private double prix;
}