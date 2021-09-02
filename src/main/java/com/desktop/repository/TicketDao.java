package com.desktop.repository;

import com.desktop.entity.Ticket;

import java.util.List;
import java.util.Map;

public interface TicketDao {
    Ticket getTicket(Ticket ticket);
    List<Ticket> getAll(String searchInput , Map<String , Object> filter);
    Ticket addTicket(Ticket ticket);
    Ticket editTicket(Ticket ticket);
    int dellTicket(Ticket ticket);
    int printTicket(Ticket ticket);


}
