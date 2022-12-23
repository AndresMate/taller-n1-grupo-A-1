
    
import static java.lang.Math.sqrt;

import java.util.InputMismatchException;
import java.util.Scanner;
 
public class  factores{
 
    static int nfactores= 0;
    static boolean factores= false;
    public static void main(String[] args) {
        int number;
        boolean seguir;
        do{
            
        try{
        seguir=false;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite un numero ");
        number = sc.nextInt();
         desmontar_factor(number);

        }catch(InputMismatchException e){
            System.out.println("Invalido, debe ingresar un numero");
            seguir=true;
        }
    }while(seguir);
    }
 
    public static void desmontar_factor(int number) {
        int producto= 1;
        int number1 = number;
        int factorp= 2;
        do {
            int subfactor = number1 % factorp;
            if (subfactor == 0) {
                number1 /= factorp;
                producto*= factorp;
                nfactores++;
            } else {
                if (nfactores> 0) {
                    ingfactor(factorp);
                }
                factorp = primo(factorp);
            }
        } while (producto != number);
       ingfactor(factorp);
    }
 
    public static int primo(int number) {
        do {
            number++;
        } while (!si_primo(number));
        return number;
    }
 
    public static boolean si_primo(int number) {
        if (number <= 0) {
            return false;
        }
        int cant_divisores = 0;
        boolean divisores = false;
        int rango = (int) sqrt(number);
        int i = 2;
        while (i <= rango && !divisores) {
            if (number % i == 0) {
                cant_divisores++;
                divisores = true;
            }
            i++;
        }
        if (cant_divisores > 0 || number == 1) {
            return false;
        }
        return true;
        
    }
   
    public static void ingfactor(int factorp) {
        
        if (factores) {
            
            System.out.printf(" X ");
        } else {
            factores= true;
        }
        
        if (nfactores== 1) {
            System.out.printf("%d"+" Es un numero primo, no se puede descomponer", factorp);
        } else {
           
            System.out.printf(" %d^%d", factorp, nfactores);
        }
        nfactores= 0;


    }


       
}
