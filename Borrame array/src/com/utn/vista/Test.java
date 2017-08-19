package com.utn.vista;

import com.utn.modelo.Colectivo;
import com.utn.modelo.Pasajero;

public final class Test {

	public static void main(String[] args) {

		System.out.println("========= Arranca programa ================");
		
		Colectivo linea1 = new Colectivo();
		linea1.linea = "LBS 2";
		linea1.precio = 5;
		linea1.iniArray();
		
		Colectivo l2 = new Colectivo();
		l2.linea = "LS 8";
		l2.precio = 15;
		l2.iniArray();
		
		Pasajero p1 = new Pasajero();
		p1.nombre = "ja1";
		p1.dinero = 5;

		Pasajero p2 = new Pasajero();
		p2.nombre = "ja2";
		p2.dinero = 10;

		Pasajero p3 = new Pasajero();
		p3.nombre = "ja3";
		p3.dinero = 15;

		Pasajero p4 = new Pasajero();
		p4.nombre = "ja4";
		p4.dinero = 20;

		Pasajero p5 = new Pasajero();
		p5.nombre = "ja5";
		p5.dinero = 25;
		
		System.out.println(p1);
		linea1.cobrar(p1);
		
		
		

	}

}
