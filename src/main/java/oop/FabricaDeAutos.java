package oop;

public class FabricaDeAutos {

	public static void main(String[] args) {
		// quiero crear mi primer objeto de la clase autos
		
		Auto fiatUno = new Auto(300f, "AUTO", new Motor("MOTOR", 300f));

		fiatUno.encender();
		fiatUno.verVelocidad();

		fiatUno.acelerar();//1
		fiatUno.verVelocidad();
		
		fiatUno.acelerar();//2
		fiatUno.verVelocidad();
		
		fiatUno.acelerar();//3
		fiatUno.verVelocidad();
		
		System.out.println("Frenando");
		fiatUno.frenar();//2 
		fiatUno.verVelocidad();

		
		
		//quiero ver la velocidad del auto
		//nombreDelObjeto.atributo
		System.out.println("Velocidad actual = " + fiatUno.velocidad);
		
		fiatUno.apagar();//1 luego 0 y apaga el auto
		fiatUno.apagar();//error no se puede apagar 2 veces 
		System.out.println("Velocidad actual = " + fiatUno.velocidad);

		System.out.println("FIN");
	}

}
