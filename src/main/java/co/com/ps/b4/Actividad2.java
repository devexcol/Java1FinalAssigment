package co.com.ps.b4;

public class Actividad2 {
    public static void main(String[] args) {

        Mascota mascota1 = new Mascota();
        Mascota mascota2 = new Mascota();

        mascota1.setNombre("Gaia");
        mascota1.setEdad(3);
        mascota1.setRaza("Pitbull");
        mascota1.setColor("Gris Blanco");
        mascota1.setPeso(23.0);
        mascota1.setVacunasAlDia(true);

        mascota1.setNombre("sisa");
        mascota1.setEdad(3);
        mascota1.setRaza("Labrador");
        mascota1.setColor("Chocolate");
        mascota1.setPeso(30.0);
        mascota1.setVacunasAlDia(true);

        System.out.println(mascota1.getNombre());
        System.out.println(mascota1.getEdad());
        System.out.println(mascota1.getRaza());
        System.out.println(mascota1.getColor());
        System.out.println(mascota1.getPeso());
        System.out.println(mascota1.getVacunasAlDia());

    }
}
