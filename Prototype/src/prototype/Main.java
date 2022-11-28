package prototype;

import entidades.ArbolCedro;

public class Main {

	public static void main(String[] args) {
		ArbolCedro cedro = new ArbolCedro(2.0, 20);

		System.out.println(cedro.toString());

		ArbolCedro cedroBlanco = (ArbolCedro) cedro.copy();
		
		System.out.println(cedroBlanco.toString());
		

	}

}
