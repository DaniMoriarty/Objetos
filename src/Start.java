//Daniel Ramón Pérez - 2ºDAM A

import Vehiculos.*;
import Edificios.*;
import Empresa.*;
import Productos.*;

public class Start {

	public static void main(String[] args) {
		
		VehiculoElectrico vehiculoElectrico1= new VehiculoElectrico("Tesla", 0.0f, false, 50000.0f, 1000.0f, "Blanco", 3.0f, 400.0f, 300.0f);
		VehiculoElectrico vehiculoElectrico2= new VehiculoElectrico("Tesla", 0.0f, false, 50000.0f, 1000.0f, "Blanco", 3.0f, 400.0f, 300.0f);
		VehiculoGasoil vehiculoGasoil1= new VehiculoGasoil("Mazda", 0.0f, false, 20000.0f, 1200.0f, "Rojo", 3.1f);
		VehiculoGasolina vehiculoGasolina1= new VehiculoGasolina("Opel", 0.0f, false, 15000.0f, 1200.0f, "Azul", 3.0f, 120.0f, 40.0f);
		
		Fabrica fabrica= new Fabrica(100.0f, 8.0f, 30.0f, 300000.0f, "Cemento", "Fabrica", "Gris");
		Almacen almacen= new Almacen(120.0f, 10.0f, 120.0f, 250000.0f, "Cemento", "Almacen", "Gris");
		Oficina oficina= new Oficina(40.0f, 2.0f, 30.0f, 200000.0f, "Cemento", "Oficina", "Blanco");
		
		Puerta puerta1= new Puerta(1, "Puerta", "Mobiliario", 1.5f, 25.0f, 2.0f, "Marrón", almacen);
		Puerta puerta2= new Puerta(2, "Puerta", "Mobiliario", 1.5f, 25.0f, 2.0f, "Marrón", almacen);
		Silla silla1= new Silla(3, "Silla", "Mobiliario", 0.5f, 5.0f, 0.5f, "Verde", almacen);
		Silla silla2= new Silla(4, "Silla", "Mobiliario", 0.5f, 5.0f, 0.5f, "Verde", almacen);
		Ventana ventana1= new Ventana(5, "Ventana", "Mobiliario", 1.0f, 0.2f, 1.0f, "Blanco", almacen);
		Ventana ventana2= new Ventana(6, "Ventana", "Mobiliario", 1.0f, 0.2f, 1.0f, "Blanco", almacen);
		
		Empresa materialConts= new Empresa(vehiculoElectrico1, vehiculoElectrico2, vehiculoGasoil1, vehiculoGasolina1, fabrica, almacen, oficina, puerta1, puerta2, silla1, silla2, ventana1, ventana2);
		
		
		vehiculoElectrico1.setEstaArrancado(true);
		vehiculoElectrico2.setEstaArrancado(true);
		vehiculoElectrico1.setVelocidadActual(50.0f);
		vehiculoElectrico2.setVelocidadActual(50.0f);
		vehiculoGasoil1.setVelocidadActual(80.0f);
		vehiculoGasolina1.setVelocidadActual(80.0f);
		vehiculoGasoil1.frenar();
		vehiculoGasolina1.frenar();
		
		puerta1.setId(1);
		puerta2.setId(2);
		silla1.setId(3);
		silla2.setId(4);
		ventana1.setId(5);
		ventana2.setId(6);
		
		System.out.println("************************");
		System.out.println("*****MATERIAL CONTS*****");
		System.out.println("************************");
		
		
		System.out.println(materialConts.print());		
		
		System.out.println("El coste de pintar de verde el almacén sería de: " + almacen.costePintura("Verde", 30.0f) + "€.");

		materialConts.venderProducto(puerta1);
		materialConts.venderProducto(silla1);
		materialConts.crearProducto(puerta2);
		Puerta puerta10= new Puerta(10, "Puerta", "Mobiliario", 1.5f, 25.0f, 2.0f, "Marrón", almacen);
		materialConts.crearProducto(puerta10);
		
	}

}
