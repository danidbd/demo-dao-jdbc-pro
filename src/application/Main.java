package application;

import model.dao.DaoFactory;
import model.dao.SellersDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {
        SellersDao sellersDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellersDao.findById(3);
        System.out.println(seller);

    }
}