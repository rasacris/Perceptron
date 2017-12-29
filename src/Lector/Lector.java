package Lector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import Perceptron.Entradas;
public class Lector{

	@SuppressWarnings("resource")

	public static ArrayList<Entradas> leerFicheroDAT(){
		String ruta = "/Users/raulsacristanmontalvo/Documents/workspace/Loteria/src/datos/N1.txt";
		File archivo = null;
		FileReader fr = null;
		ArrayList<Entradas> entradasArray = new ArrayList<Entradas>();
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File (ruta);
			fr = new FileReader (archivo);
			new BufferedReader(fr);
			// Lectura del fichero
			Scanner scan1 = new Scanner (archivo);
			while(scan1.hasNext()){
				String lineaExtraida = scan1.nextLine();							
				int id = 0;
				String fecha = null;
				int n1 =0;
				int n2=0;
				int n3=0;
				int n4=0;
				int n5=0;
				int e1=0;
				int e2=0;
				StringTokenizer tokens = new StringTokenizer(lineaExtraida);
				int i = 0;
				while(tokens.hasMoreTokens()){
					i++;				
					if(i==1){						
						String id1 = tokens.nextToken();
						id = Integer.valueOf(id1);												
					}if(i==2){						
						fecha = tokens.nextToken();																	
					}
					if(i==3){									
						String n11 = tokens.nextToken();
						n1 = Integer.valueOf(n11);
					}
					if(i==4){									
						String n21 = tokens.nextToken();
						n2 = Integer.valueOf(n21);
					}
					if(i==5){									
						String n31 = tokens.nextToken();
						n3 = Integer.valueOf(n31);
					}
					if(i==6){									
						String n41 = tokens.nextToken();
						n4 = Integer.valueOf(n41);
					}
					if(i==7){									
						String n11 = tokens.nextToken();
						n1 = Integer.valueOf(n11);
					}
					if(i==8){									
						String n51 = tokens.nextToken();
						n5 = Integer.valueOf(n51);
					}
					if(i==9){									
						String e11 = tokens.nextToken();
						e1 = Integer.valueOf(e11);
					}
					if(i==10){									
						String e22 = tokens.nextToken();
						e2 = Integer.valueOf(e22);
					}
				}	
				Entradas entrada = new Entradas(id, fecha, n1, n2, n3, n4, n5, e1, e2);
				entradasArray.add(entrada);
			}
			System.out.println("FICHERO CARGADO CORRECTAMENTE");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{                    
				if(null != fr){   
					fr.close();     
				}                  
			}catch (Exception e2){ 
				e2.printStackTrace();
			}
		}
		return entradasArray;
	}


	public static void main(String args[]){

		ArrayList<Entradas> a = Lector.leerFicheroDAT();
		for (int j = 0; j < args.length; j++) {
			System.out.println(a.get(j).getId());
			System.out.println(a.get(j).getFecha());
		}


	}



}
