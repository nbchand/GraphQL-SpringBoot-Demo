package com.nabin.graphqlpractice.repositories;

import com.nabin.graphqlpractice.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-12-27
 */
public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findAllByAuthorId(Integer authorId);
}
