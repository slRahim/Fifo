package com.desktop.repository;

import com.desktop.entity.Tresorerie;

import java.util.List;
import java.util.Map;

public interface TresorerieDao {
    Tresorerie getTresorerie(Tresorerie tresorerie);
    List<Tresorerie> getAll(String searchInput , Map<String , Object> filter);

}
