package com.desktop.repositoryImpl;


import com.desktop.repository.DaoFactory;
import com.desktop.repository.UserDao;

public class UserDaoImp implements UserDao {
    private final DaoFactory daoFactory ;

    public UserDaoImp(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public void getUser(int id) {
//        Session session = daoFactory.getConnection();
//
//        session.beginTransaction();
//        List<User> users = session.createQuery("from User where username = '"+user.getUsername()+"' and password = '"+user.getPassword()+"'").list();
//        session.getTransaction().commit();

        System.out.println("from get user userdaoImpl "+id);
    }
}
