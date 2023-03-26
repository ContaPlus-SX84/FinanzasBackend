package com.finanzas.finanzasbackend.finanzas.resources.user;


import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UserResource {

    private Long id;

    private String name;

    private String username;

    private String password;

}