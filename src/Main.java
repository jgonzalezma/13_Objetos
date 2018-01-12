import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//crear un objeto de clase persona => juan
		Persona juan = new Persona();
		juan.setNombre("Juan");
		juan.setPeso(80);
		
		//asignar apellido a juan, un apellido introducido por teclado
		//System.out.println("Introduce un apellido para juan");
		//String apellido = scan.nextLine();
		String apellido = "Gomez";
		juan.setApellido(apellido);
		
		//asignar un dni al objeto juan, el dni esta escrito en un fichero
		File f = new File("D:/ficherosjava/dni.txt");
		scan = new Scanner(f);
		String dni = scan.nextLine();
		juan.setDni(dni);
		
		System.out.println("Mi nombre es " + juan.getNombre() + " " + juan.getApellido());
		
		
		System.out.println("Soy " + juan.getNombre() + " y peso "+ juan.getPeso() + " kg-s");
		
		juan.correr(20);
		
		System.out.println("Soy " + juan.getNombre() + " y peso "+ juan.getPeso() + " kg-s");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
