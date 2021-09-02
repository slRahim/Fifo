package com.desktop.repositoryImpl;


import com.desktop.entity.User;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.UserDao;

import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    private final DaoFactory daoFactory ;

    public UserDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public User getUser(User user) {
//        Session session = daoFactory.getConnection();
//
//        session.beginTransaction();
//        List<User> users = session.createQuery("from User where username = '"+user.getUsername()+"' and password = '"+user.getPassword()+"'").list();
//        session.getTransaction().commit();
//
//        System.out.println("from get user userdaoImpl "+id);
        return null;
    }

    @Override
    public List<User> getAll(String searchInput, Map<String, Object> filter) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User editUser(User user) {
        return null;
    }

    @Override
    public int dellUser(User User) {
        return 0;
    }



}
