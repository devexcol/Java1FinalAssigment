package co.com.ps.b5;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Validar si un número es positivo o negativo

        System.out.println("Digite el número");
        int num = scanner.nextInt();

        if ( num <0){
            System.out.println("El número " +num + " es negativo");
        }
        if ( num > 0){
            System.out.println("El número " + num + " es positivo");
        }
        // Imprimir los 10 primero números pares
        for (int i = 1; i <= 10 ; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }



        //Calcular los numéros primos por un rango solicitado es decir
        //Se solicita el rango inferior y superior


        System.out.println("Digitar ambos rangos");
        int rango1 = scanner.nextInt();
        int rango2 = scanner.nextInt();

        for (int i = rango1; i < rango2 ; i++) {
            System.out.println(i%i);
            if (i % i ==0 && i % 1 ==0){
                System.out.println("Número primo " + i);
            }
        }
        //Calcular los numéros primos por un rango solicitado es decir
        //Se solicita el rango inferior y superior
        System.out.println("Digitar ambos rangos");
        int rango1Primo = scanner.nextInt();
        int rango2Primo = scanner.nextInt();

        for (int i = rango1Primo; i < rango2Primo ; i++) {
            System.out.println(i%i);
            if (i % i ==0 && i % 1 ==0){
                System.out.println("Número primo " + i);
            }
        }

/*
        int edad = 10;
        String nombre="";
        String apellido="guzman";
        if (nombre == null || apellido == null) {
            System.out.println("El nombre esta vacio");
        }

        if(edad==0){

        }

        if (nombre.equals("") && apellido.equals("")) {
            System.out.println("El nombre esta vacio y el apellido estan vacios");
        }else{
            System.out.println("Nombre ingresado correctamente");
        }

        for (int i = 1; i <6; i++) {
            System.out.println("Numero " + i);
        }
 */
    }


}
