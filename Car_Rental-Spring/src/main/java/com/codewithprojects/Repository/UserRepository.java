package com.codewithprojects.Repository;

import com.codewithprojects.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository  <User, Long>{
}
