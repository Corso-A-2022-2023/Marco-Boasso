public class AritNatIter {

    // metodo che implementa la somma di due numeri x e y, 
    // attraverso incrementi progressivi di +1. 
    // L'argomento y non può essere negativo.
    public static int somma(int x, int y) { // x, y parametri formali
        int s = x;
        int i = 0;
        while (i < y) {
            s = s + 1;
            i = i + 1;
        }
        return s;
    }

    // il metodo moltiplicazione restituisce il prodotto tra x ed y.
    // Il prodotto viene realizzato attraverso incrementi successivi di +1.
    public static int moltiplicazione(int x, int y) { // x, y parametri formali 
        int m = 0;
        int i = 0;
        while (i < y) {
            m = somma(m, x); // chiamiamo somma sui parametri attuali m e x
            // risultato: m' = m+x
            i = i + 1;
        }
        return m;
    }
	
	// dati due interi restituisca il massimo
	public static int max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
		//return (x > y) ? x : y;
	}
	
	// restituisca la sommatoria 1+2+...+n fino ad n
	public static int sommatoria(int n) {
		// inizio da 0 perche' sommatoria(0) == 0
		int s = 0;
		for (int i = 1; i <= n; i++) 
			s = somma(s, i);
		return s;
	}
	
	// restituisce il fattoriale di n
	public static int fattoriale(int n) {
		// inizio da 1 perche' fattoriale(0) == 1
		int f = 1;
		for (int i = 2; i <= n; i++) 
			f = moltiplicazione(f, i);
		return f;
	}
	
	// dati due interi x e y, calcola x elevato ad y usando la moltiplicazione
	public static int potenza(int x, int y) {
		// ATTENZIONE: non gestiamo correttamente il caso 0 elevato 0
		if (x==0 && y==0)
			return Integer.MIN_VALUE;
		// inizio da 1 perche' potenza(x, 0) == 1
		int p = 1;
		for (int i = 0; i < y; i++)
			p = moltiplicazione(p, x);
		return p;
	}

    public static void main(String[] args) {
        // Test della somma
        System.out.println("33 + 3 = " + somma(33, 3) + ", atteso: " + (33+3));
        System.out.println("4 + 0 = " + somma(4, 0) + ", atteso: " + (4+0));

        // Verifica commutatività della somma
        System.out.println(somma(33, 3) == somma(3, 33));
        System.out.println(somma(4, 0) == somma(0, 4));

        // ESERCIZIO: verificare associatività somma con alcuni esempi di test
        //            (x+y)+z == x+(y+z)
		System.out.println(somma(4, somma(33, 3)) == somma(somma(4, 33), 3));
		System.out.println(somma(0, somma(33, 3)) == somma(somma(0, 33), 3));


        // Test metodo moltiplicazione 
        System.out.println("523 * 13 = " + moltiplicazione(523, 13) 
            + ", atteso: " + (523*13));
        System.out.println("523 * 0 = " + moltiplicazione(523, 0) 
            + ", atteso: " + (523*0));

        // Test commutatività moltiplicazione 
        System.out.println(moltiplicazione(523, 13) == moltiplicazione(13, 523));
        System.out.println(moltiplicazione(523, 0) == moltiplicazione(0, 523));
        System.out.println(moltiplicazione(0, 13) == moltiplicazione(13, 0));

        // ESERCIZIO: verificare associatività moltiplicazione con alcuni esempi di test
        //            (x*y)*z == x*(y*z)
		System.out.println(moltiplicazione(4, moltiplicazione(33, 3)) 
							== moltiplicazione(moltiplicazione(4, 33), 3));
		System.out.println(moltiplicazione(1, moltiplicazione(33, 3)) 
							== moltiplicazione(moltiplicazione(1, 33), 3));
							
		// Test per il metodo max
		System.out.println("max(10, 20) = "+max(10, 20)+" atteso: "+20);
		System.out.println("max(10, -20) = "+max(10, -20)+" atteso: "+10);

		// Test per il metodo sommatoria
		System.out.println("sommatoria(3) = "+sommatoria(3)
							+" atteso: "+(1+2+3));
		System.out.println("sommatoria(6) = "+sommatoria(6)
							+" atteso: "+(1+2+3+4+5+6));
		System.out.println("sommatoria(0) = "+sommatoria(0)
							+" atteso: "+0);
		System.out.println("sommatoria(1) = "+sommatoria(1)
							+" atteso: "+1);

		// Test per il metodo fattoriale
		System.out.println("fattoriale(3) = "+fattoriale(3)
							+" atteso: "+(1*2*3));
		System.out.println("fattoriale(6) = "+fattoriale(6)
							+" atteso: "+(1*2*3*4*5*6));
		System.out.println("fattoriale(0) = "+fattoriale(0)
							+" atteso: "+1);
		System.out.println("fattoriale(1) = "+fattoriale(1)
							+" atteso: "+1);

		// Test per il metodo potenza
		System.out.println("potenza(2, 3) = "+potenza(2, 3)
							+" atteso: "+(2*2*2));
		System.out.println("potenza(6, 1) = "+potenza(6, 1)
							+" atteso: "+6);
		System.out.println("potenza(6, 0) = "+potenza(6, 0)
							+" atteso: "+1);
		System.out.println("potenza(0, 2) = "+potenza(0, 2)
							+" atteso: "+0);
		System.out.println("potenza(1, 7) = "+potenza(1, 7)
							+" atteso: "+1);
		System.out.println("potenza(0, 0) = "+potenza(0, 0)
							+" non gestito.");
    }
}
