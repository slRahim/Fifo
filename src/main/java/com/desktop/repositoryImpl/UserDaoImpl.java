package com.desktop.repositoryImpl;


import com.desktop.entity.User;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.UserDao;
import org.hibernate.Session;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    private final DaoFactory daoFactory ;

    public UserDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public User getUser(User user) {
        Session session = null;
        User res = null;
        try {
            session = daoFactory.getConnection();
            res = session.get(User.class , user.getId());

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
    public List<User> getAll(String searchInput, Map<String, Object> filter) {
        Session session = null;
        List<User> res = null;
        try {
            session = daoFactory.getConnection();
            String query = "from User where " ;

            searchInput = (searchInput == null) ? "" : searchInput ;
            query += "nom like '%"+searchInput+"%'" ;
            query += " or userName like '%"+searchInput+"%'";

            if(filter != null){
                query += (filter.get("crudCaisee") != null && filter.get("crudCaisee").equals(true))? " And crudCaisse = 1":"";
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
