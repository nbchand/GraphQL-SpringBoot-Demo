package com.nabin.graphqlpractice.repositories;

import com.nabin.graphqlpractice.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-12-27
 */
public interface AuthorRepo extends JpaRepository<Author, Integer> {
}
