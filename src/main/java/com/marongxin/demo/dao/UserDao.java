package com.marongxin.demo.dao;

import com.marongxin.demo.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserDao {
    List<User> findAllUser();
}
