package oop2;

import oop.Auto;
import oop.Estereo;
import oop.Motor;

public class Main {

	public static void main(String[] args) {
		
	
		Motor motorDesdeAfuera = new Motor("MCLAREN", 150F);
		Auto auto = new Auto(220f, "RENAULT",motorDesdeAfuera);
		
		
		Estereo e = new Estereo();
		auto.setEstereo(e);
		
		
	}

}
