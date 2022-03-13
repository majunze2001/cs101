package ma.PARTII;

public class Part2 {
	
	public static int[] sumOddEven(int[][] v) {
		int[] r = new int[2];
		int o = 0, e = 0;
		for (int i = 0; i < v.length; i++){
			for (int j = 0; j < v[i].length; j++){
				if (v[i][j] % 2 == 0) {
					e += v[i][j];
				}else {
					o += v[i][j];
				}
			}
		}
		r[0] = o; r[1] = e;
		return r;
	}
	
	public static String[] bigSmallWord(String[][] v) {
		String l = "", s = "aassssssss";
		for (int i = 0; i < v.length; i++){
			for (int j = 0; j < v[i].length; j++){
				if (v[i][j].length() > l.length()) {
					l = v[i][j];
				}
				if (v[i][j].length() < s.length()) {
					s = v[i][j];
				}
			}
		}
		String[] r = new String[2];
		r[0] = l;
		r[1] = s;
		return r;	
	}
	
	

}
