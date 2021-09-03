package com.desktop.repositoryImpl;
import com.desktop.entity.Tresorerie;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.TresorerieDao;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

public class TresorerieDaoImpl implements TresorerieDao {
    private final DaoFactory daoFactory ;

    public TresorerieDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Tresorerie getTresorerie(Tresorerie tresorerie) {
        Session session = null;
        Tresorerie res = null;
        try {
            session = daoFactory.getConnection();
            res = session.get(Tresorerie.class, tresorerie.getId());

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
    public List<Tresorerie> getAll(String searchInput, Map<String, Object> filter) {
        Session session = null;
        List<Tresorerie> res = null;
        try {
            session = daoFactory.getConnection();
            String query = "from Tresorerie";

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
