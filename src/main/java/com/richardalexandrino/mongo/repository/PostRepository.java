package com.richardalexandrino.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.richardalexandrino.mongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
