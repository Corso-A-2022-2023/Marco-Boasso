public class TestEqArray{
	public static void main(String[] args){
		
		int[] a1 = {0, 2, 3, 5, -4, 9, 10},
			a2 = {6, 4, 4, 8, 12, 4, 22},
			a3 = {10, 7, 5, 99, 31, 20},
			a4 = {5, 7, 8, 9, 12},
			a5 = MetodiSuArray.clonaArray(a2),
			a6 = null;

		System.out.println(MetodiSuArray.eqArrayRic(a1, a2)); //exp false
		System.out.println(MetodiSuArray.eqArrayRic(a4, a2)); //exp false
		System.out.println(MetodiSuArray.eqArrayRic(a3, a3)); //exp true
		System.out.println(MetodiSuArray.eqArrayRic(a5, a2)); //exp true
		System.out.println(MetodiSuArray.eqArrayRic(a2, a6)); //exp false
		System.out.println(MetodiSuArray.eqArrayRic(a6, a6)); //exp false
		System.out.println("");
		System.out.println(MetodiSuArray.tuttiPariMaggioriDiRic(a1, 0)); //exp false
		System.out.println(MetodiSuArray.tuttiPariMaggioriDiRic(a2, 2)); //exp true
		System.out.println(MetodiSuArray.tuttiPariMaggioriDiRic(a2, 8)); //exp false
		System.out.println(MetodiSuArray.tuttiPariMaggioriDiRic(a4, -5)); //exp false
		System.out.println(MetodiSuArray.tuttiPariMaggioriDiRic(a6, 3)); //exp false
		
	}
}