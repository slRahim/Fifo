package com.desktop.repository;

import com.desktop.repositoryImpl.UserDaoImp;
import com.desktop.util.HibernateUtil;
import org.hibernate.Session;

public class DaoFactory {

    public static DaoFactory instance;
    private Session session ;

    DaoFactory() {

    }

    public static DaoFactory getInstance(){
        if (instance == null){
            return  new DaoFactory();
        }
        return instance ;
    }

    public Session getConnection(){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
        } catch (Exception e) {
            System.out.println("Ereure 2");
        }
        return session;
    }

    public UserDao getUserDao(){
        return new UserDaoImp(this);
    }
}
