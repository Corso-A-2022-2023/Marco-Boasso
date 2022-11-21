class PitagoraRicorsivo{
	public static int rigaTavola(int a, int n){
		System.out.print(a*n + "\t");
		if (a <= 9){
			a = rigaTavola(a + 1, n);
		}
		return a;
	}	
	public static void tavolaPitagorica(int n){
		int r = 0;
		if (n <= 10){
			r = rigaTavola(1, n);
			System.out.println("");
			n = tavolaPitagorica(n + 1);
		}
		return;
	}
	public static void main(String[] args){
		tavolaPitagorica(1);
	}
}