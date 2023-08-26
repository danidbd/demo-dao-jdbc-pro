package model.dao;

import model.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellersDao  createSellerDao(){
        return new SellerDaoJDBC();
    }

}
