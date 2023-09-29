package com.gl.jdbc.Service;

import java.sql.SQLException;

import com.gl.jdbc.Dao.EmployeDao;
import com.gl.jdbc.Model.Employe;

public class EmployeService {
	EmployeDao obj = new EmployeDao();

	public void create()  throws ClassNotFoundException, SQLException{
		obj.creationOfEmploye();
	}
	public void insert()throws ClassNotFoundException, SQLException
	{
		obj.Insertion();
	}
 
	public void update()throws ClassNotFoundException, SQLException
	{
		obj.update();
	}
	public void delete()throws ClassNotFoundException, SQLException
	{
		obj.delete();
	}
	public void deleteAll()throws ClassNotFoundException, SQLException
	{
		obj.deleteAll();
	}
 
}

