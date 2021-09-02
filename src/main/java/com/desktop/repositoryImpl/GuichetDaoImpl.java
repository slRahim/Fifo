package com.desktop.repositoryImpl;

import com.desktop.entity.Guichet;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.GuichetDao;

import java.util.List;
import java.util.Map;

public class GuichetDaoImpl implements GuichetDao {
    private final DaoFactory daoFactory ;

    public GuichetDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Guichet getGuichet(Guichet guichet) {
        return null;
    }

    @Override
    public List<Guichet> getAll(String searchInput, Map<String, Object> filter) {
        return null;
    }

    @Override
    public Guichet addGuichet(Guichet guichet) {
        return null;
    }

    @Override
    public Guichet editGuichet(Guichet guichet) {
        return null;
    }

    @Override
    public int dellGuichet(Guichet guichet) {
        return 0;
    }
}
