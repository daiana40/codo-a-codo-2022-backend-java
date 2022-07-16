package oop;

public class Auto {

	// atributos de la clase
	private String color;
	private int anio;
	private long serie;
	private String marca;
	private String modelo;
	public float velocidad;
	private float velocidadMaxima;
	private boolean encendido;

	private Motor motor;

	public Auto(float velocidadMaxima, String marca, Motor motor2) {
		this.setVelocidad(0);
		this.setAnio(2022);
		this.setEncendido(false);
		this.setVelocidadMaxima(velocidadMaxima);
		this.setMarca(marca);
		this.setMotor(motor2);

	}

	public void setMotor(Motor motor2) {
		if (motor2 == null) {
			Motor motorInterno = new Motor("default", 100f);
			this.motor = motorInterno;
		} else {
			this.motor = motor2;
		}

	}

	public Motor getMotor() {
		return this.motor;
	}

	// metodos

	public void encender() {
		if (!this.isEncendido()) {
			this.setEncendido(true);
			System.out.println("Se ha Encendido el Auto");
		} else {
			System.out.println("No se puede Encender el Auto 2 Veces");
		}
	}

	public void setEstereo(Estereo nuevoEstereo) {
		if (nuevoEstereo != null) {
		}
	}

	public void apagar() {
		if (this.isEncendido()) {
			while (this.getVelocidad() > 0) {
				frenar();
			}

			this.setEncendido(false);
			// encendido=false;
			System.out.println("Se ha apagado el Auto correctamente");
		} else {
			System.out.println("No se puede apagar 2 veces.");
		}
	}

	public void acelerar() {
		// if(encendido==true)
		if (this.isEncendido()) {
			if (this.getVelocidad() < this.getVelocidadMaxima()) {
				this.setVelocidad(this.getVelocidad() + 1);
			} else {
				System.out.println("Error: no se puede superar la velocidad maxima.");
			}
		} else {
			System.out.println("Error: Debe encender el auto.");
		}
	}

	public void frenar() {
		if (this.isEncendido()) {
			if (this.getVelocidad() > 0) {
				this.setVelocidad(this.getVelocidad() - 1);
				System.out.println("Se ha reducido la velocidad del auto.");
			}
		} else {
			System.out.println("Error: Auto apagado.");
		}
	}

	public void verVelocidad() {
		System.out.println(velocidad);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	private void setAnio(int anio) {
		this.anio = anio;
	}

	public long getSerie() {
		return serie;
	}

	private void setSerie(long serie) {
		this.serie = serie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelocidad() {
		return velocidad;
	}

	private void setVelocidad(float velocidad) {
		if (velocidad < 0) {
			this.velocidad = 0;
		} else {
			this.velocidad = velocidad;
		}
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	private void setVelocidadMaxima(float velocidadMaxima) {
		if (velocidadMaxima < 0 || velocidadMaxima > 220) {
			if (velocidadMaxima < 0)
				this.velocidadMaxima = 0;
			if (velocidadMaxima > 220)
				this.velocidadMaxima = 220;
		} else {
			this.velocidadMaxima = velocidadMaxima;
		}
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public String getMarca() {
		// esto es la logica oculta a mundo exterior
		// tipo primitivos
		// byte < short < int < long < float < double
		// WRAPPERS: tiene metodos porque son clases
		// por defecto como son clases
		// sus objetos valen null
		// Byte < Short < Integer < Long < Float < Double
		// boolean
		// char
		// String edad ="10";
		// wrapper
		// int edadInt = Integer.parseInt(edad);

		// return marca == null ? "" : marca; hacer todo lo que estaba en una linea
		String aux = "";
		if (marca == null)
			aux = "S/M";
		return aux;// va a dar nulo
	}

	public void setMarca(String marca) {
		if (marca != null) {
			this.marca = marca;
		} else {
			this.marca = ""; // a futuro evita errires
		}
	}

	// alt+shift9s para generar getters and setters
}