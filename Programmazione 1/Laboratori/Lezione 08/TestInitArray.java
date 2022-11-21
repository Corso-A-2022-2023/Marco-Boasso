public class TestInitArray{
	public static void main(String[] args){
		int[] array;
		array = MetodiSuArray.initArrayInt();
		MetodiSuArray.stampaArrayInt(array);
		int[] copia = MetodiSuArray.clonaArray(array);
		MetodiSuArray.stampaArrayInt(copia);
	}
}