package com.desktop.repositoryImpl;
import com.desktop.entity.Client;
import com.desktop.repository.ClientDao;
import com.desktop.repository.DaoFactory;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

public class ClientDaoImpl implements ClientDao {
    private final DaoFactory daoFactory;

    public ClientDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Client getClient(Client client) {
        Session session = null;
        Client res = null;
        try {
            session = daoFactory.getConnection();
            res = session.get(Client.class, client.getId());

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
    public List<Client> getAll(String searchInput, Map<String, Object> filter) {
        Session session = null;
        List<Client> res = null;
        try {
            session = daoFactory.getConnection();
            String query = "from Client";

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

}
