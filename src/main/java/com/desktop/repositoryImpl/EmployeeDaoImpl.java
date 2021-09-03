package com.desktop.repositoryImpl;
import com.desktop.entity.Employee;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.EmployeeDao;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

public class EmployeeDaoImpl implements EmployeeDao {
    private final DaoFactory daoFactory;

    public EmployeeDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Employee getEmployee(Employee employee) {
        Session session = null;
        Employee res = null;
        try {
            session = daoFactory.getConnection();
            res = session.get(Employee.class, employee.getId());

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
    public List<Employee> getAll(String searchInput, Map<String, Object> filter) {
        Session session = null;
        List<Employee> res = null;
        try {
            session = daoFactory.getConnection();
            String query = "from Employee";

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
