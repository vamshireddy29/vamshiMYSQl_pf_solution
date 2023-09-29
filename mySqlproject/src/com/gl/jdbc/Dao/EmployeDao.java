package com.gl.jdbc.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gl.jdbc.Connections.Connections;

public class EmployeDao {
	Connections con = new Connections();

	Connection m;
	Statement st;
	PreparedStatement pst;
	Connections mycon;
	ResultSet rs;

	public EmployeDao() {
		mycon = new Connections();
	}

	public void creationOfEmploye() throws ClassNotFoundException, SQLException {
		m = mycon.MyConnection();
		st = m.createStatement();
		String createTableSQL = "CREATE TABLE IF NOT EXISTS Employee (" + "id INT PRIMARY KEY AUTO_INCREMENT,"
				+ "name VARCHAR(50) NOT NULL," + "e_mail VARCHAR(50) NOT NULL," + "phone_number int(15) NOT NULL" + ")";

		st.execute(createTableSQL);

		System.out.println("Table employee created successfully.");

		Statement st1 = m.createStatement();

	}

	public void Insertion() throws ClassNotFoundException, SQLException {
		m = mycon.MyConnection();
		// String s="insert into Employee
		// (id,name,e_mail,phone_number)values(1,'ranga','ranga123@gamil.com',12313111)";
		String insertSQL = "INSERT INTO employee (id,name, e_mail, phone_number) VALUES (?, ?, ?,?)";
		PreparedStatement preparedStatement = m.prepareStatement(insertSQL);
		insertEmployee(preparedStatement, 1, "virat", "virat@example.com", 202934824);
		insertEmployee(preparedStatement, 2, " Smith", "Smith@example.com", 93453423);
		insertEmployee(preparedStatement, 3, " Johnson", "Johnson@example.com", 534242342);
		insertEmployee(preparedStatement, 4, "ali", "ali@example.com", 983234234);
		insertEmployee(preparedStatement, 5, "jani", "jani@ele.com", 53242424);

		System.out.println("Records inserted successfully.");

	}

	private static void insertEmployee(PreparedStatement preparedStatement, int id, String name, String e_mail,
			int phoneNumber) throws SQLException {
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, e_mail);
		preparedStatement.setInt(4, phoneNumber);
		preparedStatement.executeUpdate();
	}

	public void update() throws ClassNotFoundException, SQLException {

		m = mycon.MyConnection();
		String updateSQL = "UPDATE employee SET name = ?, phone_number = ? WHERE id = ?";
		PreparedStatement preparedStatement = m.prepareStatement(updateSQL);
		// Set new values
		preparedStatement.setString(1, "karthik");
		preparedStatement.setInt(2, 1234567890);
		preparedStatement.setInt(3, 3);
		int rowsUpdated = preparedStatement.executeUpdate();

		if (rowsUpdated > 0) {
			System.out.println("Employee with id 3 updated successfully.");
		} else {
			System.out.println("No employee found with id 3.");
		}

	}

	public void delete() throws ClassNotFoundException, SQLException {

		m = mycon.MyConnection();
		String updateSQL = "delete from employee where id = ? ";
		PreparedStatement preparedStatement = m.prepareStatement(updateSQL);
		preparedStatement.setInt(1, 3);
		int rowsDeleted = preparedStatement.executeUpdate();
		deleteEmployee(preparedStatement, 3);
		deleteEmployee(preparedStatement, 4);
		
		

	}

	private static void deleteEmployee(PreparedStatement preparedStatement, int id)
			throws ClassNotFoundException, SQLException {
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		System.out.println(id+ " record deleted successfully");


	}
	public void deleteAll() throws ClassNotFoundException, SQLException {

		m = mycon.MyConnection();
		String DelteALl = "truncate table employee;";
		Statement Statement = m.createStatement();
		int rowsDeleted = Statement.executeUpdate(DelteALl);
		if(rowsDeleted<0)
		{
		System.out.println(" all record are not delted successfully");
		}
		else
		{
			System.out.println("all records are  deleted");
		}

	}
	

}

	