package com.nabin.graphqlpractice.controllers;

import com.nabin.graphqlpractice.dtos.AuthorDto;
import com.nabin.graphqlpractice.entities.Author;
import com.nabin.graphqlpractice.entities.Post;
import com.nabin.graphqlpractice.services.AuthorService;
import com.nabin.graphqlpractice.services.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-12-28
 */
@RestController
@RequiredArgsConstructor
@Slf4j
public class AuthorController {

    private final AuthorService authorService;
    private final PostService postService;

    @QueryMapping
    public List<Author> fetchAuthors() {
        return authorService.findAll();
    }

    @SchemaMapping
    public List<Post> posts(Author author) {
        return postService.getAuthorPosts(author.getId());
    }

    @MutationMapping(name = "createAuthor")
    public Author createAuthor(@Valid @Argument AuthorDto authorDto) {
        return authorService.save(authorDto);
    }
}
