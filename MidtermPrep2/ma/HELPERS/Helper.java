package ma.HELPERS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Helper {
	
	//count PP
	public static double countPP (String[] v) {
		double n = 0;
		for (String i:v) {
			if (i.equals("PP")) {
				n++;
			}
				
		}
		return n;
	}
	
	
	//countNN
	public static double countNN (String[] v) {
		double n = 0;
		for (String i:v) {
			if (i.equals("NN")) {
				n++;
			}
			
		}
		return n;
	}
	
	
	//countPN
	public static double countPN (String[] v) {
		double n = 0;
		for (String i:v) {
			if (i.equals("PN")) {
				n++;
			}
			
		}
		return n;
	}
	
	
	//countNP
	public static double countNP (String[] v) {
		double n = 0;
		for (String i:v) {
			if (i.equals("NP")) {
				n++;
			}
			
		}
		return n;
	}
	

		
	//display 1D integer array
	public static void displayArray(int[] v) {
		for (int i: v) {
			System.out.print(i + " ");;
		}
		System.out.println();
	}
	
	
	//display string array
	public static void displayArray(String[] v) {
		for (String i: v) {
			System.out.print(i + " ");;
		}
		System.out.println();
	}
		
	
	//display 2D integer array
	public static void displayArray(int[][] v) {
		for (int[] i: v) {
			for (int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
		
	
	//display 2D string array
	public static void displayArray(String[][] v) {
		for (String[] i: v) {
			for (String j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	
	//reverse 1D integer array
	public static int[] reverseArray(int[] v) {
		int[] t = new int[v.length];
		for (int i = 0; i < v.length; i++) {
			t[i] = v[v.length -1 - i];
		}
		return t;
	}
	
	
	//reverse 1D string array
	public static String[] reverseArray(String[] v) {
		String[] t = new String[v.length];
		for (int i = 0; i < v.length; i++) {
			t[i] = v[v.length-1-i];
		}
		return t;
	}
	
	
	//reverse 2D integer array by x and y
	public static int[][] reverseArray(int[][] v) {
		int[][] copy = new int[v.length][];
		
		for (int i = 0; i < v.length; i++) {
			int[] t = copyArray(v[v.length - 1 - i]);
			copy[i] = reverseArray(t);
			//copy[i] = copyArray(array[array.length - 1 - i]);
		}
		return copy;
	}
	
	
	//reverse 2D String array by x and y
	public static String[][] reverseArray(String[][] v) {
		String[][] copy = new String[v.length][];
		
		for (int i = 0; i < v.length; i++) {
			String[] t = copyArray(v[v.length - 1 - i]);
			copy[i] = reverseArray(t);
			//copy[i] = copyArray(array[array.length - 1 - i]);
		}
		return copy;
	}
	
	
	//get the number of lines in a file
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
	public static String[] readfile(String path) throws IOException {
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
	
	
	//read elements in file lines into a string array
	public static String[] readeles(String path) throws IOException {
			
		String[] rawd = readfile(path);
		
		String raw = "";
		for (String i: rawd) {
			raw += i.trim() + " ";
		}
			
		String[] data = raw.split(" ");
			
		return data;
		
	}
	
	
	//write a string array in a file 
	public static void write (String[] v, String path) throws IOException {
		BufferedWriter BW = new BufferedWriter(new FileWriter(path));
		for (String i: v) {
			BW.write(i);
			BW.write("\n");
		}
		BW.close();
	}
	
	
	//sort a string by characters
	public static String sort (String v) {
		String t = "";
		String[] n = v.split(" ");
		Arrays.sort(n);
		for (String i:n) {
			t =  t + i + " "; 
		}
		return t;
	}
	
	
	//sort a string by value of integers
	public static String sortvalue (String v) {
		String t = "";
		String[] n = v.split(" ");
		int[] nv = new int[n.length];
		for (int i = 0;i < n.length; i++) {
			nv[i] = Integer.valueOf(n[i]);
		}
		Arrays.sort(nv);
		for (int i: nv) {
			t = t + i + " ";
		}
		return t;
	}
	
	
	//sort the strings in a string array
	public static String[] sort (String[] v) {
		String[] t = new String[v.length];
		for (int i = 0; i < v.length;i++) {
			t[i] = sort(v[i]);
		}
		return t;
	}
	
	
	//sum of values in 1D array
	public static int sum(int[] v) {
		int s = 0;
		for (int i: v) {
			s = s + i;
		}
		return s;
	}
	
	
	//display 2D array with tab
	public static void display2DArray(int[][] v) {
		for (int[] i: v) {
			for (int j: i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
	
	
	//copy 1D integer array
	public static int[] copyArray(int[] array){
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
		    copy[i] = array[i];
		}
		return copy;
	}
	
	
	//copy 2D integer array
	public static int[][] copyArray(int[][] array){
		int[][] copy = new int[array.length][];

		for (int i = 0; i < array.length; i++) {
		    copy[i] = new int[array[i].length];

		    for (int j = 0; j < array[i].length; j++) {
		        copy[i][j] = array[i][j];
		    }
		}
		return copy;
	}


	//copy 1D String array
	public static String[] copyArray(String[] array){
		String[] copy = new String[array.length];
		for (int i = 0; i < array.length; i++) {
		    copy[i] = array[i];
		}
		return copy;
	}
	
	
	//copy 2D String array
	public static String[][] copyArray(String[][] array){
		String[][] copy = new String[array.length][];

		for (int i = 0; i < array.length; i++) {
		    copy[i] = new String[array[i].length];

		    for (int j = 0; j < array[i].length; j++) {
		        copy[i][j] = array[i][j];
		    }
		}
		return copy;
	}
	

	//mirror 2D integer array
	public static int[][] mirror(int[][] array){
		int[][] mirror = new int[array[0].length][array.length];
		for (int i = 0; i < mirror.length; i++) {
			for (int j = 0; j < mirror[i].length; j++) {
				mirror[i][j] = array[j][i];
			}
		}
		return mirror;
	}
	
	//mirror 2D String array
	public static String[][] mirror(String[][] array){
		String[][] mirror = new String[array[0].length][array.length];
		for (int i = 0; i < mirror.length; i++) {
			for (int j = 0; j < mirror[i].length; j++) {
				mirror[i][j] = array[j][i];
			}
		}
		return mirror;
	}
	
	
	//get columns
	public static int[] getColumns(int[][] array, int t) {
		int[] de = {0,0,0};		
		int[] tarray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (t-1 >= array[i].length) {
				System.out.println("Matrix Violation");
				return de;
			}
			
			tarray[i] = array[i][t-1];
		}
		return tarray;
	}
	
	//get rows
	public static int[] getRows(int[][] array, int t) {
		int[] de = {0,0,0};
		if (t - 1 >= array.length) {
			System.out.println("Matrix Violation");
			return de;
		}
		int[] tarray = new int[array[t-1].length];
		for (int i = 0; i < array[t-1].length; i++) {
			tarray[i] = array[t-1][i];
		}
		return tarray;
	}
	
	//1D arrays sum
	public static int[] sumArray(int[] a, int[] b) {
		int[] de = {0,0,0};
		if (a.length != b.length) {
			System.out.println("Matrix Violation");
			return de;
		}
		int[] sum = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			sum [i] = a[i] + b[i];
		}
		return sum;
	}
	
	//1D multiply array
	public static int[] mulArray(int[] a, int[] b) {
		int[] de = {0,0,0};
		if (a.length != b.length) {
			System.out.println("Matrix Violation");
			return de;
		}
		int[] mul = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			mul [i] = a[i] * b[i];
		}
		return mul;
	}

}
