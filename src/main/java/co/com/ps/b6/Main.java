package co.com.ps.b6;

public class Main {
    public static void main(String[] args) {
        int dayOfWeek = 1;

        switch(dayOfWeek){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Lunes");
                break;
            case 4:
                System.out.println("Lunes");
                break;
            case 5:
                System.out.println("Lunes");
                break;
            case 6:
                System.out.println("Lunes");
                break;
            case 7:
                System.out.println("Lunes");
                break;
            default:
                System.out.println("Escribir un número valido");
                break;
        }

        // Averiguar sobre switch expression.

        //-----------------------------------------------------------------------------------------------

        //Ciclo While
        int contador = 0;
       // while (contador < 5){

        //}

        //Ciclo DoWhile
        do {
            System.out.println("Contador "+contador);
            contador++;
        }while (contador <=5);

    }
}
