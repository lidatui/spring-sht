package com.github.miemiedev.sht.repo;

import com.github.miemiedev.sht.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
    List<User> findAll();
}
