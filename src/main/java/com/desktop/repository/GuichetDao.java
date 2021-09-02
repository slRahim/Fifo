package com.desktop.repository;

import com.desktop.entity.Guichet;

import java.util.List;
import java.util.Map;

public interface GuichetDao {
    Guichet getGuichet(Guichet guichet);
    List<Guichet> getAll(String searchInput , Map<String , Object> filter);
    Guichet addGuichet(Guichet guichet);
    Guichet editGuichet(Guichet guichet);
    int dellGuichet(Guichet guichet);
}
