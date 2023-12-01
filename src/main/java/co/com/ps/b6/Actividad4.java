package co.com.ps.b6;

import java.util.Scanner;

//Adivina el número
//Debe preguntarle al usuario  núemeros del 1 la 100 con x intentos
public class Actividad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100 + 1);
        int numeroDeIntentos = 0;
        System.out.println(numeroAleatorio);

        int numeroAdivinado;
        do {
            System.out.println("Digite el número que usted cree que es");
            numeroAdivinado = scanner.nextInt();
            if (numeroAdivinado < numeroAleatorio){
                System.out.println("El número que digitaste esta por debajo");
            } else if (numeroAdivinado > numeroAleatorio) {
                System.out.println("El número que digitaste esta por encima.");
            } else if (numeroAdivinado == numeroAleatorio) {
                System.out.println("Adivinaste el número!");
                break;
            }
            numeroDeIntentos++;
            System.out.println(numeroDeIntentos);
        } while (numeroDeIntentos < 10);

    }
}
