package com.Tugas5;

public class CarRent {
    private int rentDur;
    private Car car;
    private CarRider rider;

    public CarRent(CarRider rider, Car car, int rentDur) {
        this.rentDur = rentDur;
        this.car = car;
        this.rider = rider;
    }

    public int getRentDur() {
        return rentDur;
    }

    public Car getCar() {
        return car;
    }

    public CarRider getRider() {
        return rider;
    }
}
//Prayoga Dwi Purwono
//215150707111021/TI-E