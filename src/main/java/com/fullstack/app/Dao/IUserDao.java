package com.fullstack.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.app.entity.User;

@Repository
public interface IUserDao extends JpaRepository<User, Long>{

}
