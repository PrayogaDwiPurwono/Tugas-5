package com.Tugas5;
import java.util.ArrayList;
public class CarData {
    ArrayList<Car> carList;

    public CarData() {
        carList = new ArrayList<Car>();
    }
    public void addCar(String carType, String polNum, String merk) {
        carList.add(new Car(carType, polNum, merk));
    }
    public void listOfCar() {
        System.out.println("==============================");
        System.out.println("DAFTAR MOBIL");
        System.out.println("==============================");
        for (Car i : carList) {
            System.out.print("TIPE MOBIL : " + i.getCarType());
            System.out.println();
            System.out.print("No. POLISI : " + i.getPolNum());
            System.out.println();
            System.out.print("MERK MOBIL : " + i.getMerk());
            System.out.println();
            System.out.println("==============================");
        }
    }
}
//Prayoga Dwi Purwono
//215150707111021/TI-E
