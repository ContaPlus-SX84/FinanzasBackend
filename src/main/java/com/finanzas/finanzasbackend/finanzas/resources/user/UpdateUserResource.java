package com.finanzas.finanzasbackend.finanzas.resources.user;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserResource {
    private String name;
    private String username;
    private String password;
}