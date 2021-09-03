package com.desktop.repositoryImpl;
import com.desktop.entity.Ticket;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.TicketDao;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

public class TicketDaoImpl implements TicketDao {
    private final DaoFactory daoFactory;

    public TicketDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Ticket getTicket(Ticket ticket) {
        Session session = null;
        Ticket res = null;
        try {
            session = daoFactory.getConnection();
            res = session.get(Ticket.class, ticket.getId());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return res;
    }

    @Override
    public List<Ticket> getAll(String searchInput, Map<String, Object> filter) {
        Session session = null;
        List<Ticket> res = null;
        try {
            session = daoFactory.getConnection();
            String query = "from Ticket";

            searchInput = (searchInput == null) ? "" : searchInput;
//            query += "nom like '%"+searchInput+"%'" ;
//            query += " or userName like '%"+searchInput+"%'";

            if (filter != null) {
//                query += (filter.get("crudCaisee") != null && filter.get("crudCaisee").equals(true))? " And crudCaisse = 1":"";
//                query += (filter.get("crudCaisee") != null && filter.get("crudCaisee").equals(true))? " And crudCaisse = 1":"";
//                query += (filter.get("crudCaisee") != null && filter.get("crudCaisee").equals(true))? " And crudCaisse = 1":"";
//                query += (filter.get("crudCaisee") != null && filter.get("crudCaisee").equals(true))? " And crudCaisse = 1":"";
//                query += (filter.get("crudCaisee") != null && filter.get("crudCaisee").equals(true))? " And crudCaisse = 1":"";

            }
            res = session.createQuery(query).list();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return res;
    }


    @Override
    public int printTicket(Ticket ticket) {
        return 0;
    }
}
