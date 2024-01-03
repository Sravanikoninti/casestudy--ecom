package com.casestudy.util;

import java.sql.Connection;

public class DBConnection {
    static Connection connection = null;

	public static Connection getConnection()
	{
		String propstr=DBPropertyUtil.getConnectionString("C:\\Users\\KRANTHI KIRAN\\eclipse-workspace\\casestudy\\src\\com\\casestudy\\util\\db.properties");
		connection=DBConnUtil.getConnection(propstr);
		return connection;
	}
}
