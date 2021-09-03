package com.desktop.repository;

import com.desktop.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    User getUser(User user);
    List<User> getAll(String searchInput , Map<String , Object> filter);

}
