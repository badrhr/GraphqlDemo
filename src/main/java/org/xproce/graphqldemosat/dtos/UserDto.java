package org.xproce.graphqldemosat.dtos;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserDto {

    private String name;
    private String email;
}
