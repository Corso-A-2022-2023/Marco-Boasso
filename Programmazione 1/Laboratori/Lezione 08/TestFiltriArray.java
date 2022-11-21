public class TestFiltriArray{
	public static void main(String[] args){
		int[] array;
		array = MetodiSuArray.initArrayInt();
		MetodiSuArray.stampaArrayInt(array);
		int[] minore = MetodiSuArray.filtroMinoriDi(array, 5);
		int[] smol = MetodiSuArray.filtroIntervalloDisp(array, 2, 7);
		boolean[] frate = MetodiSuArray.trasduttore(array, 4);
		MetodiSuArray.stampaArrayInt(minore);
		MetodiSuArray.stampaArrayInt(smol);
		MetodiSuArray.stampaArrayBoolean(frate);
	}
}