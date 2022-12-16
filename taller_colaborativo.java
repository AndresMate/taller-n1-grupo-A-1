package taller_n1_grupo_A;
import java.util.Scanner;
import java.math.*;
public class taller_colaborativo {
    public static void main(String[] args) {
     System.out.println(getnumeroelogatra("dijite numero"));
    }
    private static String getnumeroelogatra(String mensaje) {
    Scanner leer=new Scanner(System.in);
    var cont=0;
    double num=0;
    double p=0;
    double r=0;
    double ra=0;
    double x=0;
    String eloghrata;
    System.out.println(mensaje);
    num=leer.nextDouble();
    x=num;
    p=num;
    while(Math.floor(x)!=0){
      x=x/10;
      cont++;
    }
    while(Math.floor(num)!=0){
      r=Math.floor(num)%10;
      ra=ra+(Math.pow(Math.floor(r), cont));
      num=num/10;
    }
    if(p==ra){
      eloghrata="es un numero Ególatras";
    }
    else{
      eloghrata="no es un numero Ególatras";
    }

    return  eloghrata;  
    }      
    }

