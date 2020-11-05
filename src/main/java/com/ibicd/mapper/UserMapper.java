package com.ibicd.mapper;

import com.ibicd.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    void add(User user);

    User findById(Integer id);
}
