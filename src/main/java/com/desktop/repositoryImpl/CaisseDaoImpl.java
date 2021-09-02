package com.desktop.repositoryImpl;

import com.desktop.entity.Caisse;
import com.desktop.repository.CaisseDao;
import com.desktop.repository.DaoFactory;

import java.util.List;
import java.util.Map;

public class CaisseDaoImpl implements CaisseDao {
    private final DaoFactory daoFactory ;

    public CaisseDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Caisse getCaisse(Caisse caisse) {
        return null;
    }

    @Override
    public List<Caisse> getAll(String searchInput, Map<String, Object> filter) {
        return null;
    }

    @Override
    public Caisse addCaisse(Caisse caisse) {
        return null;
    }

    @Override
    public Caisse editCaisse(Caisse caisse) {
        return null;
    }

    @Override
    public int dellCaisse(Caisse caisse) {
        return 0;
    }
}
