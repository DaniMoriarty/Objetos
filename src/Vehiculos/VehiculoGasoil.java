package Vehiculos;

public class VehiculoGasoil extends Vehiculo implements GestionVehiculo{

	public VehiculoGasoil() {
		this.marca="";
		this.velocidadActual=0.0f;
		this.estaArrancado=false;
		this.precio=0.0f;
		this.peso=0.0f;
		this.color="";
		this.longitud=0.0f;
	}
	
	public VehiculoGasoil(String m, float va, boolean ea, float pr, float p, String c, float l) {
		this.marca=m;
		this.velocidadActual=va;
		this.estaArrancado=ea;
		this.precio=pr;
		this.peso=p;
		this.color=c;
		this.longitud=l;
	}
}
