package taller;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class numeros_primos2 {
  public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    System.out.println("Digite un numero");
    int numero = leer.nextInt();
    Map<Integer, Integer> factoresPrimos = obtenerFactoresPrimos(numero);
    String resultado = expresarFactoresPrimosEnPotencias(factoresPrimos);
    System.out.println(resultado); // debería imprimir "5^2 * 2^2"
  }

  public static Map<Integer, Integer> obtenerFactoresPrimos(int numero) {
    Map<Integer, Integer> factoresPrimos = new HashMap<>();
    int divisor = 2;
    while (numero > 1) {
      while (numero % divisor == 0) {
        if (!factoresPrimos.containsKey(divisor)) {
          factoresPrimos.put(divisor, 0);
        }
        int potencia = factoresPrimos.get(divisor);
        factoresPrimos.put(divisor, potencia + 1);
        numero /= divisor;
      }
      divisor++;
    }
    return factoresPrimos;
  }

  public static String expresarFactoresPrimosEnPotencias(Map<Integer, Integer> factoresPrimos) {
    StringBuilder resultado = new StringBuilder();
    for (Map.Entry<Integer, Integer> entrada : factoresPrimos.entrySet()) {
      int factor = entrada.getKey();
      int potencia = entrada.getValue();
      resultado.append(factor + "^" + potencia + " * ");
    }
    // Quitar el último " * " del resultado
    resultado.setLength(resultado.length() - 3);
    return resultado.toString();
  }
}
