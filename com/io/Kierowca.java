package com.io;

import java.util.ArrayList;

public class Kierowca {
	private int birth_year;
	private int birth_month;
	private int birth_day;
	private String name = "";
	private String surname = "";
	private ArrayList entitlement = new ArrayList<String>();
	private long pesel;
	private int status;

	public Kierowca(int birthYear, int birthMonth, int birthDay, String name, String surname, ArrayList entitlement, int i, int i1) {
	}

	public void getDataAndSave() {
		throw new UnsupportedOperationException();
	}

	public int getBirth_year() {
		return this.birth_year;
	}

	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}

	public int getBirth_month() {
		return this.birth_month;
	}

	public void setBirth_month(int birth_month) {
		this.birth_month = birth_month;
	}

	public int getBirth_day() {
		return this.birth_day;
	}

	public void setBirth_day(int birth_day) {
		this.birth_day = birth_day;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ArrayList getEntitlement() {
		return this.entitlement;
	}

	public void setEntitlement(ArrayList entitlement) {
		this.entitlement = entitlement;
	}

	public long getPesel() {
		return this.pesel;
	}

	public void setPesel(long pesel) {
		this.pesel = pesel;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}