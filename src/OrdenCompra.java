import java.util.*;
public class OrdenCompra {
	private int NumeroDeOrden;
	private String nombre;
	private List<Silla> sillas;
	
	//Constructores;
	public OrdenCompra(int NumeroDeOrden, String nombre) {
		this.NumeroDeOrden = NumeroDeOrden;
		this.nombre = nombre;
		this.sillas = new ArrayList<>();
	}

	public int getNumeroDeOrden() {
		return NumeroDeOrden;
	}

	public void setNumeroDeOrden(int numeroDeOrden) {
		NumeroDeOrden = numeroDeOrden;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Silla> getSillas() {
		return sillas;
	}

	public void setSillas(List<Silla> sillas) {
		this.sillas = sillas;
	}
	
}
