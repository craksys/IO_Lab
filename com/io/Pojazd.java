package com.io;
public abstract class Pojazd {
	protected int production_date;
	protected int max_capacity;
	protected int status;
	protected String brand_name;
	protected String car_registration;

	public int getProduction_date() {
		return this.production_date;
	}

	public void setProduction_date(int production_date) {
		this.production_date = production_date;
	}

	public int getMax_capacity() {
		return this.max_capacity;
	}

	public void setMax_capacity(int max_capacity) {
		this.max_capacity = max_capacity;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


	public String getCar_registration() {
		return car_registration;
	}

	public void setCar_registration(String car_registration) {
		this.car_registration = car_registration;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
}