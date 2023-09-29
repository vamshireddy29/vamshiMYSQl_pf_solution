package com.gl.jdbc.Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connections {
	public Connection MyConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/GL";
		String uname = "root";
		String pass = "Vamshi@29";
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName("com.mysql.cj.jdbc.Driver");


		Connection con = DriverManager.getConnection(url, uname, pass);

		Statement st = con.createStatement();
		return con;
	}

}