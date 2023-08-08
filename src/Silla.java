
public class Silla {
	//Atributos
	private int codigo;
	private String nombre;
	private double precio;
	private MaterialesSilla materiales;
	
	//Constructores
	public Silla(int codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;

	}
	//Getters & Setter
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public MaterialesSilla getMateriales() {
		return materiales;
	}

	public void setMateriales(MaterialesSilla materiales) {
		this.materiales = materiales;
	}
	

}
