package curso;

public class CurrencyConvertet {
	
	public static double real = 1;
	public static double tax = 6 ;
	
	
	public static double conversaoReal(double dolar) {
		return real * dolar;
	}
	
	public static double taxaDolar(double dolar) {
		return (dolar += dolar) * tax;
	}
}
