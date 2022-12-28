package com.nabin.graphqlpractice.controllers;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-12-27
 */

import com.nabin.graphqlpractice.entities.Author;
import com.nabin.graphqlpractice.entities.Post;
import com.nabin.graphqlpractice.services.AuthorService;
import com.nabin.graphqlpractice.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final AuthorService authorService;

    //method name must be same as schema query name
    @QueryMapping
    public List<Post> recentPosts(@Argument int count, @Argument int offset) {
        return postService.getRecentPosts(count, offset);
    }

    @SchemaMapping
    public Author author(Post post) {
        return authorService.findById(post.getAuthorId());
    }

    @SchemaMapping(typeName = "Post", field="first_author")
    public Author getFirstAuthor() {
        return authorService.findFirstAuthor();
    }

    @MutationMapping
    public Post createPost(@Argument String title, @Argument String text,
                           @Argument String category, @Argument Integer authorId) {
        Post post = new Post();
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthorId(authorId);
        return postService.save(post);
    }
}
