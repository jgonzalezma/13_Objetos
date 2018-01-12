import java.util.Date;

public class Persona {
//atributos private
	private String nombre;
	private String apellido;
	private int edad;
	private String telefono;
	private String dni;
	private String poblacion;
	private Date fechaNacimiento;
	private double peso;
	
	
	
	//metodos public
	public void comer(double pesoComido){
		this.engordar(pesoComido);
		System.out.println("He comido");
	}
	
	public void comprar(){
		System.out.println("He comprado...");
	}
	
	public void correr(int km){
		double pesoPerdido = 0.05*km;
		this.peso = this.peso - pesoPerdido;
		
		System.out.println("He corrido " + km +
				" km-s y he perdido " + pesoPerdido+ " kg-s");
	}
	
	/*
	 * @param peso en cuanto se va a cambiar el peso
	 */
	public void engordar(double peso){
		this.peso = this.peso + peso;
	}
	
	public void cambiarEdad(int edad){
		this.edad = edad;
	}

	//getter y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//fin clase persona
