package taller_n1_grupo_A;

import java.util.Scanner;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.*;
import java.util.Arrays;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class primos {
    public static void main(String[] args) throws ParseException {
        Scanner leer=new Scanner(System.in);
        int x=leer.nextInt();
   
        switch(x){
         case 1:
         System.out.println(getnumeroelogatra("Digite numero"));
         break;
         case 2:
        getfactores("Digite un numero");
          break;
          case 3:
           getcadena("Digite una cadena de");
          break;
          case 4:
           getnumeromagico("digite numero");
          break;
          case 5:
           getnumeroRomano("Dijite numero en romano");
          break;
          case 6:
           getfecha("dijite la fecha en formato dd/MM/aaaa");
         break;
       }
   
   
   
   
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
       
       
       static int nfactores= 0;
       static boolean factores= false;
       public static void getfactores(String mensaje) {
           int number;
           boolean seguir;
           Scanner sc = new Scanner(System.in);
           do{
               
           try{
           seguir=false;
           System.out.printf(mensaje);
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
      
       private static int sqrt(int number) {
        return 0;
    }
    public static void ingfactor(int factorp) {
           
           if (factores) {
               
               System.out.printf(" X");
           } else {
               factores= true;
           }
           
           if (nfactores== 1) {
               System.out.printf("%d", factorp);
           } else {
              
               System.out.printf(" %d^%d", factorp, nfactores);
           }
           nfactores= 0;
   
   
       }
       public static void getcadena (String message){
         Scanner leer=new Scanner(System.in);
         System.out.println(message);
           String cadena = leer.nextLine();
           String cadenaSinEspacios = cadena.replaceAll("\\s+", " ");
           cadenaSinEspacios=cadenaSinEspacios.trim();
          System.out.println(cadenaSinEspacios); 
       }
       
   
   
       public static void getnumeromagico(String mensaje) {
         Scanner leer=new Scanner(System.in);
        int number=0;
        boolean x=false;
        while(x==false){
        System.out.println(mensaje);
        try{
        number = leer.nextInt();
        x=true;
        }catch(InputMismatchException e){
        System.out.println("por favor dijite solo numeros enteros");
        leer.nextLine();
         }}
    
        int number1;
        number1=number;
        int cont=0;
    
        int inverted = 0;
        while (number > 0) {
          inverted = inverted * 10 + number % 10;
          number /= 10;
          cont++;
        }
    
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
    
        int ascending = 0;
        for (int i = 0; i < cont; i++) {
          ascending = ascending * 10 + digits[i];
        }
    
        if (number1 == descending - ascending) {
          System.out.println(number1 + " Es un numero magico!");
        } else {
          System.out.println(number1 + " No es un numero magico.");
        }
      }
   
   
   
   
      int input=0;
      ////
        public static void getnumeroRomano(String mensaje) {
          // TODO Auto-generated method stub
          Scanner sc = new Scanner (System.in);
          String imput;
          
          //FOR DE PRUEBAS
          
            System.out.print("-- ");
            String in=sc.nextLine();
            imput=in;
            System.out.println(romanNumber(in.toUpperCase()));       
            System.out.println("FIN");
          
        }
      ////
        public static int romanValue(char cRoman) {
            switch (cRoman) {
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
          
        public static int romanNumber(String input) {
          int decimal = 0;
            int anterior = 0;
            boolean resta=false;
            boolean control=false;
            int [] aux4 = {0,0,0,0};
            int [] aux5 = {0,0,0};
            int aux=1;
            
            for(int i=input.length()-1; i>=0; i--) {  
                int actual = romanValue(input.charAt(i));
                
                //Control número no romano
                if(actual==0) {
                  control=true;
                }
                
                if(actual<anterior) {
                  
                  //Los símbolos de base 5 siempre suman, y no pueden estar a la izquierda de uno de mayor valor.
                  if(actual/5==1 || actual/5==10 || actual/5==100){
                    System.out.println(i);
                    System.out.println("CONTROL3");
                    control=true;
                  }
                  //I sólo puede restar a V y a X. - X sólo resta a L y a C - C sólo resta a D y a M.
                  if(anterior!=actual*5 && anterior!=actual*10 && (actual==1 || actual==10 || actual==100) ){
                    System.out.println("CONTROL 4 - RESUMIDO");
                    control=true;
                  }
                  //Control si el algoritmo realizo una suma antes de una resta
                  if(anterior!=decimal) {
                    control=true;
                  }
                  //Control si detecta un simbolo menor anteriormente de realizar una resta
                  if(resta) {
                    System.out.println("CONTROL1");
                    control=true;
                  }
                  resta=true;
                  //
                  decimal -= actual;   		
                }else{
                  
                  if(actual==anterior) {
                    //(I, X, C y M) pueden repetirse hasta 3 veces consecutivas como sumandos.    			
                    for(int j=0; j<aux4.length; j++) {
                      if(actual == 1*aux) {
                        aux4[j]+=1;
                      }else {
                        aux*=10;
                      }
                    }
                    aux=1;
                    
                    //Control si se detecta un simbolo igual al que anteriormente realizo una resta
                    if(resta) {
                      System.out.println("CONTROL2");
                      control=true;
                    }		
                  }
                  //Los números con base 5 (V, L y D), no pueden repetirse  			
                  for(int j=0; j<aux5.length; j++) {
                    if(actual== 5*aux ) {
                      aux5[j]+=1;
                    }else {
                      aux*=10;
                    }	
                  }
                  aux=1;
                  
                  //
                  decimal += actual;
                }
                //
                anterior=actual;    	
            }
            
            if(aux4[0]==3 || aux4[1]==3 || aux4[2]==3 || aux4[3]==3 || aux5[0]==2 || aux5[1]==2 || aux5[2]==2) {
              System.out.println("CONTROL 4-2");
              control=true;
            }
            if(control) {
              decimal=0;
            }
            //
        return decimal;
        }
   
        public static void getfecha(String message) throws ParseException {
         Scanner leer=new Scanner(System.in);
         String pattern = "dd/MM/yyyy";
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
         System.out.println(message);
         Date date = simpleDateFormat.parse(leer.nextLine());
         DateFormat formateadorFechaLarga = DateFormat.getDateInstance(DateFormat.LONG);
         System.out.println(formateadorFechaLarga.format(date));
    }
    
}
