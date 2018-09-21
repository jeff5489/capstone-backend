package com.techprimers.db.springbootmysql.repository;

import com.techprimers.db.springbootmysql.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
