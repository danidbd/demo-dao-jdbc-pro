package model.dao;

import model.dao.impl.SellerDaoJDBC;
import db.DB;

public class DaoFactory {
    public static SellersDao  createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());

    }

}
