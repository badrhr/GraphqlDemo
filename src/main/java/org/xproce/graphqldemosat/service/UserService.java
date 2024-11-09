package org.xproce.graphqldemosat.service;

import org.xproce.graphqldemosat.dao.entities.User;
import org.xproce.graphqldemosat.dtos.UserDto;
import org.xproce.graphqldemosat.dtos.UserDtoInscription;

import java.util.List;

public interface UserService {

    public UserDto getUserByID(Long id);
    public List<UserDto> getUsers();
    public UserDto addUser(UserDtoInscription userDtoInscription);
}
