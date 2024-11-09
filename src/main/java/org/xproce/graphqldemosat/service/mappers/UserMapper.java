package org.xproce.graphqldemosat.service.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.xproce.graphqldemosat.dao.entities.User;
import org.xproce.graphqldemosat.dtos.UserDto;
import org.xproce.graphqldemosat.dtos.UserDtoInscription;

@Component
public class UserMapper {

    ModelMapper mapper = new ModelMapper();

    public UserDto fromUserToUserDto(User user){
        return mapper.map(user, UserDto.class);
    }

    public User fromUserDtoToUser(UserDto userDto){
        return mapper.map(userDto, User.class);
    }

    public User fromUserDtoInscriptionToUser(UserDtoInscription userDtoInscription){
        return mapper.map(userDtoInscription, User.class);
    }

}
