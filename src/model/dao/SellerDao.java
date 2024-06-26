package model.dao;

import model.entities.Seller;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class SellerDao {
    public void insert(Seller obj) {
        System.out.println("Seller inserted!");
    }

    public void update(Seller obj) {
        System.out.println("Seller updated!");
    }

    public void deleteById(Integer id) {
        System.out.println("Seller deleted!");
    }

    public Seller findById(Integer id) {
        System.out.println("Seller found!");
        return new Seller(1, "Bob", "bob@gmail.com", null, 3000.0, null);
    }

    public List<Seller> findAll() {
        System.out.println("Seller found!");
        return new ArrayList<>();
    }

    public List<Seller> findByDepartment(Department department) {
        System.out.println("Seller found!");
        return new ArrayList<>();
    }

}
