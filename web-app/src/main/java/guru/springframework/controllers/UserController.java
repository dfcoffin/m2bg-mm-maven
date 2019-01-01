package guru.springframework.controllers;

import guru.springframework.converters.UserMapper;
import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

/**
 * Created by Donald F. Coffin on 2019-01-01 at 13:00
 **/
public class UserController {

    User saveUser(UserCommand command) {

        // Fake Implementation
        return UserMapper.INSTANCE.userCommandToUser(command);
    }
}
