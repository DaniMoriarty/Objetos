package Edificios;

public class Fabrica extends Edificio{

	public Fabrica() {
		this.anchura=0.0f;
		this.altura=0.0f;
		this.profundidad=0.0f;
		this.precio=0.0f;
		this.material="";
		this.funcionalidad="";
		this.color="";
	}
	
	public Fabrica(float an, float al, float pf, float pr, String m, String f, String c) {
		this.anchura=an;
		this.altura=al;
		this.profundidad=pf;
		this.precio=pr;
		this.material=m;
		this.funcionalidad=f;
		this.color=c;
	}	
	
	public String funcionalidadEdificio() {
		return "Aquí se crea el producto.";
	}
}
