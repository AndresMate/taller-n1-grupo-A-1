package taller_n1_grupo_A;
public class Romanos {
  public static void main(String[] args) {
    System.out.println(romanoADecimal("IIII"));
  }
  public static int romanoADecimal(String romano) {
    int decimal = 0;
    int anterior = 0;
    for (int i = romano.length() - 1; i >= 0; i--) {
      int actual = romanos(romano.charAt(i));
      if (actual < anterior) {
        decimal -= actual;
      } else {
        decimal += actual;
      }
      anterior = actual;
    }
    return decimal;
  }
  public static int romanos(char romano) {
    switch (romano) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        return 0;
    }
  }
}