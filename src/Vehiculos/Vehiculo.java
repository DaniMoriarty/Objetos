package Vehiculos;

public class Vehiculo implements GestionVehiculo{

	protected String marca;
	protected float velocidadActual;
	protected boolean estaArrancado;
	protected float precio;
	protected float peso;
	protected String color;
	protected float longitud;
	
	public Vehiculo() {
		this.marca="";
		this.velocidadActual=0.0f;
		this.estaArrancado=false;
		this.precio=0.0f;
		this.peso=0.0f;
		this.color="";
		this.longitud=0.0f;
	}
	
	public Vehiculo(String m, float va, boolean ea, float pr, float p, String c, float l) {
		this.marca=m;
		this.velocidadActual=va;
		this.estaArrancado=ea;
		this.precio=pr;
		this.peso=p;
		this.color=c;
		this.longitud=l;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(float velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean getEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	
	public boolean arrancar() {
		if(this.estaArrancado!=true) {
			this.estaArrancado=true;
		}
		return this.estaArrancado;
	}
	
	public boolean parar() {
		if(this.estaArrancado==true) {
			this.estaArrancado=false;
		}
		return this.estaArrancado;
	}
	
	public boolean acelerar() {
		if(this.estaArrancado==true) {
			this.velocidadActual=this.velocidadActual+10.0f;
		}
		return this.estaArrancado;
	}
	
	public boolean frenar() {
		this.velocidadActual=this.velocidadActual-10.0f;
		if(this.velocidadActual<=0) {
			this.estaArrancado=false;
		}
		return this.estaArrancado;
	}
	
	public String print() {
		String info="";
		info+="\n Marca: " + this.marca;
		info+="\n Velocidad Actual: " + this.velocidadActual;
		info+="\n Está Arrancado: " + this.estaArrancado;
		info+="\n Precio: " + this.precio;
		info+="\n Peso: " + this.peso;
		info+="\n Color: " + this.color;
		info+="\n Longitud: " + this.longitud;
		
		return info;
		
	}
	
}





