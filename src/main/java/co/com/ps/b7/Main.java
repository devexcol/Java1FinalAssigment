package co.com.ps.b7;

public class Main {
    public static void main(String[] args) {

        try {
            //Código que podría lanzar una excepción
            double resultado = dividir(10,0);
        }catch (ArithmeticException e){
            //Código para manejar la excepción
            System.out.println("Error aritmetico" + e.getMessage());
        } finally {
            //código que se ejectuará siempre, ya sea que ocurra una expción o no
            System.out.println("Bloque finally ejecutado");
        }

    }
    public  static double dividir (int numerador, int denominador){
        return numerador/denominador;


    }
}
