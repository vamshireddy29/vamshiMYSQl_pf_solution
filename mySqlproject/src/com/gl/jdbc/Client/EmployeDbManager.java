package com.gl.jdbc.Client;

import java.sql.SQLException;
import java.util.Scanner;

import com.gl.jdbc.Service.EmployeService;

public class EmployeDbManager {
	public  void DisplayAll() throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner(System.in);
		EmployeService bs = new EmployeService();
		bs.create();
		bs.insert();
		bs.update();
		bs.delete();
		bs.deleteAll();
		
	}
}

