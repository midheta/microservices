package com.abctechgroup.usersservice.service;

import com.abctechgroup.usersservice.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {

    UserDto createUser(UserDto user);
    UserDto getUserDetailsByEmail(String email);
    UserDto getUserByUserId(String userId);
}
