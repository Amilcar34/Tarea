package com.utn.modelo;

public final class Colectivo {

	public String linea;
	public Pasajero[] pasajeros;
	public int cantDisponible = 25;
	public int asientosDisponibles = 10;
	public int precio;
	public boolean lleno;
	public int[] indice_pasajero;
	public boolean asientosDisponible = true;
	public double recaudacion = 0;

	public int varTemp1 = 0;
	public int varTemp2 = 0;

	public void iniArray() {
		pasajeros = new Pasajero[25];
	}

	public void cobrar(Pasajero pasajero) {


		varTemp1++;
		//indice_pasajero[varTemp1] = varTemp1;

		System.out.print(pasajero.nombre);

		if (indice_pasajero.length < cantDisponible && pasajero.dinero > precio) {

			cantDisponible--;
			pasajero.dinero = pasajero.dinero - precio;

			System.out.print(" puede viajar, ahora tiene $" + pasajero.dinero);

		}else{
			System.out.println(" no puede viajar");
		}

		if (cantDisponible > 10) {
			pasajero.sentado = true;
			System.out.println("y viaja sentado ");

		}else{
			asientosDisponible = false;
			pasajero.sentado = false;
			System.out.println("y viaja parado ");
		}
	}
	
}