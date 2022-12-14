package com.io;

public class Zlecenie {
	private Kierowca kierowca;
	private Pojazd pojazd;
	private int start_day;
	private int start_month;
	private int start_year;
	private int finish_day;
	private int finish_month;
	private int finish_year;
	private double value;
	private String company_name;
	private String principal;
	private int distance;
	private int status;
	public Zlecenia unnamed_Zlecenia_;

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

	public int getStart_day() {
		return this.start_day;
	}

	public void setStart_day(int start_day) {
		this.start_day = start_day;
	}

	public int getStart_month() {
		return this.start_month;
	}

	public void setStart_month(int start_month) {
		this.start_month = start_month;
	}

	public int getStart_year() {
		return this.start_year;
	}

	public void setStart_year(int start_year) {
		this.start_year = start_year;
	}

	public int getFinish_day() {
		return this.finish_day;
	}

	public void setFinish_day(int finish_day) {
		this.finish_day = finish_day;
	}

	public int getFinish_month() {
		return this.finish_month;
	}

	public void setFinish_month(int finish_month) {
		this.finish_month = finish_month;
	}

	public int getFinish_year() {
		return this.finish_year;
	}

	public void setFinish_year(int finish_year) {
		this.finish_year = finish_year;
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

	public String getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
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

	public double calculateValue() {
		double value = this.getDistance() * 0.5 * this.getFinish_day() - this.getStart_day();
		return value;
	}
}