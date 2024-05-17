package com.in28minutes.rest.webservices.resftfulwebservices.jpa;

import com.in28minutes.rest.webservices.resftfulwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
