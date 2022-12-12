package com.io;
public class Pojazd {
	private int production_date;
	private int truck_weight;
	private String oc_expire_date = "";
	private String review_expire_date = "";
	private int max_capacity;
	private int status;
	private float truck_lenght;

	public int getProduction_date() {
		return this.production_date;
	}

	public void setProduction_date(int production_date) {
		this.production_date = production_date;
	}

	public int getTruck_weight() {
		return this.truck_weight;
	}

	public void setTruck_weight(int truck_weight) {
		this.truck_weight = truck_weight;
	}

	public String getOc_expire_date() {
		return this.oc_expire_date;
	}

	public void setOc_expire_date(String oc_expire_date) {
		this.oc_expire_date = oc_expire_date;
	}

	public String getReview_expire_date() {
		return this.review_expire_date;
	}

	public void setReview_expire_date(String review_expire_date) {
		this.review_expire_date = review_expire_date;
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

	public float getTruck_lenght() {
		return this.truck_lenght;
	}

	public void setTruck_lenght(float truck_lenght) {
		this.truck_lenght = truck_lenght;
	}
}