package com.example.hiringmanagment.Entitiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Postule {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String nom_complet;
     private String cv;
     private int tel;
     private String motivation;
     @ManyToOne
    private Offre offre;

}
