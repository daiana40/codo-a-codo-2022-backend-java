package codo.a.codo;

public class Operadores {

	public static void main(String[] args) {

		//artiemticos 
		//* + - / * ++ -- *= -= +=
		 
		//relacionales 
		//mayor, menor, != mayor igual menor igual
		
				
		//logicos necesitan dos valores
		//and or not
		//&& || !
		
		String usuario = "root";
		String contrasenia = "root"; 
		
		if("root".equals(usuario) && "root".equals(contrasenia)) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
		}
	}

}
