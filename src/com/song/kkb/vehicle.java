package com.song.kkb;

public class vehicle implements Gps{
    private String price;
    private String brand;

    public vehicle(String price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public vehicle() {

    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void run(){

    }

    @Override
    public String GpsRun() {
        return ("Gps开启");
    }
}
