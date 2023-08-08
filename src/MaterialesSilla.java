
public class MaterialesSilla {
	//Atributos
	private int maderas;
	private int pinturas;
	private int tornillos;
	
	//Constructores
	public MaterialesSilla(int maderas, int pinturas, int tornillos) {
		this.maderas = maderas;
		this.pinturas = pinturas;
		this.tornillos = tornillos;
	}
	//Setter & Getters
	public int getMaderas() {
		return maderas;
	}

	public void setMaderas(int maderas) {
		this.maderas = maderas;
	}

	public int getPinturas() {
		return pinturas;
	}

	public void setPinturas(int pinturas) {
		this.pinturas = pinturas;
	}

	public int getTornillos() {
		return tornillos;
	}

	public void setTornillos(int tornillos) {
		this.tornillos = tornillos;
	}
	public void AgregarMateriles(int maderas, int pinturas, int tornillos) {
		this.maderas += maderas;
		this.pinturas += pinturas;
		this.tornillos += tornillos;
	}

}
