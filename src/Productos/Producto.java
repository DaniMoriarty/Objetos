package Productos;

import Edificios.Edificio;

public class Producto {
	
	protected int id;
	protected String nombre;
	protected String tipo;
	protected float anchura;
	protected float profundidad;
	protected float altura;
	protected String color;
	protected Edificio edificioActual;
	
	
	public Producto() {
		this.id=0;
		this.nombre="";
		this.tipo="";
		this.anchura=0.0f;
		this.profundidad=0.0f;
		this.altura=0.0f;
		this.color="";
		this.edificioActual=null;
	}
	
	public Producto(int id, String n, String t, float an, float p, float al, String c, Edificio e) {
		this.id=id;
		this.nombre=n;
		this.tipo=t;
		this.anchura=an;
		this.profundidad=p;
		this.altura=al;
		this.color=c;
		this.edificioActual=e;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getAnchura() {
		return anchura;
	}

	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}

	public float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Edificio getEdificioActual() {
		return edificioActual;
	}

	public void setEdificioActual(Edificio edificioActual) {
		this.edificioActual = edificioActual;
	}
	
	
	public String print() {
		String info="";
		info+="\n Id: " + this.id;
		info+="\n Nombre: " + this.nombre;
		info+="\n Tipo: " + this.tipo;
		info+="\n Anchura: " + this.anchura;
		info+="\n Profundidad: " + this.profundidad;
		info+="\n Altura: " + this.altura;
		info+="\n Color: " + this.color;
		info+="\n Edificio: " + this.getEdificioActual().getFuncionalidad();
		
		return info; 
	}
	
	
}
