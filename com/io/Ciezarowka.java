package com.io;
public class Ciezarowka extends Pojazd {
	private float trailer_length;
	private int trailer_weight;
	private int axle_load;
	private int trailer_max_load;
	private char type;

	public float getTrailer_length() {
		return this.trailer_length;
	}

	public void setTrailer_length(float trailer_length) {
		this.trailer_length = trailer_length;
	}

	public int getTrailer_weight() {
		return this.trailer_weight;
	}

	public void setTrailer_weight(int trailer_weight) {
		this.trailer_weight = trailer_weight;
	}

	public int getAxle_load() {
		return this.axle_load;
	}

	public void setAxle_load(int axle_load) {
		this.axle_load = axle_load;
	}

	public int getTrailer_max_load() {
		return this.trailer_max_load;
	}

	public void setTrailer_max_load(int trailer_max_load) {
		this.trailer_max_load = trailer_max_load;
	}

	public char getType() {
		return this.type;
	}

	public void setType(char type) {
		this.type = type;
	}
}