package codo.a.codo;

public class Arrays {

	public static void main(String[] args) {
		
		int[] array = new int [4];
		
		//array de strings
		
		//String[] nombres = new String[]{"nombre1","nombre2"}; los parantesis para agregar los nombres de una vez
		
		array[0]=10;
		array[1]=11;
		array[2]=12;
		array[3]=13;//error 
		
		System.out.println("FIN");
		
		//recorrer el array de enteros??
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		//quiero mostrar el indice 3
		System.err.println("Mostrando valor del indice 3 " + array[3]);
		
		//recorrer el array usando foreach
		
		for(int aux : array) {
			System.out.println(aux);
		}
		
	}

}
