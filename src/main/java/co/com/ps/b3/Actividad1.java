package co.com.ps.b3;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;


public class Actividad1 {

    //Se deben ingresar datos a los Tipos de datos vistos
    //Tipos de datos primitivos

    int val1 = 11; //enteros
    long val2 = 400000000; //enteros
    float val3 = 300000000; //decimales
    double val4 = 100.100; //decimales
    char val5 = 'J';
    byte val6 = 127;
    short val7= -10;
    boolean val8 = false;

    //Wrapper
    Integer w1 =1000000000;
    Long w2 = 200L;
    Float w3 = 20000f;
    Double w4 = 1.0D;
    Character w5 = 'A';
    Byte w7 = 127;
    String w9 = "Hola Mundo";

    //Objetos Utilities
    //Como crear o una fecha

    Date fecha;
    Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
    fecha = cal.getTime();
    Calendar calendar = getInstance();
    BigDecimal moneda = new BigDecimal(10);


}
