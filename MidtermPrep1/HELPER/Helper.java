package ma.HELPER;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Helper {
		//String
	//char[] array = string.toCharArray();
	
	//keep letters
	public static String keepLetters(String s) {
		return s.replaceAll("[^a-zA-Z]", "");
	}
	
	//keep numbers
	public static String keepNumbers(String s) {
		return s.replaceAll("[^0-9]", "");
	}

	//keep letters and numbers
	public static String keepLettersAndNumbers(String s) {
		return s.replaceAll("[^a-zA-Z0-9]", "");
	}


		// 1D integer Arrays
	// display 1D integer array
	public static void displayArray(int[] v) {
		for (int i : v) {
			System.out.print(i + " ");
			;
		}
		System.out.println();
	}

	// copy 1D integer array
	public static int[] copyArray(int[] array) {
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		return copy;
	}

	// reverse 1D integer array
	public static int[] reverseArray(int[] v) {
		int[] t = new int[v.length];
		for (int i = 0; i < v.length; i++) {
			t[i] = v[v.length - 1 - i];
		}
		return t;
	}

	// sum of values in 1D integer array
	public static int sum(int[] v) {
		int s = 0;
		for (int i : v) {
			s = s + i;
		}
		return s;
	}

	// count a number in 1D integer array
	public static int count(int[] v, int x) {
		int c = 0;
		for (int i : v) {
			if (i == x) {
				c++;
			}
		}
		return c;
	}

	// replace a number in 1D integer array
	public static int[] replace(int[] v, int x, int y) {
		int[] t = copyArray(v);
		for (int i = 0; i < v.length; i++) {
			if (t[i] == x) {
				t[i] = y;
			}
		}
		return t;
	}

	// remove a number in 1D integer array
	public static int[] remove(int[] v, int x) {
		int n = count(v, x);
		int c = 0;
		int[] t = new int[v.length - n];
		for (int i = 0; i < v.length; i++) {
			if (v[i] != x) {
				t[c] = v[i];
				c++;
			}
		}
		return t;

	}

	// 1D arrays sum
	public static int[] sumArray(int[] a, int[] b) {
		int[] de = { 0, 0, 0 };
		if (a.length != b.length) {
			System.out.println("Matrix Violation");
			return de;
		}
		int[] sum = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			sum[i] = a[i] + b[i];
		}
		return sum;
	}

	// 1D multiply array
	public static int[] mulArray(int[] a, int[] b) {
		int[] de = { 0, 0, 0 };
		if (a.length != b.length) {
			System.out.println("Matrix Violation");
			return de;
		}
		int[] mul = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			mul[i] = a[i] * b[i];
		}
		return mul;
	}
	
	// convert integer array into string array
	public static String[] toStringArray(int[] v) {
		String[] t = new String[v.length];
		for (int i = 0; i < v.length; i++) {
			t[i] = String.valueOf(v[i]);
		}
		return t;
	}

	// convert integer array into double array
	public static double[] toDoubleArray(int[] v) {
		double[] t = new double[v.length];
		for (int i = 0; i < v.length; i++) {
			t[i] = Double.valueOf(v[i]);
		}
		return t;
	}

	// convert string array into integer array
	public static int[] toIntegerArray(String[] v) {
		int[] t = new int[v.length];
		for (int i = 0; i < v.length; i++) {
			t[i] = Integer.valueOf(v[i]);
		}
		return t;
	}

	// convert string array into double array
	public static double[] toDoubleArray(String[] v) {
		double[] t = new double[v.length];
		for (int i = 0; i < v.length; i++) {
			t[i] = Double.valueOf(v[i]);
		}
		return t;
	}
	
	
		// 2D integer arrays
	// display 2D integer array
	public static void displayArray(int[][] v) {
		for (int[] i : v) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	// display 2D array with tab
	public static void display2DArray(int[][] v) {
		for (int[] i : v) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
	
	// copy 2D integer array including ragged
	public static int[][] copyArray(int[][] array) {
		int[][] copy = new int[array.length][];

		for (int i = 0; i < array.length; i++) {
			copy[i] = new int[array[i].length];

			for (int j = 0; j < array[i].length; j++) {
				copy[i][j] = array[i][j];
			}
		}
		return copy;
	}

	// check if it is a square integer array
	public static boolean isSquare(int[][] v) {
		boolean flag = true;
		int l = v.length;
		for (int i = 0; i < v.length; i++) {
			if (l != v[i].length) {
				flag = false;
			}
		}
		return flag;
	}

	// check if it is a rectangular integer array
	public static boolean isRectangular(int[][] v) {
		boolean flag = true;

		if (isSquare(v)) {
			return false;
		}

		int l = v[0].length;
		for (int i = 1; i < v.length; i++) {
			if (l != v[i].length) {
				return false;
			}
		}
		return flag;
	}

	// check if it is a ragged array
	public static boolean isRagged(int[][] v) {
		boolean flag = true;
		if (isSquare(v) || isRectangular(v)) {
			return false;
		}
		return flag;
	}
	
	// get a column of a 2D integer array
	public static int[] getColumns(int[][] array, int t) {
		
		int[] de = { 0, 0, 0 };
		int[] tarray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (t - 1 >= array[i].length) {
				System.out.println("Matrix Violation");
				return de;
			}

			tarray[i] = array[i][t - 1];
		}
		return tarray;
	}

	// get a row of a 2D integer array
	public static int[] getRows(int[][] array, int t) {
		int[] de = { 0, 0, 0 };
		if (t - 1 >= array.length) {
			System.out.println("Matrix Violation");
			return de;
		}
		int[] tarray = new int[array[t - 1].length];
		for (int i = 0; i < array[t - 1].length; i++) {
			tarray[i] = array[t - 1][i];
		}
		return tarray;
	}

	// reverse 2D integer array by rows
	public static int[][] reverse2Drows(int[][] v) {
		int[][] t = new int[v.length][];

		for (int i = 0; i < v.length; i++) {
			t[i] = v[v.length - 1 - i];
		}

		return t;

	}

	// reverse 2D integer array by columns
	public static int[][] reverse2Dcolumns(int[][] v) {
		int[][] t = new int[v.length][];

		for (int i = 0; i < v.length; i++) {
			t[i] = reverseArray(v[i]);
		}
		return t;
	}

	// reverse 2D integer array by rows and columns
	public static int[][] reverseArray(int[][] v) {
		int[][] t = new int[v.length][];
		t = reverse2Drows(v);
		t = reverse2Dcolumns(t);
		return t;
	}

	// mirror 2D integer array
	public static int[][] mirror(int[][] array) {
		int[][] mirror = new int[array[0].length][array.length];
		for (int i = 0; i < mirror.length; i++) {
			for (int j = 0; j < mirror[i].length; j++) {
				mirror[i][j] = array[j][i];
			}
		}
		return mirror;
	}

	// count the elements in a 2D integer array
	public static int count(int[][] v) {
		int c = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				c++;
			}
		}
		return c;
	}

	// convert 2D integer array into a 1D integer array
	public static int[] convert(int[][] v) {
		int[] t = new int[count(v)];
		int c = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				t[c] = v[i][j];
				c++;
			}
		}
		return t;
	}

	// sort 2D integer array
	public static int[][] sort(int[][] v) {
		int[][] t = new int[v.length][];
		for (int i = 0; i < v.length; i++) {
			int[] n = copyArray(v[i]);
			Arrays.sort(n);
			t[i] = n;
		}
		return t;
	}
	
	//replace a number in 2D array
	public static int[][] replace(int[][] v, int x, int y) {
		int[][] t = new int[v.length][];
		for (int i = 0; i < v.length; i++){
				t[i] = replace(v[i], x, y);
		}
		return t;
	}

	//remove a number in 2D array
	public static int[][] remove(int[][] v, int x) {
		int[][] t = new int[v.length][];
		for (int i = 0; i < v.length; i++){
			t[i] = remove(v[i], x);
		}
		return t;
	}
	 
	// count a number in 2D integer array
	public static int count(int[][] v, int x) {
		int c = 0;
		for (int[] i : v) {
			for (int j:i) {
				if (j == x) {
					c++;
				}
			}	
		}
		return c;
	}
		
	//convert 2D integer array to 2D string array
	public static String[][] toStringArray(int[][] v) {
		String[][] t = new String[v.length][];
		for (int i = 0; i < v.length; i++){
			t[i] = toStringArray(v[i]);
		}
		return t;
	}
	
	//convert 2D String array to 2D integer array
	public static int[][] toIntegerArray(String[][] v) {
		int[][] t = new int[v.length][];
		for (int i = 0; i < v.length; i++){
			t[i] = toIntegerArray(v[i]);
		}
		return t;
	}
	
	//convert 2D String array to 2D double array
	public static double[][] toDoubleArray(String[][] v) {
		double[][] t = new double[v.length][];
		for (int i = 0; i < v.length; i++){
			t[i] = toDoubleArray(v[i]);
		}
		return t;
	}

	
	
	
		// File IO
	// count lines in a file
	public static int countLines(String path) throws IOException {
		int l = 0;
		BufferedReader BR = new BufferedReader(new FileReader(path));
		while (BR.readLine() != null) {
			l++;
		}
		BR.close();
		return l;
	}

	// read file lines into a 1D string array
	public static String[] read1D(String path) throws IOException {
		int l = countLines(path);
		String[] file = new String[l];
		BufferedReader BR = new BufferedReader(new FileReader(path));
		String line = "";
		int c = 0;
		while ((line = BR.readLine()) != null) {
			file[c] = line;
			c++;
		}
		BR.close();
		return file;
	}

	// read file into a 2D string array split by " "
	public static String[][] read2D(String path) throws IOException {
		int l = countLines(path);
		String[] v = read1D(path);
		String[][] file = new String[l][];
		for (int i = 0; i < v.length; i++) {
			file[i] = v[i].split(" ");
		}
		return file;

	}

	// read elements in file lines into a string array
	public static String[] readeles(String path) throws IOException {
		String[] rawd = read1D(path);

		String raw = "";
		for (String i : rawd) {
			raw += i.trim() + " ";
		}
		String[] data = raw.split(" ");
		return data;
	}

	// write a 1D string array in a file
	public static void write(String[] v, String path) throws IOException {
		BufferedWriter BW = new BufferedWriter(new FileWriter(path));
		for (String i : v) {
			BW.write(i);
			BW.write("\n");
		}
		BW.close();
	}

	// write a 2D string array in a file with " "
	public static void write(String[][] v, String path) throws IOException {
		BufferedWriter BW = new BufferedWriter(new FileWriter(path));
		for (String[] i : v) {
			for (String j : i) {
				BW.write(j);
				BW.write(" ");
			}
			BW.write("\n");
		}
		BW.close();
	}

	// write a 2D integer array in a file with " "
	public static void write(int[][] v, String path) throws IOException {
		BufferedWriter BW = new BufferedWriter(new FileWriter(path));
		for (int[] i : v) {
			for (int j : i) {
				BW.write(j);
				BW.write(" ");
			}
			BW.write("\n");
		}
		BW.close();
	}	

	
	
	
	// reverse 1D double array
	public static Double[] reverseArray(Double[] v) {
		Double[] t = new Double[v.length];
		for (int i = 0; i < v.length; i++) {
			t[i] = v[v.length - 1 - i];
		}
		return t;
	}

	// reverse 2D integer array by x and y
	public static int[][] reversArray(int[][] v) {
		int[][] copy = new int[v.length][];

		for (int i = 0; i < v.length; i++) {
			int[] t = copyArray(v[v.length - 1 - i]);
			copy[i] = reverseArray(t);
			// copy[i] = copyArray(array[array.length - 1 - i]);
		}
		return copy;
	}

	// reverse 2D String array by x and y
	public static String[][] reversArray(String[][] v) {
		String[][] copy = new String[v.length][];

		for (int i = 0; i < v.length; i++) {
			String[] t = copyArray(v[v.length - 1 - i]);
			copy[i] = reverseArray(t);
			// copy[i] = copyArray(array[array.length - 1 - i]);
		}
		return copy;
	}

	// sort the separate strings in a line string
	public static String sort(String v) {
		String t = "";
		String[] n = v.split(" ");
		Arrays.sort(n);
		for (String i : n) {
			t = t + i + " ";
		}
		return t;
	}

	// sort a line string by value of integers
	public static String sortvalue(String v) {
		String t = "";
		String[] n = v.split(" ");
		int[] nv = new int[n.length];
		for (int i = 0; i < n.length; i++) {
			nv[i] = Integer.valueOf(n[i]);
		}
		Arrays.sort(nv);
		for (int i : nv) {
			t = t + i + " ";
		}
		return t;
	}

	// sort the strings in a string array
	public static String[] sort(String[] v) {
		String[] t = new String[v.length];
		for (int i = 0; i < v.length; i++) {
			t[i] = sort(v[i]);
		}
		return t;
	}

	


		//decimals
	// keep decimal numbers of a double
	public static double keepd(double d, int i) {
		double m = Math.pow(10, i);
		double t = (double) Math.round(d * m) / m;
		return t;
	}

	// string with decimal numbers of a double with 0
	public static String strkeepd(double d, int i) {
		String s = "#.";
		for (int c = 0; c < i; c++) {
			s += "0";
		}
		DecimalFormat df = new DecimalFormat(s);
		return df.format(d);
	}

	//string with decimal numbers of a double with 0 or integer
	public static String keepid(double d, int i) {
		String s = "#.";
		for (int c = 0; c < i; c++) {
			s += "#";
		}
		DecimalFormat df = new DecimalFormat(s);
		return df.format(d);
	}
	
	// auto string with decimal numbers of a double with 0 or integer
	public static String autokeepd(double d, int i) {
		String s = "#.";
		int l = i;
		while (l > 0) {
			s += "0";
			l--;
		}
		DecimalFormat df = new DecimalFormat(s);
		DecimalFormat dfi = new DecimalFormat("#");

		double b = keepd(d, i);

		if ((double) (b % 1) == 0) {
			return dfi.format(b);
		} else {
			return df.format(d);
		}
	}

	
	
	// judge if an element is in a 1D array
	public static boolean contains(String[] v, String t) {
		int f = Arrays.binarySearch(v, t);
		if (f >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean contains(int[] v, int t) {
		int f = Arrays.binarySearch(v, t);
		if (f >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean contains(double[] v, double t) {
		int f = Arrays.binarySearch(v, t);
		if (f >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean contains(Object[] v, Object t) {
		int f = Arrays.binarySearch(v, t);
		if (f >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean contains(String v, char a) {
		String t = Character.toString(a);
		return v.contains(t);
	}

	public static boolean contains(String v, String t) {
		return v.contains(t);
	}



		//string arrays
	// display 1D string array
	public static void displayArray(String[] v) {
		for (String i : v) {
			System.out.print(i + " ");
			;
		}
		System.out.println();
	}

	// copy 1D string array
	public static String[] copyArray(String[] array) {
		String[] copy = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		return copy;
	}

	// reverse 1D string array
	public static String[] reverseArray(String[] v) {
		String[] t = new String[v.length];
		for (int i = 0; i < v.length; i++) {
			t[i] = v[v.length - 1 - i];
		}
		return t;
	}

	// sum of strings in 1D string array
	public static String sum(String[] v) {
		String s = "";
		for (String i : v) {
			s = s + i;
		}
		return s;
	}

	// count a String in 1D string array
	public static int count(String[] v, String x) {
		int c = 0;
		for (String i : v) {
			if (i.equals(x)) {
				c++;
			}
		}
		return c;
	}

	// replace a String in 1D string array
	public static String[] replace(String[] v, String x, String y) {
		String[] t = copyArray(v);
		for (int i = 0; i < v.length; i++) {
			if (t[i].equals(x)) {
				t[i] = y;
			}
		}
		return t;
	}

	// remove a String in 1D string array
	public static String[] remove(String[] v, String x) {
		int n = count(v, x);
		int c = 0;
		String[] t = new String[v.length - n];
		for (int i = 0; i < v.length; i++) {
			if (!v[i].equals(x)) {
				t[c] = v[i];
				c++;
			}
		}
		return t;

	}


	
		// 2D string arrays
	// display 2D string array
	public static void displayArray(String[][] v) {
		for (String[] i : v) {
			for (String j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	// display 2D array with tab
	public static void display2DArray(String[][] v) {
		for (String[] i : v) {
			for (String j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}

	// copy 2D string array including ragged
	public static String[][] copyArray(String[][] array) {
		String[][] copy = new String[array.length][];

		for (int i = 0; i < array.length; i++) {
			copy[i] = new String[array[i].length];

			for (int j = 0; j < array[i].length; j++) {
				copy[i][j] = array[i][j];
			}
		}
		return copy;
	}

	// check if it is a square string array
	public static boolean isSquare(String[][] v) {
		boolean flag = true;
		int l = v.length;
		for (int i = 0; i < v.length; i++) {
			if (l != v[i].length) {
				flag = false;
			}
		}
		return flag;
	}

	// check if it is a rectangular string array
	public static boolean isRectangular(String[][] v) {
		boolean flag = true;

		if (isSquare(v)) {
			return false;
		}

		int l = v[0].length;
		for (int i = 1; i < v.length; i++) {
			if (l != v[i].length) {
				return false;
			}
		}
		return flag;
	}

	// check if it is a ragged array
	public static boolean isRagged(String[][] v) {
		boolean flag = true;
		if (isSquare(v) || isRectangular(v)) {
			return false;
		}
		return flag;
	}

	// get a column of a 2D string array
	public static String[] getColumns(String[][] array, int t) {
		String[] tarray = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			tarray[i] = array[i][t - 1];
		}
		return tarray;
	}

	// get a row of a 2D string array
	public static String[] getRows(String[][] array, int t) {
		String[] tarray = new String[array[t - 1].length];
		for (int i = 0; i < array[t - 1].length; i++) {
			tarray[i] = array[t - 1][i];
		}
		return tarray;
	}

	// reverse 2D string array by rows
	public static String[][] reverse2Drows(String[][] v) {
		String[][] t = new String[v.length][];

		for (int i = 0; i < v.length; i++) {
			t[i] = v[v.length - 1 - i];
		}

		return t;

	}

	// reverse 2D string array by columns
	public static String[][] reverse2Dcolumns(String[][] v) {
		String[][] t = new String[v.length][];

		for (int i = 0; i < v.length; i++) {
			t[i] = reverseArray(v[i]);
		}
		return t;
	}

	// reverse 2D string array by rows and columns
	public static String[][] reverseArray(String[][] v) {
		String[][] t = new String[v.length][];
		t = reverse2Drows(v);
		t = reverse2Dcolumns(t);
		return t;
	}

	// mirror 2D String array
	public static String[][] mirror(String[][] array) {
		String[][] mirror = new String[array[0].length][array.length];
		for (int i = 0; i < mirror.length; i++) {
			for (int j = 0; j < mirror[i].length; j++) {
				mirror[i][j] = array[j][i];
			}
		}
		return mirror;
	}
	
	// count the elements in a 2D string array
	public static int count(String[][] v) {
		int c = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				c++;
			}
		}
		return c;
	}

	// convert 2D string array into a 1D string array
	public static String[] convert(String[][] v) {
		String[] t = new String[count(v)];
		int c = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				t[c] = v[i][j];
				c++;
			}
		}
		return t;
	}

	// sort 2D string array
	public static String[][] sort(String[][] v) {
		String[][] t = new String[v.length][];
		for (int i = 0; i < v.length; i++) {
			String[] n = copyArray(v[i]);
			Arrays.sort(n);
			t[i] = n;
		}
		return t;
	}

	
	//replace a double in 2D array
	public static double[][] replace(double[][] v, double x, double y) {
		double[][] t = new double[v.length][];
		for (int i = 0; i < v.length; i++){
				t[i] = replace(v[i], x, y);
		}
		return t;
	}

	//remove a double in 2D array
	public static double[][] remove(double[][] v, double x) {
		double[][] t = new double[v.length][];
		for (int i = 0; i < v.length; i++){
			t[i] = remove(v[i], x);
		}
		return t;
	}
		
	
	// count a string in 2D integer array
	public static int count(String[][] v, String x) {
		int c = 0;
		for (String[] i : v) {
			for (String j:i) {
				if (j.equals(x)) {
					c++;
				}
			}	
		}
		return c;
	}
	
	
	
	
		//double arrays
	// display 1D double array
	public static void displayArray(double[] v) {
		for (double i : v) {
			System.out.print(i + " ");
			;
		}
		System.out.println();
	}

	// copy 1D double array
	public static double[] copyArray(double[] array) {
		double[] copy = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		return copy;
	}

	// reverse 1D double array
	public static double[] reverseArray(double[] v) {
		double[] t = new double[v.length];
		for (int i = 0; i < v.length; i++) {
			t[i] = v[v.length - 1 - i];
		}
		return t;
	}

	// sum of doubles in 1D double array
	public static double sum(double[] v) {
		double s = 0;
		for (double i : v) {
			s = s + i;
		}
		return s;
	}

	// count a double in 1D double array
	public static int count(double[] v, double x) {
		int c = 0;
		for (double i : v) {
			if (i == x) {
				c++;
			}
		}
		return c;
	}

	// replace a double in 1D double array
	public static double[] replace(double[] v, double x, double y) {
		double[] t = copyArray(v);
		for (int i = 0; i < v.length; i++) {
			if (t[i] == (x)) {
				t[i] = y;
			}
		}
		return t;
	}

	// remove a double in 1D double array
	public static double[] remove(double[] v, double x) {
		int n = count(v, x);
		int c = 0;
		double[] t = new double[v.length - n];
		for (int i = 0; i < v.length; i++) {
			if (v[i] != x) {
				t[c] = v[i];
				c++;
			}
		}
		return t;

	}

		// 2D double arrays
	// display 2D double array
	public static void displayArray(double[][] v) {
		for (double[] i : v) {
			for (double j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	// display 2D array with tab
	public static void display2DArray(double[][] v) {
		for (double[] i : v) {
			for (double j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}

	// copy 2D double array including ragged
	public static double[][] copyArray(double[][] array) {
		double[][] copy = new double[array.length][];

		for (int i = 0; i < array.length; i++) {
			copy[i] = new double[array[i].length];

			for (int j = 0; j < array[i].length; j++) {
				copy[i][j] = array[i][j];
			}
		}
		return copy;
	}

	// check if it is a square double array
	public static boolean isSquare(double[][] v) {
		boolean flag = true;
		int l = v.length;
		for (int i = 0; i < v.length; i++) {
			if (l != v[i].length) {
				flag = false;
			}
		}
		return flag;
	}

	// check if it is a rectangular double array
	public static boolean isRectangular(double[][] v) {
		boolean flag = true;

		if (isSquare(v)) {
			return false;
		}

		int l = v[0].length;
		for (int i = 1; i < v.length; i++) {
			if (l != v[i].length) {
				return false;
			}
		}
		return flag;
	}

	// check if it is a ragged array
	public static boolean isRagged(double[][] v) {
		boolean flag = true;
		if (isSquare(v) || isRectangular(v)) {
			return false;
		}
		return flag;
	}

	// get a column of a 2D double array
	public static double[] getColumns(double[][] array, int t) {
		double[] tarray = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			tarray[i] = array[i][t - 1];
		}
		return tarray;
	}

	// get a row of a 2D double array
	public static double[] getRows(double[][] array, int t) {
		double[] tarray = new double[array[t - 1].length];
		for (int i = 0; i < array[t - 1].length; i++) {
			tarray[i] = array[t - 1][i];
		}
		return tarray;
	}

	// reverse 2D double array by rows
	public static double[][] reverse2Drows(double[][] v) {
		double[][] t = new double[v.length][];

		for (int i = 0; i < v.length; i++) {
			t[i] = v[v.length - 1 - i];
		}

		return t;

	}

	// reverse 2D double array by columns
	public static double[][] reverse2Dcolumns(double[][] v) {
		double[][] t = new double[v.length][];

		for (int i = 0; i < v.length; i++) {
			t[i] = reverseArray(v[i]);
		}
		return t;
	}

	// reverse 2D double array by rows and columns
	public static double[][] reverseArray(double[][] v) {
		double[][] t = new double[v.length][];
		t = reverse2Drows(v);
		t = reverse2Dcolumns(t);
		return t;
	}

	// mirror 2D double array
	public static double[][] mirror(double[][] array) {
		double[][] mirror = new double[array[0].length][array.length];
		for (int i = 0; i < mirror.length; i++) {
			for (int j = 0; j < mirror[i].length; j++) {
				mirror[i][j] = array[j][i];
			}
		}
		return mirror;
	}
	
	// count the elements in a 2D double array
	public static int count(double[][] v) {
		int c = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				c++;
			}
		}
		return c;
	}

	// convert 2D double array into a 1D double array
	public static double[] convert(double[][] v) {
		double[] t = new double[count(v)];
		int c = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				t[c] = v[i][j];
				c++;
			}
		}
		return t;
	}

	// sort 2D double array
	public static double[][] sort(double[][] v) {
		double[][] t = new double[v.length][];
		for (int i = 0; i < v.length; i++) {
			double[] n = copyArray(v[i]);
			Arrays.sort(n);
			t[i] = n;
		}
		return t;
	}

	//replace a String in 2D array
	public static String[][] replace(String[][] v, String x, String y) {
		String[][] t = new String[v.length][];
		for (int i = 0; i < v.length; i++){
				t[i] = replace(v[i], x, y);
		}
		return t;
	}

	//remove a String in 2D array
	public static String[][] remove(String[][] v, String x) {
		String[][] t = new String[v.length][];
		for (int i = 0; i < v.length; i++){
			t[i] = remove(v[i], x);
		}
		return t;
	}
	
	// count a double in 2D integer array
	public static int count(double[][] v, double x) {
		int c = 0;
		for (double[] i : v) {
			for (double j:i) {
				if (j == x) {
					c++;
				}
			}	
		}
		return c;
	}
	
	
	
	
	
	
}
