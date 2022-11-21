class Esercizi1 {
	
	public static void m(int[] a, int i, int j){
		int x;
		x = a[i];
		a[i] = a[j];
		a[j] = x;
	}
	
	public static void main(String[] args){
		int[] x = {1, 2, 3};
		m(x, x[0], x[1]);
	}
}