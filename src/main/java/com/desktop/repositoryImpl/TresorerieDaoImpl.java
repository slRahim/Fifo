package com.desktop.repositoryImpl;

import com.desktop.entity.Tresorerie;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.TresorerieDao;

import java.util.List;
import java.util.Map;

public class TresorerieDaoImpl implements TresorerieDao {
    private final DaoFactory daoFactory ;

    public TresorerieDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Tresorerie getTresorerie(Tresorerie tresorerie) {
        return null;
    }

    @Override
    public List<Tresorerie> getAll(String searchInput, Map<String, Object> filter) {
        return null;
    }

    @Override
    public Tresorerie addTresorerie(Tresorerie tresorerie) {
        return null;
    }

    @Override
    public Tresorerie editTresorerie(Tresorerie tresorerie) {
        return null;
    }

    @Override
    public int dellTresorerie(Tresorerie tresorerie) {
        return 0;
    }
}
