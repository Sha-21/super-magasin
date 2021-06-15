package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "commande")
@NoArgsConstructor
@AllArgsConstructor
public class Commande {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
}
