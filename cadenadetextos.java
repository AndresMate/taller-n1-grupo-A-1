package taller_n1_grupo_A;

import java.util.Scanner;
import javax.security.sasl.SaslException;

public class cadenadetextos {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String cadena = leer.nextLine();
        String cadenaSinEspacios = cadena.replaceAll("\\s+", " ");
        cadenaSinEspacios=cadenaSinEspacios.trim();
        System.out.println(cadenaSinEspacios);
    }
}

