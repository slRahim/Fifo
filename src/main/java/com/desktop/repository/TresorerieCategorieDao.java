package com.desktop.repository;

import com.desktop.entity.TresorerieCategorie;

import java.util.Map;

public interface TresorerieCategorieDao {
    TresorerieCategorie getTresorerieCategorie(TresorerieCategorie categorie);
    TresorerieCategorie getAll(String searchInput , Map<String , Object> filter);
    TresorerieCategorie addTresorerieCategorie(TresorerieCategorie categorie);
    TresorerieCategorie editTresorerieCategorie(TresorerieCategorie categorie);
    int dellTresorerieCategorie(TresorerieCategorie categorie);
}
