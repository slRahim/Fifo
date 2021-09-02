package com.desktop.repositoryImpl;

import com.desktop.entity.Ticket;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.TicketDao;

import java.util.List;
import java.util.Map;

public class TicketDaoImpl implements TicketDao {
    private final DaoFactory daoFactory ;

    public TicketDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Ticket getTicket(Ticket ticket) {
        return null;
    }

    @Override
    public List<Ticket> getAll(String searchInput, Map<String, Object> filter) {
        return null;
    }

    @Override
    public Ticket addTicket(Ticket ticket) {
        return null;
    }

    @Override
    public Ticket editTicket(Ticket ticket) {
        return null;
    }

    @Override
    public int dellTicket(Ticket ticket) {
        return 0;
    }

    @Override
    public int printTicket(Ticket ticket) {
        return 0;
    }
}
