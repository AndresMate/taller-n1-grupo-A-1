package taller_n1_grupo_A;

public class cadenadetextos {
    public static void main(String[] args) {
        String cadena = "  Hola   mundo  ";
        String cadenaSinEspacios = cadena.replaceAll("\\s+", " ");
        cadenaSinEspacios=cadenaSinEspacios.trim();
        System.out.println(cadenaSinEspacios);
    }
}

