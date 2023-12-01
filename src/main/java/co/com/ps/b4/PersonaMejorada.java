package co.com.ps.b4;

import java.util.Date;

public class PersonaMejorada {
    String nombre;
    short edad;
    String apellido;
    float altura;
    Date fechaNacimiento;

    String tipoDeSangre;
    float peso;

    public PersonaMejorada(String nombre, String tipoDeSangre) {
        this.nombre = nombre;
        this.tipoDeSangre = tipoDeSangre;
    }

    public void correr() {
    }
    public void saltar(){
    }
    public void bailar(){
    }
    public  void nadar(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
