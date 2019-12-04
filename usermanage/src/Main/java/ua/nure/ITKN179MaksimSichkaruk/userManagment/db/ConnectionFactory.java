package ua.nure.ITKN179MaksimSichkaruk.userManagment.db;

import java.sql.Connection;

public interface ConnectionFactory {
	Connection createConnection() throws DatabaseExeption;
}
