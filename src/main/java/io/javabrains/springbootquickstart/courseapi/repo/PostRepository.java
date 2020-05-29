package io.javabrains.springbootquickstart.courseapi.repo;

import io.javabrains.springbootquickstart.courseapi.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
