package com.jpahibernate.jpahibernate.repository;

import com.jpahibernate.jpahibernate.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

    List<Product> findByPublished(boolean published);

    List<Product> findByNameContaining(String name);
}
