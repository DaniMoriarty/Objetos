package Empresa;


import Edificios.*;
import Productos.*;
import Vehiculos.*;

public class Empresa {

	protected Vehiculo vehiculo1;
	protected Vehiculo vehiculo2;
	protected Vehiculo vehiculo3;
	protected Vehiculo vehiculo4;
	
	protected Edificio edificio1;
	protected Edificio edificio2;
	protected Edificio edificio3;

	protected Producto producto1;
	protected Producto producto2;
	protected Producto producto3;
	protected Producto producto4;
	protected Producto producto5;
	protected Producto producto6;
	
	
	
	public Empresa() {
		this.vehiculo1=null;
		this.vehiculo2=null;
		this.vehiculo3=null;
		this.vehiculo4=null;
		this.edificio1=null;
		this.edificio2=null;
		this.edificio3=null;
		this.producto1=null;
		this.producto2=null;
		this.producto3=null;
		this.producto4=null;
		this.producto5=null;
		this.producto6=null;
	}
	
	public Empresa(Vehiculo v1, Vehiculo v2, Vehiculo v3, Vehiculo v4, Edificio e1, Edificio e2, Edificio e3, Producto p1, Producto p2, Producto p3, Producto p4, Producto p5, Producto p6) {
		this.vehiculo1=v1;
		this.vehiculo2=v2;
		this.vehiculo3=v3;
		this.vehiculo4=v4;
		this.edificio1=e1;
		this.edificio2=e2;
		this.edificio3=e3;
		this.producto1=p1;
		this.producto2=p2;
		this.producto3=p3;
		this.producto4=p4;
		this.producto5=p5;
		this.producto6=p6;
	}

	public Vehiculo getVehiculo1() {
		return vehiculo1;
	}

	public void setVehiculo1(Vehiculo vehiculo1) {
		this.vehiculo1 = vehiculo1;
	}

	public Vehiculo getVehiculo2() {
		return vehiculo2;
	}

	public void setVehiculo2(Vehiculo vehiculo2) {
		this.vehiculo2 = vehiculo2;
	}

	public Vehiculo getVehiculo3() {
		return vehiculo3;
	}

	public void setVehiculo3(Vehiculo vehiculo3) {
		this.vehiculo3 = vehiculo3;
	}

	public Vehiculo getVehiculo4() {
		return vehiculo4;
	}

	public void setVehiculo4(Vehiculo vehiculo4) {
		this.vehiculo4 = vehiculo4;
	}

	public Edificio getEdificio1() {
		return edificio1;
	}

	public void setEdificio1(Edificio edificio1) {
		this.edificio1 = edificio1;
	}

	public Edificio getEdificio2() {
		return edificio2;
	}

	public void setEdificio2(Edificio edificio2) {
		this.edificio2 = edificio2;
	}

	public Edificio getEdificio3() {
		return edificio3;
	}

	public void setEdificio3(Edificio edificio3) {
		this.edificio3 = edificio3;
	}

	public Producto getProducto1() {
		return producto1;
	}

	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}

	public Producto getProducto2() {
		return producto2;
	}

	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}

	public Producto getProducto3() {
		return producto3;
	}

	public void setProducto3(Producto producto3) {
		this.producto3 = producto3;
	}

	public Producto getProducto4() {
		return producto4;
	}

	public void setProducto4(Producto producto4) {
		this.producto4 = producto4;
	}

	public Producto getProducto5() {
		return producto5;
	}

	public void setProducto5(Producto producto5) {
		this.producto5 = producto5;
	}

	public Producto getProducto6() {
		return producto6;
	}

	public void setProducto6(Producto producto6) {
		this.producto6 = producto6;
	}
	
	
	public boolean crearProducto(Producto p) {
		
		Producto [] arra= {producto1, producto2, producto3, producto4, producto5, producto6};  
		for (int i=0; i<arra.length; i++) {
			if(arra[i].getId()==0){
				for(int j=0; j<arra.length;j++) {
					if(p.getId()==arra[j].getId()) {
						System.out.println("Ya existe un producto con el ID descrito.");
						return false;
					}
				}
				arra[i]=p;
				System.out.println("Producto (" + p.getNombre() + ") creado con éxito.");
				return true;
				}
		}
		return false;
	}
	
	public boolean venderProducto(Producto p) {
		Producto[] arra={producto1, producto2, producto3, producto4, producto5, producto6};
		
		for (int i=0; i<arra.length; i++) {
			if(p.getId()==arra[i].getId()) {
				if(arra[i].getEdificioActual().getFuncionalidad()=="Almacen"){
					arra[i].setId(0);
					System.out.println("El producto (" + p.getNombre() + ") ha sido vendido con éxito.");
					return true;
				}
			}
		}
		System.out.println("Nope");
		return false;
	}
	
	boolean cambiarUbicacionProducto(Producto p, Edificio e) {
		Producto[] arra={producto1, producto2, producto3, producto4, producto5, producto6};
		for (int i=1; i<=arra.length-1; i++) {
			if(p.getId()==arra[i].getId()) {
				p.setEdificioActual(e);
				System.out.println("Producto (" + p.getNombre() + ") ha sido movido al edificio " + e.getFuncionalidad());
				return true;
			}
		}
		return false;
	}
	
	public String print() {
		String info="";
		info+="\n Vehículos: ";
		info+="\n ";
		info+="\n Vehículo 1: " + vehiculo1.print();
		info+="\n ";
		info+="\n Vehículo 2: " + vehiculo2.print();
		info+="\n ";
		info+="\n Vehículo 3: " + vehiculo3.print();
		info+="\n ";
		info+="\n Vehículo 4: " + vehiculo4.print();
		info+="\n ";
		info+="\n ";
		info+="\n Edificios: ";
		info+="\n ";
		info+="\n Edificio 1: " + edificio1.print();
		info+="\n ";
		info+="\n Edificio 2: " + edificio2.print();
		info+="\n ";
		info+="\n Edificio 3: " + edificio3.print();
		info+="\n ";
		info+="\n ";
		info+="\n Productos: ";
		info+="\n ";
		info+="\n Producto 1: " + producto1.print();
		info+="\n ";
		info+="\n Producto 2: " + producto2.print();
		info+="\n ";
		info+="\n Producto 3: " + producto3.print();
		info+="\n ";
		info+="\n Producto 4: " + producto4.print();
		info+="\n ";
		info+="\n Producto 5: " + producto5.print();
		info+="\n ";
		info+="\n Producto 6: " + producto6.print();
		info+="\n ";
		
		return info;
	}
	
	
}
