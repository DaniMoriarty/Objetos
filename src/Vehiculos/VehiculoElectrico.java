package Vehiculos;

public class VehiculoElectrico extends Vehiculo implements GestionVehiculo{

	protected float potencia;
	protected float velocidadMaxima;
	
	public VehiculoElectrico() {
		this.marca="";
		this.velocidadActual=0.0f;
		this.estaArrancado=false;
		this.precio=0.0f;
		this.peso=0.0f;
		this.color="";
		this.longitud=0.0f;
		this.potencia=0.0f;
		this.velocidadMaxima=0.0f;
	}
	
	public VehiculoElectrico(String m, float va, boolean ea, float pr, float p, String c, float l, float po, float vm) {
		this.marca=m;
		this.velocidadActual=va;
		this.estaArrancado=ea;
		this.precio=pr;
		this.peso=p;
		this.color=c;
		this.longitud=l;
		this.potencia=p;
		this.velocidadMaxima=vm;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
}
