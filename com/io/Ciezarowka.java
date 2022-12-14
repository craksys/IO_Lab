package com.io;

public class Ciezarowka extends Pojazd {
    private float trailer_length;
    private int trailer_weight;
    private int axle_load;
    private char type;

    public Ciezarowka(int productionDate, int maxCapacity, int status, String brandName, String carRegistration, float trailerLength, int trailerWeight, int axleLoad, char type) {
        this.production_date = productionDate;
        this.max_capacity = maxCapacity;
        this.status = status;
        this.brand_name = brandName;
        this.car_registration = carRegistration;
        this.trailer_length = trailerLength;
        this.trailer_weight = trailerWeight;
        this.axle_load = axleLoad;
        this.type = type;
    }


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

    public char getType() {
        return this.type;
    }

    public void setType(char type) {
        this.type = type;
    }
}