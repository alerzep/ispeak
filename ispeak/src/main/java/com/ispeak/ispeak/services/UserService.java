package com.ispeak.ispeak.services;

import com.ispeak.ispeak.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
       this.userRepository = userRepository;
   }

}
