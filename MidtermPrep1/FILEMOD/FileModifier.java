package ma.FILEMOD;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import ma.HELPER.Helper;


public class FileModifier {
	
	//display 1D array
	public static void displayArray(String[] v) {
		for (String i: v) {
			System.out.print(i + " ");;
		}
		System.out.println();
	}
	
	//get length
	public static int getlength (String path) throws IOException {
		int l = 0;
		BufferedReader BR = new BufferedReader(new FileReader(path));
		while (BR.readLine() != null) {
			l++;
		}
		BR.close();
		return l;
	}
	
	//read file lines into a string array
	public static String[] read (String path) throws IOException {
		int l = getlength(path);
		String[] file = new String[l];
		BufferedReader BR = new BufferedReader(new FileReader(path));
		String line = ""; int c = 0;
		while ((line = BR.readLine()) != null) {
			file[c] = line;
			c++;
		}
		BR.close();	
		return file;
	}
	
	//reverse a string array
	public static String[] reverse (String[] v) {
		String[] r = new String[v.length];
		for (int i = 0; i < v.length; i++) {
			r[i] = v[v.length-1-i];
		}
		return r;
	}
	
	//write a string array in a file 
	public static void write (String[] v, String path) throws IOException {
		BufferedWriter BW = new BufferedWriter(new FileWriter(path));
		for (String i: v) {
			BW.write(i);
			BW.newLine();
		}
		BW.close();
	}
	
	//sort a string
	public static String sort (String v) {
		String t = "";
		String[] n = v.split(" ");
		Arrays.sort(n);
		for (String i:n) {
			t =  t + i + " "; 
		}
		return t;
	}
	
	//sort a line array
	public static String[] sort (String[] v) {
		String[] t = new String[v.length];
		for (int i = 0; i < v.length;i++) {
			t[i] = sort(v[i]);
		}
		return t;
	}
	
	//replace names with another name
	public static String replace (String name){
		String t = "error";
		if (name.equals("Vader")) {
			t = "V-1"; 
		}else if (name.equals("Luke")) {
			t = "L-1";
		}else if (name.equals("Leia")) {
			t = "L-2";
		}else if (name.equals("Han")) {
			t = "H-1";
		}else if (name.equals("C3PO")) {
			t = "C-1";
		}else if (name.equals("R2D2")) {
			t = "R-1";
		}
		return t;
	}
	
	//replace the name in a String
	public static String sreplace (String v) {
		String t = "";
		String[] n = v.split(" ");
		for (int i = 0; i < n.length;i++) {
			t = t + replace(n[i]) + " ";
		}
		return t;
	}
	
	public static void reverseLineOrder (String I, String O) throws IOException {
		String Ipath = "src/ma/DATA/" + I;
		String Opath = "src/ma/MOD_DATA/" + O;
		
		String[][] in = Helper.read2D(Ipath);
		String[][] out = Helper.reverse2Drows(in);
		Helper.write(out, Opath);
	}
	
	public static void lineSorter (String I, String O) throws IOException {
		String Ipath = "src/ma/DATA/" + I;
		String Opath = "src/ma/MOD_DATA/" + O;
		
		String[][] in = Helper.read2D(Ipath);
		String[][] out = Helper.sort(in);

		Helper.write(out,Opath);
		
	}
	
	public static void substituteSortReverse (String I, String O) throws IOException {
		String Ipath = "src/ma/DATA/" + I;
		String Opath = "src/ma/MOD_DATA/" + O;
				
		String[][] in = Helper.read2D(Ipath);
		
		String[][] med = Helper.replace(in,"Vader","V-1");
		med = Helper.replace(med,"Luke","L-1");
		med = Helper.replace(med,"Leia","L-2");
		med = Helper.replace(med,"Han","H-1");
		med = Helper.replace(med,"C3PO","C-1");
		med = Helper.replace(med,"R2D2","R-1");
		
		med = Helper.reverse2Drows(med);
		String[][] out = Helper.sort(med);

		Helper.write(out,Opath);
		
	}


}
