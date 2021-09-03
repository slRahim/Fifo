package com.desktop.repositoryImpl;
import com.desktop.entity.Guichet;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.GuichetDao;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

public class GuichetDaoImpl implements GuichetDao {
    private final DaoFactory daoFactory;

    public GuichetDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Guichet getGuichet(Guichet guichet) {
        Session session = null;
        Guichet res = null;
        try {
            session = daoFactory.getConnection();
            res = session.get(Guichet.class, guichet.getId());

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
    public List<Guichet> getAll(String searchInput, Map<String, Object> filter) {
        Session session = null;
        List<Guichet> res = null;
        try {
            session = daoFactory.getConnection();
            String query = "from Guichet";

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
