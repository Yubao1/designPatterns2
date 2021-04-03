package com.zhulu.test;

public class Test {

	public static void main(String[] args) {
        AirShipDirector director = new MyAirShipDirector(new MyAirShipBuilder());
        AirShip airShip = director.directorAirShip();
        System.out.println(airShip.getEngine().getName());
        System.out.println(airShip.getEscapeTower().getName());
        System.out.println(airShip.getOrbitalModel().getName());
	}

}
