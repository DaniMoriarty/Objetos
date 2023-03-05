package Productos;

import Edificios.Edificio;

public class Ventana extends Producto{

	public Ventana() {
		this.id=0;
		this.nombre="";
		this.tipo="";
		this.anchura=0.0f;
		this.profundidad=0.0f;
		this.altura=0.0f;
		this.color="";
		this.edificioActual=null;
	}
	
	public Ventana(int id, String n, String t, float an, float p, float al, String c, Edificio e) {
		this.id=id;
		this.nombre=n;
		this.tipo=t;
		this.anchura=an;
		this.profundidad=p;
		this.altura=al;
		this.color=c;
		this.edificioActual=e;
	}
}
