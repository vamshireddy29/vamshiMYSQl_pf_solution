package com.gl.jdbc.Model;

public class Employe {
	int id;
	String Name;
	String E_mail;
	long phone_Number;

	public Employe(int id, String name, String e_mail, long phone_Number) {
		super();
		this.id = id;
		Name = name;
		E_mail = e_mail;
		this.phone_Number = phone_Number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getE_mail() {
		return E_mail;
	}

	public void setE_mail(String e_mail) {
		E_mail = e_mail;
	}

	public long getPhone_Number() {
		return phone_Number;
	}

	public void setPhone_Number(long phone_Number) {
		this.phone_Number = phone_Number;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", Name=" + Name + ", E_mail=" + E_mail + ", phone_Number=" + phone_Number + "]";
	}

}

