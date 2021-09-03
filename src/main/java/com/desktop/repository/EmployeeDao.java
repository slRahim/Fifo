package com.desktop.repository;

import com.desktop.entity.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {
    Employee getEmployee(Employee employee);
    List<Employee> getAll(String searchInput , Map<String , Object> filter);

}
