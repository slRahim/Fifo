package com.desktop.repository;

import com.desktop.entity.Charge;

import java.util.List;
import java.util.Map;

public interface ChargeDao {
    Charge getCharge(Charge charge);
    List<Charge> getAll(String searchInput , Map<String , Object> filter);

}
