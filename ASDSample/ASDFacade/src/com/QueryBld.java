package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryBld implements DBBuilder{
	private String driver;
	private String database;
	private String sql;
	
	
	private ResultSet rset;
	private CallableStatement call;
	private PreparedStatement prep;
	private Connection conn;
	

	public QueryBld(String driver, String database, String sql) {
		this.driver = driver;
		this.database = database;
		this.sql = sql;
	}


	@Override
	public void execute() {
		try{
			Class.forName(driver).newInstance();
			
			conn = DriverManager.getConnection(database);
			prep = conn.prepareStatement(sql);
			prep.setString(1, "<column value>");
			
			rset = prep.executeQuery();
			sql = "{call <stored procedure>( ?, ? )}";
			call = conn.prepareCall(sql);
			call.setInt(1, 1972);
			call.registerOutParameter(2, java.sql.Types.INTEGER);
			call.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			} catch (InstantiationException e) {
			e.printStackTrace();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			} catch (IllegalAccessException e) {
			e.printStackTrace();
			} finally {
				if (rset != null) {
					try {
					rset.close();
					} catch (SQLException ex) {
					ex.printStackTrace();
					}
				}
				if (prep != null) {
					try {
					prep.close();
					} catch (SQLException ex) {
					ex.printStackTrace();
					}
				}
				if (call != null) {
					try {
					call.close();
					} catch (SQLException ex) {
					ex.printStackTrace();
					}
				}
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException ex) {
				ex.printStackTrace();
				}
			}
		// TODO Auto-generated method stub
		
	}

}
