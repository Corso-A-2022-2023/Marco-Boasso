import java.util.Scanner;
public class MetodiSuArray{
	//EX1
	public static int[] initArrayInt(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserire la lunghezza del vettore: ");
		int n = sc.nextInt();
		System.out.println("");
		int[] ary = new int[n];
		for(int i = 0; i<n; i++){
			System.out.print("Inserire un elemento del vettore: ");
			ary[i] = sc.nextInt();
			System.out.println("");
		}
		return ary;
	}
	public static void stampaArrayInt(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
	
	//EX2
	public static void copiaElementi(int[] from, int[] to){
		for(int i = 0; i<from.length; i++){
			to[i] = from[i];
		}
	}
	public static int[] clonaArray(int[] a){
		if(a == null)
			return null;
		int[] b = new int[a.length];
		copiaElementi(a, b);
		return b;
	}
	
	//EX3
	public static int[] filtroMinoriDi(int[] a, int limiteSuperiore){
		int n = 0;
		for(int i = 0; i<a.length; i++)
			if(a[i]<limiteSuperiore)
				n++;
			
		int[] limite = new int[n];
		int index = 0;
		for(int i = 0; i<a.length; i++){
			if(a[i]<limiteSuperiore)
				limite[index++] = a[i];
		}
		return limite;
	}
	public static int[] filtroIntervalloDisp(int[] a, int min, int max){
		int n = 0;
		for(int i = 0; i<a.length; i++)
			if(a[i]<=max && a[i]>=min && (a[i]%2 != 0))
				n++;
			int[] smol =new int[n];
			int index = 0;
		for(int i = 0; i<a.length; i++){
			if(a[i]<=max && a[i]>=min && (a[i]%2 != 0))
				smol[index++] = a[i];
		}
		return smol;
	}
	
	public static boolean[] trasduttore(int[] a, int limiteSuperiore){
		boolean[] frate = new boolean[a.length];
		for(int i = 0; i<a.length; i++){
			if(a[i]<limiteSuperiore)
				frate[i] = true;
			else
				frate[i] = false;
		}
		return frate;
	}
	public static void stampaArrayBoolean(boolean[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
	public static boolean eqArray(int[] a, int[] b){
		if(a==null || b==null || (a.length != b.length))
			return false;
		for(int i = 0; i<a.length; i++)
			if(a[i] != b[i])
				return false;
		//else
		return true;
	}
	
	
	public static boolean tuttiPariMaggioriDi(int[] a, int num){
		if(a==null)
			return false;
		for(int i = 0; i<a.length; i++)
			if(a[i] < num || a[i]%2 != 0)
				return false;
		//else
		return true;
	}
	
	
	
	
	public static boolean eqArrayRic(int[] a, int[] b){
		if(a==null || b==null || (a.length != b.length))
			return false;
		return eqArrayRicWrap(a, b, 0);
	}
	
	public static boolean eqArrayRicWrap(int[] a, int[] b, int i){
		if(i == a.length)
			return true;
		if(a[i] != b[i])
			return false;
		else
			return true && eqArrayRicWrap(a, b, i+1);
	}
	
	
	
	
	public static boolean tuttiPariMaggioriDiRic(int[] a, int num){
		if(a==null)
			return false;
		return tuttiPariMaggioriDiRicWrap(a, num, 0);
	}
	
	public static boolean tuttiPariMaggioriDiRicWrap(int[] a, int n, int i){
		if(i == a.length)
			return true;
		if(a[i] < n || (a[i]%2 != 0))
			return false;
		else
			return true && tuttiPariMaggioriDiRicWrap(a, n, i+1);
	}
	
	
	public static int indiceSubSeq(int[] a, int[] b){
		int k = 0;
		for(int i = 0; i < a.length; i++){
			if(k < b.length-1 && a[i] == b[k])
				k++;
			else if (k == b.length-1)
				return (i - k);
			else
				k = 0;
		}
		return -1;
	}
}