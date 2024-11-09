package org.xproce.graphqldemosat.dtos;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserDtoInscription {

    private String name;
    private String email;
    private String password;
}
