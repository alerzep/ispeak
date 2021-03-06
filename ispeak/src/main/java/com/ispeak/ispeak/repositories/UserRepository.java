package com.ispeak.ispeak.repositories;

import com.ispeak.ispeak.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
