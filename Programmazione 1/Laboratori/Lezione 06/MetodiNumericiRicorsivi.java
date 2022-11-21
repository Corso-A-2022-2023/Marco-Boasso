class MetodiNumericiRicorsivi{
	public static int esponenziale(int b, int e){
		int r = 1;
		if (e != 0){
			r = b*esponenziale(b, e - 1);
		}
		return r;
	}

	public static int somma(int a, int b){
		int r = a;
		if (b != 0)
			r = somma(a + 1, b - 1);
		return r;
	}
	
	public static int prodottoMultipli(int n, int m, int q){ //condizione di ingresso:  q <= n <= m (non controllata)
		int p = 1;
		if (m == 0){ //caso limite in cui q, n, m = 0  
			p = 0;
		}
		
		else if((n <= m) && (n%q == 0)){ //nel caso in cui n sia divisibile per q
			p = n * prodottoMultipli(n+1, m, q); //P(n) = n * p(n + 1)
		}
		
		else if(n <= m){ //nel caso in cui n NON sia divisibile per q
			p = prodottoMultipli(n+1, m, q); // P(n) = P(n + 1)
		}
		return p;
	}

	public static void stampaInteroRovescio(int n){
		//int i = n - 1;
		if (n == 0){
			System.out.println(n);
			return;
		}
		else{
			System.out.println(n);
			stampaInteroRovescio(n-1);
			
		}
		
		return;
	}
	
	public static void main(String[] args){
		/*
		int b = 8;
		int e = 5;
		int k = 2;
		int r = esponenziale(b, e);
		System.out.println(r);

		r = somma(e, b);
		System.out.println(r);
		
		r = prodottoMultipli(1, 10, 3);
		System.out.println(r);
		*/
		
		stampaInteroRovescio(13);
	}
}