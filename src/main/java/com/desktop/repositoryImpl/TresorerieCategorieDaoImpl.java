package com.desktop.repositoryImpl;
import com.desktop.entity.TresorerieCategorie;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.TresorerieCategorieDao;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

public class TresorerieCategorieDaoImpl implements TresorerieCategorieDao {
    private final DaoFactory daoFactory ;

    public TresorerieCategorieDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public TresorerieCategorie getTresorerieCategorie(TresorerieCategorie categorie) {
        Session session = null;
        TresorerieCategorie res = null;
        try {
            session = daoFactory.getConnection();
            res = session.get(TresorerieCategorie.class, categorie.getId());

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
    public List<TresorerieCategorie> getAll(String searchInput, Map<String, Object> filter) {
        Session session = null;
        List<TresorerieCategorie> res = null;
        try {
            session = daoFactory.getConnection();
            String query = "from TresorerieCategorie";

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
