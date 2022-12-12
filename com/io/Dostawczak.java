package com.io;
public class Dostawczak extends Pojazd {
	private int truck_max_load;
	private boolean isElectric;
	private int maxDistance;

	public int getTruck_max_load() {
		return this.truck_max_load;
	}

	public void setTruck_max_load(int truck_max_load) {
		this.truck_max_load = truck_max_load;
	}

	public boolean getIsElectric() {
		return this.isElectric;
	}

	public void setIsElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}

	public int getMaxDistance() {
		return this.maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}
}