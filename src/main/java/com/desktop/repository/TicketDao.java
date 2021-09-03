package com.desktop.repository;

import com.desktop.entity.Ticket;

import java.util.List;
import java.util.Map;

public interface TicketDao {
    Ticket getTicket(Ticket ticket);
    List<Ticket> getAll(String searchInput , Map<String , Object> filter);
    int printTicket(Ticket ticket);


}
