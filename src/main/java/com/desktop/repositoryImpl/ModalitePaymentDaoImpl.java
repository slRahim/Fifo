package com.desktop.repositoryImpl;

import com.desktop.entity.Charge;
import com.desktop.entity.ModalitePayement;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.ModalitePaymentDao;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

public class ModalitePaymentDaoImpl implements ModalitePaymentDao {
    private final DaoFactory daoFactory ;

    public ModalitePaymentDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public ModalitePayement getModalitePayment(ModalitePayement modalitePayement) {
        Session session = null;
        ModalitePayement res = null;
        try {
            session = daoFactory.getConnection();
            res = session.get(ModalitePayement.class, modalitePayement.getId());

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
    public List<ModalitePayement> getAll(String searchInput, Map<String, Object> filter) {
        Session session = null;
        List<ModalitePayement> res = null;
        try {
            session = daoFactory.getConnection();
            String query = "from ModalitePayement";

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
