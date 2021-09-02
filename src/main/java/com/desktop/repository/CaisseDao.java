package com.desktop.repository;

import com.desktop.entity.Caisse;

import java.util.List;
import java.util.Map;

public interface CaisseDao {
    Caisse getCaisse(Caisse caisse);
    List<Caisse> getAll(String searchInput , Map<String , Object> filter);
    Caisse addCaisse(Caisse caisse);
    Caisse editCaisse(Caisse caisse);
    int dellCaisse(Caisse caisse);

}
