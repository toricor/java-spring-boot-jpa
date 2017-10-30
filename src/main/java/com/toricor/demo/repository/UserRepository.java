package com.toricor.demo.repository;

import com.toricor.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //@Query("SELECT x FROM user x ORDER BY x.name") // JPQLを記述
    //List<User> findAllOrderByName();

}
