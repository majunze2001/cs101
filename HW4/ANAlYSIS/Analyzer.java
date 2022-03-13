package ma.ANAlYSIS;

import java.io.IOException;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.FileReader;

public class Analyzer {	
	
	//calculate and print 3D distance
	public static void distance(String X, String Y, String Z){
		
		DecimalFormat df = new DecimalFormat("00.00 KM");
		double d = 0;
		int x = Integer.valueOf(X);
		int y = Integer.valueOf(Y);
		int z = Integer.valueOf(Z);
		double x2 = Math.pow((x-10), 2);
		double y2 = Math.pow((y-10), 2);
		double z2 = Math.pow((z-10), 2);
		d = Math.pow((x2 + y2 + z2), 0.5);
		System.out.println(df.format(d));
		
	}
	
	
	
	public static void reWriteTrooperData() throws IOException{
		
		System.out.println("\t\t\t\t\tSTORMTROOPER DATA");
		System.out.println("Stormtrooper\tX\t\tY\t\tZ\t\tRank\tDistance to Rendezvous");
		
		
		String path = "src/ma/Data/Data";
		BufferedReader BR = new BufferedReader(new FileReader(path));
		String line = "";
		while ((line = BR.readLine()) != null) {
			String[] rawd = line.split(" ");
			
			//get the number and print
			int a = rawd[0].indexOf("-");
			String number = rawd[0].substring(a+1,rawd[0].length()-1);
			System.out.print(number);
			System.out.print("\t\t");
			
			//get X,Y,Z and print
			String[] xyz = rawd[1].split("X|Y|Z");
			String X = xyz[1];
			String Y = xyz[2];
			String Z = xyz[3];
			
			System.out.print(X + "\t\t");
			System.out.print(Y + "\t\t");
			System.out.print(Z + "\t\t");
			
			/*int x = rawd[1].indexOf("X");
			int y = rawd[1].indexOf("Y");
			int z = rawd[1].indexOf("Z");
			
			String X = rawd[1].substring(x+1,y);
			String Y = rawd[1].substring(y+1,z);
			String Z = rawd[1].substring(z+1);
			
			System.out.print(X + "\t\t");
			System.out.print(Y + "\t\t");
			System.out.print(Z + "\t\t");*/
			
			
			//print the rank
			System.out.print(rawd[2] + "\t\t");
			
			//calculate the distance and print
			distance(X, Y, Z);
	
		}
		
		BR.close();
	}


}
