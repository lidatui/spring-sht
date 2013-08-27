package com.github.miemiedev.sht.repo;

import com.github.miemiedev.sht.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import java.math.BigInteger;
import java.util.List;

public interface UserDao extends JpaRepository<User, Long>,QueryDslPredicateExecutor<User> {
    List<User> findAll();

    User getByName(String name);

    Page findByNameLike(String name, Pageable pageable);

    //countBy要1.4才有这个功能
    @Query(value = "select count(1) from users u where u.name like ?1", nativeQuery = true)
    BigInteger countByNameLike(String name);

    //原生SQL没法把返回结果换成Page，换成Page后当前版本会把原生SQL当成JPQL,所以转换的Count SQL就变成了Count JPQL了
    Page findNativeNameLike(String name, Pageable pageable);
    BigInteger countNativeNameLike(String name);
}
