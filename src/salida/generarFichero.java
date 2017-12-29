package salida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import Lector.Lector;
import Perceptron.Entradas;

public class generarFichero{



	public static void generarTxt(){

		Lector lector = new Lector();

		String time= new SimpleDateFormat("dd MMM yyyy HH:mm:ss").format(Calendar.getInstance().getTime());			
		try {
			BufferedWriter ficheroSalida = new BufferedWriter(
					new FileWriter(new File("/Users/raulsacristanmontalvo/Documents/workspace/Loteria/src/salida/Entradas.txt")));
			ArrayList<Entradas> en = lector.leerFicheroDAT();
			ficheroSalida.write("entradas");
			ficheroSalida.newLine();
			for (int i = 0; i < en.size(); i++) {
				ficheroSalida.write("ID " + en.get(i).getId());
				ficheroSalida.newLine();
				ficheroSalida.write("Fecha " + en.get(i).getFecha());
				ficheroSalida.newLine();
				ficheroSalida.write("N1 " + en.get(i).getN1());
				ficheroSalida.newLine();
				ficheroSalida.write("N2 " + en.get(i).getN2());
				ficheroSalida.newLine();
				ficheroSalida.write("N3" + en.get(i).getN3());
				ficheroSalida.newLine();
				ficheroSalida.write("N4 " + en.get(i).getN4());
				ficheroSalida.newLine();
				ficheroSalida.write("N5 " + en.get(i).getN5());
				ficheroSalida.newLine();
				ficheroSalida.write("E1 " + en.get(i).getE1());
				ficheroSalida.newLine();
				ficheroSalida.write("E2 " + en.get(i).getE2());
				ficheroSalida.newLine();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generarTxt();
	}

}
