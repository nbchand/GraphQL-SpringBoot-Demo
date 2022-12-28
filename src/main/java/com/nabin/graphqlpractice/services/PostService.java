package com.nabin.graphqlpractice.services;

import com.nabin.graphqlpractice.entities.Post;

import java.util.List;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-12-27
 */
public interface PostService {
    Post save(Post post);
    Post findById(Integer id);
    List<Post> findAll();
    void deleteById(Integer id);
    List<Post> getRecentPosts(Integer count, Integer offset);
    List<Post> getAuthorPosts(Integer authorId);
}
