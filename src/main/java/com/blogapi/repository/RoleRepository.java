package com.blogapi.repository;

import com.blogapi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // Additional query methods if needed
    Optional<Role> findByName(String name);
}