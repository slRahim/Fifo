package com.desktop.repositoryImpl;

import com.desktop.entity.Caisse;
import com.desktop.repository.CaisseDao;
import com.desktop.repository.DaoFactory;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

public class CaisseDaoImpl implements CaisseDao {
    private final DaoFactory daoFactory ;

    public CaisseDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Caisse getCaisse(Caisse caisse) {
        Session session = null;
        Caisse res = null;
        try {
            session = daoFactory.getConnection();
            res = session.get(Caisse.class , caisse.getId());

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return res;
    }

    @Override
    public List<Caisse> getAll(String searchInput, Map<String, Object> filter) {
        Session session = null;
        List<Caisse> res = null;
        try {
            session = daoFactory.getConnection();
            String query = "from Caisse" ;

            searchInput = (searchInput == null) ? "" : searchInput ;
//            query += "nom like '%"+searchInput+"%'" ;
//            query += " or userName like '%"+searchInput+"%'";

            if(filter != null){
//                query += (filter.get("crudCaisee") != null && filter.get("crudCaisee").equals(true))? " And crudCaisse = 1":"";
//                query += (filter.get("crudCaisee") != null && filter.get("crudCaisee").equals(true))? " And crudCaisse = 1":"";
//                query += (filter.get("crudCaisee") != null && filter.get("crudCaisee").equals(true))? " And crudCaisse = 1":"";
//                query += (filter.get("crudCaisee") != null && filter.get("crudCaisee").equals(true))? " And crudCaisse = 1":"";
//                query += (filter.get("crudCaisee") != null && filter.get("crudCaisee").equals(true))? " And crudCaisse = 1":"";

            }
            res = session.createQuery(query).list();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return res;
    }

}
