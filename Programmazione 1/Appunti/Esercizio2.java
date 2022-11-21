class Esercizio2{
	public static void m(int[] a, int i, int j){
		int x = a[i];
		a[i] = a[j];
		a[j] = x;
	}
	
	public static void mm(int[] a){
		int[] x = {3,2,1,0};
		m(x, x[0], x[1]); // (1)
		m(x, x[1], x[2]); // (2)
	}
	
	public static void main(String[] args) {
		int[] x = {1, 2, 3};
		mm(x);	//(@)
	}
}