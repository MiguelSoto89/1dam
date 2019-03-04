import java.util.Scanner;

public class main_empleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empleados num1=new empleados(1278, "Miguel", "Pepperoni", "Los Asperones", 622);
		empleados num2=new empleados(4559, "Alberto", "Rubalrabo", "La Palmilla", 634);
		empleados num3=new empleados(6277, "Luis", "Insertcoin", "La Corta", 678);
		empleados num4=new empleados(6277, "Joaquin", "Puntero", "El Pavero", 691);
		
		System.out.println("El empleado 1 tiene los siguientes datos: ");
		System.out.println(" ");
		System.out.println("ID: "+num1.getID());
		System.out.println("Nombre: "+num1.getNombre());
		System.out.println("Apellidos: "+num1.getApp());
		System.out.println("Direccion: "+num1.getDir());
		System.out.println("Telefono: "+num1.getTelef());
		System.out.println(" ");
		
		System.out.println("El empleado 2 tiene los siguientes datos: ");
		System.out.println(" ");
		System.out.println("ID: "+num2.getID());
		System.out.println("Nombre: "+num2.getNombre());
		System.out.println("Apellidos: "+num2.getApp());
		System.out.println("Direccion: "+num2.getDir());
		System.out.println("Telefono: "+num2.getTelef());
		System.out.println(" ");
		
		System.out.println("El empleado 3 tiene los siguientes datos: ");
		System.out.println(" ");
		System.out.println("ID: "+num3.getID());
		System.out.println("Nombre: "+num3.getNombre());
		System.out.println("Apellidos: "+num3.getApp());
		System.out.println("Direccion: "+num3.getDir());
		System.out.println("Telefono: "+num3.getTelef());
		System.out.println(" ");
		
		System.out.println("El empleado 4 tiene los siguientes datos: ");
		System.out.println(" ");
		System.out.println("ID: "+num4.getID());
		System.out.println("Nombre: "+num4.getNombre());
		System.out.println("Apellidos: "+num4.getApp());
		System.out.println("Direccion: "+num4.getDir());
		System.out.println("Telefono: "+num4.getTelef());
		System.out.println(" ");
	}

}
