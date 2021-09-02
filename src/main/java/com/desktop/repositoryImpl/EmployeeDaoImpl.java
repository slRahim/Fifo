package com.desktop.repositoryImpl;

import com.desktop.entity.Employee;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.EmployeeDao;

import java.util.List;
import java.util.Map;

public class EmployeeDaoImpl implements EmployeeDao {
    private final DaoFactory daoFactory ;

    public EmployeeDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Employee getEmployee(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getAll(String searchInput, Map<String, Object> filter) {
        return null;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee editEmployee(Employee employee) {
        return null;
    }

    @Override
    public int dellEmployee(Employee employee) {
        return 0;
    }
}
