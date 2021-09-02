package com.desktop.repository;

import com.desktop.repositoryImpl.*;
import com.desktop.util.HibernateUtil;
import org.hibernate.Session;

public class DaoFactory {

    public static DaoFactory instance;
    private Session session;

    DaoFactory() {

    }

    public static DaoFactory getInstance() {
        if (instance == null) {
            return new DaoFactory();
        }
        return instance;
    }

    public Session getConnection() {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
        } catch (Exception e) {
            System.out.println("Ereure 2");
        }
        return session;
    }

    public CaisseDao getCaisseDao() {
        return new CaisseDaoImpl(this);
    }

    public ChargeDao getChargeDao() {
        return new ChargeDaoImpl(this);
    }

    public ClientDao getClientDao() {
        return new ClientDaoImpl(this);
    }

    public EmployeeDao getEmployeeDao() {
        return new EmployeeDaoImpl(this);
    }

    public GuichetDao getGuichetDao() {
        return new GuichetDaoImpl(this);
    }

    public ModalitePaymentDao getModalitePaymentDao() {
        return new ModalitePaymentDaoImpl(this);
    }

    public ProfileDao getProfileDao() {
        return new ProfileDaoImpl(this);
    }

    public TicketDao getTicketDao() {
        return new TicketDaoImpl(this);
    }

    public TresorerieCategorieDao getTresorerieCategorieDao() {
        return new TresorerieCategorieDaoImpl(this);
    }

    public TresorerieDao getTresorerieDao() {
        return new TresorerieDaoImpl(this);
    }

    public UserDao getUserDao() {
        return new UserDaoImpl(this);
    }
}
