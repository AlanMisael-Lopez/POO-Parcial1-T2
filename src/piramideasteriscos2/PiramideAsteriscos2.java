package piramideasteriscos2;

import java.util.Scanner;

public class PiramideAsteriscos2 {
    
            private int filas;
        Scanner sc = new Scanner(System.in);
        
    public PiramideAsteriscos2(){
        System.out.println("Hacer un programa que pinte una piramide de asteriscos\n");
    }
        public void datoFila(){
            System.out.print("Ingrese el numero de filas: ");
            filas = sc.nextInt();
        }
        public void proceso(){
        for(int i =0; i<= filas; i++){
        for(int j = 0; j < filas-i; j++){
            System.out.print(" ");
        }
        for(int k = 0; k <(i*2)-1; k++){
            System.out.print("*");
        }
            System.out.print("\n");
        }
        }
    public static void main(String[] args) {
  
        PiramideAsteriscos2 exe = new PiramideAsteriscos2();
        
        exe.datoFila();
        exe.proceso();
    }
    
}
