package com.desktop.repositoryImpl;

import com.desktop.entity.ModalitePayement;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.ModalitePaymentDao;

import java.util.List;
import java.util.Map;

public class ModalitePaymentDaoImpl implements ModalitePaymentDao {
    private final DaoFactory daoFactory ;

    public ModalitePaymentDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public ModalitePayement getModalitePayment(ModalitePayement modalitePayement) {
        return null;
    }

    @Override
    public List<ModalitePayement> getAll(String searchInput, Map<String, Object> filter) {
        return null;
    }

    @Override
    public ModalitePayement addModalitePayment(ModalitePayement modalitePayement) {
        return null;
    }

    @Override
    public ModalitePayement editModalitePayement(ModalitePayement modalitePayement) {
        return null;
    }

    @Override
    public int dellModalitePayment(ModalitePayement modalitePayement) {
        return 0;
    }
}
