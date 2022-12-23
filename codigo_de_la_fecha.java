package taller_n1_grupo_A;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

public class codigo_de_la_fecha {
    public static void main(String[] args) throws ParseException {
        Scanner leer=new Scanner(System.in);
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println("dijite la fecha en formato dd/MM/aaaa");
        Date date = simpleDateFormat.parse(leer.nextLine());
        DateFormat formateadorFechaLarga = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(formateadorFechaLarga.format(date));
}}
