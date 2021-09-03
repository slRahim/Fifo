package com.desktop.repository;

import com.desktop.entity.Client;

import java.util.List;
import java.util.Map;

public interface ClientDao {
    Client getClient(Client client);
    List<Client> getAll(String searchInput , Map<String , Object> filter);

}
