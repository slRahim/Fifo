package com.desktop.repositoryImpl;

import com.desktop.entity.Charge;
import com.desktop.repository.ChargeDao;
import com.desktop.repository.DaoFactory;

import java.util.List;
import java.util.Map;

public class ChargeDaoImpl implements ChargeDao {
    private final DaoFactory daoFactory ;

    public ChargeDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Charge getCharge(Charge charge) {
        return null;
    }

    @Override
    public List<Charge> getAll(String searchInput, Map<String, Object> filter) {
        return null;
    }

    @Override
    public Charge addCharge(Charge charge) {
        return null;
    }

    @Override
    public Charge editCharge(Charge charge) {
        return null;
    }

    @Override
    public int dellCharge(Charge charge) {
        return 0;
    }
}
