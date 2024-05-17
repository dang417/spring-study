package com.in28minutes.rest.webservices.resftfulwebservices.jpa;

import com.in28minutes.rest.webservices.resftfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
