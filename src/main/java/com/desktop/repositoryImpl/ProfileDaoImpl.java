package com.desktop.repositoryImpl;
import com.desktop.entity.Profile;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.ProfileDao;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

public class ProfileDaoImpl implements ProfileDao {
    private final DaoFactory daoFactory;

    public ProfileDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Profile getProfile(Profile profile) {
        Session session = null;
        Profile res = null;
        try {
            session = daoFactory.getConnection();
            res = session.get(Profile.class, profile.getId());

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
    public List<Profile> getAll(String searchInput, Map<String, Object> filter) {
        Session session = null;
        List<Profile> res = null;
        try {
            session = daoFactory.getConnection();
            String query = "from Profile";

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
