package model.dao;

import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDao {
    public void insert(Department obj) {
        System.out.println("Department inserted!");
    }

    public void update(Department obj) {
        System.out.println("Department updated!");
    }

    public void deleteById(Integer id) {
        System.out.println("Department deleted!");
    }

    public Department findById(Integer id) {
        System.out.println("Department found!");
        return new Department(1, "Books");
    }

    public List<Department> findAll() {
        System.out.println("Department found!");
        return new ArrayList<>();
    }
}
