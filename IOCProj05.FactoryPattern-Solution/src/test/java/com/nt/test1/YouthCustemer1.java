package com.nt.test1;
import com.nt.comp.Car;
import com.nt.factory.Carfactory;
public class YouthCustemer1 {
public static void main(String args[]) {
	Car car=Carfactory.createCar("sports","OD9W3398");
	car.drive();
}
}
