package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCdemo {
	public static void main(String[] arg) {
		DBBuilder dbbuilder = new QueryBld("eacore","Authority","SELECT * FROM <table> WHERE <column name> = ?");
		dbbuilder.execute();
	}
}
