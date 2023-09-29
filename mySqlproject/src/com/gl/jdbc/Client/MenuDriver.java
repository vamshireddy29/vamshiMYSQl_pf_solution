package com.gl.jdbc.Client;

import java.sql.SQLException;

public class MenuDriver {

	public static void main(String[] args)throws ClassNotFoundException, SQLException  {
		EmployeDbManager obj = new EmployeDbManager();
		obj.DisplayAll();


	}

}
