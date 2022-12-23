import java.util.Scanner;

public class tallerr{
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       

        int number;

        int divisor = 2;
        

       

        System.out.print("Introduce el número ");

        number = sc.nextInt();
        int contador=0;
        while(number != 1) {

            if(number % divisor == 0){ 

                System.out.print(divisor+ " ");

                number = number / divisor;
               
                contador=contador+number;

            }else {

                divisor++;
                

            }
           
        }
        System.out.println(+contador);

    }
}