package practica;

import java.util.Date;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		while (true){
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("Enter a number: ");
			int n = reader.nextInt(); // Scans the next token of the input as an int.
			if (n==13){
				break;
			};
		}
		Date date = new Date();
		int month = date.getMonth();
		int day = date.getDay();
		String months = "";
		switch(month){
			case 0: months="Enero";
					break;
			case 1: months="Febrero";
					break;
			case 2: months="Marzo";
					break;
			case 3: months="Abril";
					break;
			case 4: months="Mayo";
					break;
			case 5: months="Junio";
					break;
			case 6: months="Julio";
					break;
			case 7: months="Agosto";
					break;
			case 8: months="Septiembre";
					break;
			case 9: months="Octubre";
					break;
			case 10: months="Noviembre";
					break;
			case 11: months="Diciembre";
					break;
		}
		String days = "";
		switch(day){
		case 0: days="Domingo";
				break;
		case 1: days="Lunes";
				break;
		case 2: days="Martes";
				break;
		case 3: days="Miercoles";
				break;
		case 4: days="Jueves";
				break;
		case 5: days="Viernes";
				break;
		case 6: days="Sabado";
				break;
		}
		System.out.println("\n");
		System.out.println(months);
		System.out.println(days);
	}

}
