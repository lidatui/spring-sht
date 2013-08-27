package com.github.miemiedev.sht.repo;

import com.github.miemiedev.sht.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long>,QueryDslPredicateExecutor<User> {
    List<User> findAll();

    User getByName(String name);

    List findNativeLikeName(String name, Pageable pageable);

    Page findLikeName(String name, Pageable pageable);
}
