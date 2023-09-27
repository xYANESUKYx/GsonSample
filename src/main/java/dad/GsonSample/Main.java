package dad.GsonSample;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	
	public static void main( String[] args ){
	
		Persona p = new Persona();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = scanner.nextLine();
		p.setNombre(nombre);
		
		System.out.print("Apellidos: ");
		String apellidos = scanner.nextLine();
		p.setApellidos(apellidos);
		
		System.out.print("Edad: ");
		int edad = scanner.nextInt();
		p.setEdad(edad);
		
		System.out.println("\nSalida en formato JSON: ");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}
}
