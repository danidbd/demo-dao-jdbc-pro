package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conn;

	static {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula", "root", "1234567");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
