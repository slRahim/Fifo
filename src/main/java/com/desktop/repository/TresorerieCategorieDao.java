package com.desktop.repository;

import com.desktop.entity.TresorerieCategorie;

import java.util.List;
import java.util.Map;

public interface TresorerieCategorieDao {
    TresorerieCategorie getTresorerieCategorie(TresorerieCategorie categorie);
    List<TresorerieCategorie> getAll(String searchInput , Map<String , Object> filter);
}
