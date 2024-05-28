package calculadora;

public class TesteCalculadora {
	public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        
        double teste = cal.somar(5, 5);
        System.out.println(teste);
    }
}
