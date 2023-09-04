package application;

import model.dao.DaoFactory;
import model.dao.SellersDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {
        SellersDao sellersDao = DaoFactory.createSellerDao();

        Seller seller = sellersDao.findById(3);
        System.out.println(seller);

    }
}