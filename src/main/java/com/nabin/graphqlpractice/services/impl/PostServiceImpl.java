package com.nabin.graphqlpractice.services.impl;

import com.nabin.graphqlpractice.entities.Post;
import com.nabin.graphqlpractice.repositories.PostRepo;
import com.nabin.graphqlpractice.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-12-27
 */
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepo postRepo;

    @Override
    public Post save(Post post) {
        return postRepo.save(post);
    }

    @Override
    public Post findById(Integer id) {
        return postRepo.findById(id).orElse(null);
    }

    @Override
    public List<Post> findAll() {
        return postRepo.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        postRepo.deleteById(id);
    }

    @Override
    public List<Post> getRecentPosts(Integer count, Integer offset) {
        return postRepo.findAll().stream()
                .skip(count)
                .limit(offset)
                .collect(Collectors.toList());
    }

    @Override
    public List<Post> getAuthorPosts(Integer authorId) {
        return postRepo.findAllByAuthorId(authorId);
    }
}
