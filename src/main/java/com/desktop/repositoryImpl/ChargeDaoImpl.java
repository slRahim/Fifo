package com.desktop.repositoryImpl;
import com.desktop.entity.Charge;
import com.desktop.repository.ChargeDao;
import com.desktop.repository.DaoFactory;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

public class ChargeDaoImpl implements ChargeDao {
    private final DaoFactory daoFactory;

    public ChargeDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Charge getCharge(Charge charge) {
        Session session = null;
        Charge res = null;
        try {
            session = daoFactory.getConnection();
            res = session.get(Charge.class, charge.getId());

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
    public List<Charge> getAll(String searchInput, Map<String, Object> filter) {
        Session session = null;
        List<Charge> res = null;
        try {
            session = daoFactory.getConnection();
            String query = "from Charge";

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
