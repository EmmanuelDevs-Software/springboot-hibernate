package com.jpahibernate.jpahibernate.repository;


import com.jpahibernate.jpahibernate.model.Comment;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByProductId(Long productId);

    @Transactional
    void deleteByProductId(long productId);
}
