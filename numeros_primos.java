package taller_n1_grupo_A;

public class numeros_primos {
    public static void main(String[] args) {
            
    int numero=300, divi=2;
    int[] factores=new int[200];
    int i=0;

    while(numero/divi>=1){
        if(numero%divi==0){
            numero/=divi;
            factores[i]=divi;
            i++;
        }
        else{
            divi++;
        }
    }
    
    for(int x=0;x<i;x++){

        System.out.println(factores[x]);
    }
}}
