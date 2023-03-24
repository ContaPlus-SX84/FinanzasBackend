package com.finanzas.finanzasbackend.finanzas.domain.model.entity;
import lombok.*;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@With
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    private String username;
    private String password;
}
