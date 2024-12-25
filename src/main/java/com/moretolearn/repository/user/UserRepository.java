package com.moretolearn.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moretolearn.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}