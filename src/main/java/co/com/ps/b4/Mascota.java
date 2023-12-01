package co.com.ps.b4;

public class Mascota {
    String Nombre;
    Integer Edad;
    String Raza;
    String Color;
    Double Peso;
    Boolean VacunasAlDia;

    public Mascota(String nombre, Integer edad,
                   String raza, String color, Double peso,
                   Boolean vacunasAlDia) {

        this.Nombre = nombre;
        this.Edad = edad;
        this.Raza = raza;
        this.Color = color;
        this.Peso = peso;
        this.VacunasAlDia = vacunasAlDia;
    }

    public Mascota() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }

    public Boolean getVacunasAlDia() {
        return VacunasAlDia;
    }

    public void setVacunasAlDia(Boolean vacunasAlDia) {
        VacunasAlDia = vacunasAlDia;
    }
}
