package complex.basicoGrafica;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Complejidad c = new Complejidad();
	    int ejecuciones = 20;
        int resultados[][] = new int[ejecuciones][2];
        for (int renglon=0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 1;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.lineal(n);
        }
        //valores(resultados);
        System.out.println ("IMPRESION ORIGINAL");
        imprimir(resultados);
        System.out.println("IMPRESION MODIFICADA");
        imprimi(resultados);


        for (int renglon=0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 1;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.cuadratica(n);
        }
        //valores(resultados);
        //imprimir(resultados);


        for (int renglon=0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 100;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.log(n);
        }
        //valores(resultados);
        //imprimir(resultados);
    }

    private static void nada(){
        // hacer algo
    }


    private static void imprimir(int [][] resultado){
        for (int renglon = 0; renglon < resultado.length ; renglon++){
            for(int veces = 0; veces < resultado[renglon][1]; veces++){
                System.out.print("[]");
            }
            System.out.println();
        }

    }
/*-------------------------Aquí comienza lo mío-------------------------------*/
    
    private static void imprimi(int [][] resultado){
        /*Declaración de variables*/
        int index=0,fila1=0,fila2=0, renglon, veces,index2=0;
        String fil1="",fil2="",output="";
        
        /*Obtener el renglón que más objetos imprime*/
        
        
        for (renglon = 0; renglon < resultado.length ; renglon++){
            
                for(veces = 0; veces < resultado[renglon][1]; veces++){
                    fil1=fil1+"*";
                }
        
            if (fila1>=fila2){
                fil2=fil1;
                index=renglon;
            }
            
            fila1=fil1.length();
            fila2=fil2.length();
            fil1="";
        }
        
        /*Declaración de arreglo*/
        
        int [][] IdLenght = new int[resultado.length][resultado[index][1]];
        
        /*Asiga el valor de un parámetro a la longitud de carácteres de esa cadena*/
        
        for (renglon = 0; renglon < resultado.length ; renglon++){
            
            for(veces = 0; veces < resultado[renglon][1]; veces++){
                fil2=fil2+"*";
                IdLenght[renglon][veces]=1;
            }
              
            index2=renglon;
            fila2=fil2.length();
            fil2="";
        }
        
        /*Llena los vacíos con espacios e imprimir*/
        /*
        for (int a=0; a<resultado.length;++a){
            for(int b=0;b<=index;++b){
                if(IdLenght[a][b]==1){
                    System.out.print("["+a+","+b+"]");
                }else{
                    System.out.print("{"+a+","+b+"}");
                }
            }
            System.out.println();
        }
        System.out.println("INDEX: "+index+"\nLenght: "+resultado.length);
        */
        int c=index;
        int d=0;
        
        for(c=index;c>=0;c--){
            for (d=0;d<resultado.length;d++){
                if(IdLenght[d][c]==1){
                    System.out.print("[]");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
/*----------------------------Hasta aquí acaba lo mio-------------------------*/
    private static void valores(int [][] datos){
        //Utilizando for each
        for (int[] r:datos) {
             System.out.println(r[0] + "," + r[1]);
        }

        // utilizando stream
        Arrays.stream(datos)
                .forEach((x) ->
                        System.out.println(x[0] + "," + x[1])
                );

    }

}
/*
        int max=0, index=0,fila1=0,fila2=0;
        String fil1="",fil2="";
        
        for (int renglon = 0; renglon < resultado.length ; renglon++){
            
                for(int veces = 0; veces < resultado[renglon][1]; veces++){
                    fil1=fil1+"*";
                }
        
            if (fila1>=fila2){
                //System.out.println("ENTROOO");
                fil2=fil1;
                index=renglon;
            }
            
            fila1=fil1.length();
            fila2=fil2.length();
            System.out.println("\nfila 1: "+fil1+"Long: "+fila1+ "Index: "+index2);
            System.out.println("\nfila 2: "+fil2+"Long: "+fila2+ "Index: "+index2);
            fil1="";
        }
        */