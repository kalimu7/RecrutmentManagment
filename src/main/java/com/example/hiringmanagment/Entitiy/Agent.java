package com.example.hiringmanagment.Entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agent {

    @Id
    private String email;

    private String password;


}
