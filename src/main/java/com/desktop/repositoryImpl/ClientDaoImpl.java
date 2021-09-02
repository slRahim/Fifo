package com.desktop.repositoryImpl;

import com.desktop.entity.Client;
import com.desktop.repository.ClientDao;
import com.desktop.repository.DaoFactory;

import java.util.List;
import java.util.Map;

public class ClientDaoImpl implements ClientDao {
    private final DaoFactory daoFactory ;

    public ClientDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Client getClient(Client client) {
        return null;
    }

    @Override
    public List<Client> getAll(String searchInput, Map<String, Object> filter) {
        return null;
    }

    @Override
    public Client addClient(Client client) {
        return null;
    }

    @Override
    public Client editClient(Client client) {
        return null;
    }

    @Override
    public int dellClient(Client client) {
        return 0;
    }
}
