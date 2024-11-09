package org.xproce.graphqldemosat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.xproce.graphqldemosat.dtos.UserDto;
import org.xproce.graphqldemosat.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;


    @QueryMapping
    public UserDto getUserByID(@Argument Long id) {
        return userService.getUserByID(id);
    }

}
