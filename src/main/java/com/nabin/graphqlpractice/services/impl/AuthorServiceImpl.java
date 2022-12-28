package com.nabin.graphqlpractice.services.impl;

import com.nabin.graphqlpractice.entities.Author;
import com.nabin.graphqlpractice.repositories.AuthorRepo;
import com.nabin.graphqlpractice.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-12-27
 */
@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepo authorRepo;

    @Override
    public Author save(Author author) {
        return authorRepo.save(author);
    }

    @Override
    public Author findById(Integer id) {
        return authorRepo.findById(id).orElse(null);
    }

    @Override
    public List<Author> findAll() {
        return authorRepo.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        authorRepo.deleteById(id);
    }

    @Override
    public Author findFirstAuthor() {
        return authorRepo.findAll().stream().findFirst().orElse(null);
    }
}
