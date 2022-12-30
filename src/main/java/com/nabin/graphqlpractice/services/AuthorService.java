package com.nabin.graphqlpractice.services;

import com.nabin.graphqlpractice.dtos.AuthorDto;
import com.nabin.graphqlpractice.entities.Author;

import java.util.List;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-12-27
 */
public interface AuthorService {
    Author save(AuthorDto authorDto);
    Author findById(Integer id);
    List<Author> findAll();
    void deleteById(Integer id);
    Author findFirstAuthor();
}
