package com.javaproject.musicapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaproject.musicapp.entity.User;





@Repository
public interface UserDao extends JpaRepository<User,Integer> {


}