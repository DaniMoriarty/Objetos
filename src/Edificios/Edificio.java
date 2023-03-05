package Edificios;

public abstract class Edificio {

	protected float anchura;
	protected float altura;
	protected float profundidad;
	protected float precio;
	protected String material;
	protected String funcionalidad;
	protected String color;
	
	public Edificio() {
		this.anchura=0.0f;
		this.altura=0.0f;
		this.profundidad=0.0f;
		this.precio=0.0f;
		this.material="";
		this.funcionalidad="";
		this.color="";
	}
	
	public Edificio(float an, float al, float pf, float pr, String m, String f, String c) {
		this.anchura=an;
		this.altura=al;
		this.profundidad=pf;
		this.precio=pr;
		this.material=m;
		this.funcionalidad=f;
		this.color=c;
	}

	public float getAnchura() {
		return anchura;
	}

	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getFuncionalidad() {
		return funcionalidad;
	}

	public void setFuncionalidad(String funcionalidad) {
		this.funcionalidad = funcionalidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract String funcionalidadEdificio();
	
	public float costePintura(String color, float precioMetro) {
		float coste= precioMetro*this.anchura*this.altura*this.profundidad;
		if(coste<=0) { return -1;}
		return coste;
	}
	
	public float costePintura(String color, float precioMetro, String ladoanchura) {
		float coste= precioMetro*this.anchura*this.altura;
		if(coste<=0) { return -1;}
		return coste;
	}
	
	public String print() {
		String info="";
		info+="\n Altura: " + this.altura;
		info+="\n Anchura: " + this.anchura;
		info+="\n Profundidad: " + this.profundidad;
		info+="\n Precio: " + this.precio;
		info+="\n Material: " + this.material;
		info+="\n Funcionalidad: " + this.funcionalidad;
		info+="\n Color: " + this.color;
		
		return info;
	}
	
}
