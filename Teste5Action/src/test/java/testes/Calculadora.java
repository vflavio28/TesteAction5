package testes;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculadora {

	public double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	public double subtrair(double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
	public double dividir(double num1, double num2) {
		return num1 / num2;
	}
}
