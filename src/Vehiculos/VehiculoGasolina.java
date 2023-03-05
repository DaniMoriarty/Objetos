package Vehiculos;

public class VehiculoGasolina extends Vehiculo implements GestionVehiculo{
	
	protected float contaminacion;
	protected float tamanyoDeposito;
	
	public VehiculoGasolina() {
		this.contaminacion=0.0f;
		this.tamanyoDeposito=0.0f;
		this.marca="";
		this.velocidadActual=0.0f;
		this.estaArrancado=false;
		this.precio=0.0f;
		this.peso=0.0f;
		this.color="";
		this.longitud=0.0f;
	}
	
	public VehiculoGasolina(String m, float va, boolean ea, float pr, float p, String c, float l, float co, float td) {
		this.marca=m;
		this.velocidadActual=va;
		this.estaArrancado=ea;
		this.precio=pr;
		this.peso=p;
		this.color=c;
		this.longitud=l;
		this.contaminacion=co;
		this.tamanyoDeposito=td;
	}

	public float getContaminacion() {
		return contaminacion;
	}

	public void setContaminacion(float contaminacion) {
		this.contaminacion = contaminacion;
	}

	public float getTamanyoDeposito() {
		return tamanyoDeposito;
	}

	public void setTamanyoDeposito(float tamanyoDeposito) {
		this.tamanyoDeposito = tamanyoDeposito;
	}
	
}
