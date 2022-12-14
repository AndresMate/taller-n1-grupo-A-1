package taller;

import java.util.Arrays;

public class numeromagico {
  public static void main(String[] args) {
    // Define the number to check
    int number = 495;
    int number1;
    number1=number;
    int cont=0;

    // Invert the number
    int inverted = 0;
    while (number > 0) {
      inverted = inverted * 10 + number % 10;
      number /= 10;
      cont++;
    }

    // Sort the digits of the number in descending order
    int[] digits = new int[cont];
    for (int i = 0; i < cont ; i++) {
      digits[i] = inverted % 10;
      inverted /= 10;
    }
    Arrays.sort(digits);
    int descending = 0;
    for (int i = cont-1; i >= 0; i--) {
      descending = descending * 10 + digits[i];
    }

    // Sort the digits of the number in ascending order
    int ascending = 0;
    for (int i = 0; i < cont; i++) {
      ascending = ascending * 10 + digits[i];
    }

    // Check if the number is magical
    if (number1 == descending - ascending) {
      System.out.println(number1 + " Es un numero magico!");
    } else {
      System.out.println(number1 + " No es un numero magico.");
    }
  }
}
