package org.xproce.graphqldemosat.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xproce.graphqldemosat.dao.entities.User;
import org.xproce.graphqldemosat.dao.repositories.UserRepository;
import org.xproce.graphqldemosat.dtos.UserDto;
import org.xproce.graphqldemosat.dtos.UserDtoInscription;
import org.xproce.graphqldemosat.service.mappers.UserMapper;

import java.util.List;

@Service
@AllArgsConstructor
public class UserManager implements UserService {


    UserRepository userRepository;

    UserMapper mapper;

    @Override
    public UserDto getUserByID(Long id) {
        /*User user = userRepository.findById(id).get();
        UserDto userDto = mapper.fromUserToUserDto(user);
        return userDto;*/

        return mapper.fromUserToUserDto(userRepository.findById(id).get());
    }

    @Override
    public List<UserDto> getUsers() {
        return null;
    }

    @Override
    public UserDto addUser(UserDtoInscription userDtoInscription) {
        /*User user = mapper.fromUserDtoInscriptionToUser(userDtoInscription);
        user = userRepository.save(user);
        return mapper.fromUserToUserDto(user);*/

        return mapper.fromUserToUserDto(userRepository.save(mapper.fromUserDtoInscriptionToUser(userDtoInscription)));
    }
}
