package com.albertosolano.learnjava;

public class Car {
	//Using instance variables to model our Car class after a real-life car
    int modelYear;
	
	//Constructor tiene el mismo nombre que la clase
	public Car(int year) {
		modelYear = year;
	}
	//Metodo principal
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos una instancia de clase Car, una instancia de una clase se conoce como objeto
		Car myFastCar = new Car(2007);

	}

}
