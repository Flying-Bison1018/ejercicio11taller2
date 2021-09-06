
package ejercicio11vectores;

import java.util.Scanner;


public class Ejercicio11vectores {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,num, invertido = 0, resto;
        System.out.println("Ingrese Valor Usuario: ");
        numero = sc.nextInt();
        num = numero;
        while(numero > 0){
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }
        System.out.println("Valor Usuario: "+num);
        System.out.println("valor Invertido de Usuario: "+invertido);
    }
    
}
