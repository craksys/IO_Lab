package com.io;

public class Zlecenie {
	private Kierowca kierowca;
	private Pojazd pojazd;
	private double value;
	private String company_name;
	private int distance;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	private int duration;
	private int status;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public void getDataAndSave() {
		throw new UnsupportedOperationException();
	}

	public Kierowca getKierowca() {
		return this.kierowca;
	}

	public void setKierowca(Kierowca kierowca) {
		this.kierowca = kierowca;
	}

	public Pojazd getPojazd() {
		return this.pojazd;
	}

	public void setPojazd(Pojazd pojazd) {
		this.pojazd = pojazd;
	}



	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getCompany_name() {
		return this.company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}


	public int getDistance() {
		return this.distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void calculateValue() {
		this.value = this.getDistance() * 0.5 * duration;
	}
}