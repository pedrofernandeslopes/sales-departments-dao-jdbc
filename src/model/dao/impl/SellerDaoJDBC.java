package model.dao.impl;

import model.dao.SellerDao;
import model.entities.Seller;

public class SellerDaoJDBC extends SellerDao {

    @Override
    public void insert(Seller obj) {
        System.out.println("Seller inserted!");
    }

    @Override
    public void update(Seller obj) {
        System.out.println("Seller updated!");
    }

    @Override
    public void deleteById(Integer id) {
        System.out.println("Seller deleted!");
    }

    @Override
    public Seller findById(Integer id) {
        System.out.println("Seller found!");
        return new Seller(1, "Bob", "bob@gmail.com", null, 3000.0, null);
    }
}
