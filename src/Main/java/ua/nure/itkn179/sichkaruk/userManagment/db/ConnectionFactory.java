package Main.java.ua.nure.itkn179.sichkaruk.userManagment.db;

import java.sql.Connection;

public interface ConnectionFactory {
	Connection createConnection() throws DatabaseExeption;
}
