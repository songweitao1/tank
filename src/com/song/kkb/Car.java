package com.song.kkb;

public class Car extends vehicle{

    public Car(String price, String brand) {
        super(price, brand);
    }
    public void BW(){
        System.out.println("价值"+this.getPrice()+"元的"+this.getBrand()+"车正在运行");

    }
    public void BW(vehicle vehicle){
        String string = vehicle.GpsRun();
        System.out.println("价值"+this.getPrice()+"元的"+this.getBrand()+"车正在运行" + string);

    }
    public void Bz(){
        System.out.println("价值"+this.getPrice()+"元的"+this.getBrand()+"车正在运行");

    }
}
