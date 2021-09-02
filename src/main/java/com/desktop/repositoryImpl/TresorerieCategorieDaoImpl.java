package com.desktop.repositoryImpl;

import com.desktop.entity.TresorerieCategorie;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.TresorerieCategorieDao;

import java.util.Map;

public class TresorerieCategorieDaoImpl implements TresorerieCategorieDao {
    private final DaoFactory daoFactory ;

    public TresorerieCategorieDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public TresorerieCategorie getTresorerieCategorie(TresorerieCategorie categorie) {
        return null;
    }

    @Override
    public TresorerieCategorie getAll(String searchInput, Map<String, Object> filter) {
        return null;
    }

    @Override
    public TresorerieCategorie addTresorerieCategorie(TresorerieCategorie categorie) {
        return null;
    }

    @Override
    public TresorerieCategorie editTresorerieCategorie(TresorerieCategorie categorie) {
        return null;
    }

    @Override
    public int dellTresorerieCategorie(TresorerieCategorie categorie) {
        return 0;
    }
}
