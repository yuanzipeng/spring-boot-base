package com.boot.cache.service;

import com.boot.cache.entity.User;
public interface UserService {
    // 增、改、查、删
    User addUser (User user) ;
    User updateUser (Integer id) ;
    User selectUser (Integer id) ;
    void deleteUser (Integer id);
}
