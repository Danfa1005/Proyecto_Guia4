package Programa_Ahorro;

//Importaciones
import com.j256.ormlite.field.*;
import com.j256.ormlite.table.*;

@DatabaseTable //Base de datos
public class Ahorro {
    
    //Atributos y agregación de estos a la tabla de la base de datos
    @DatabaseField(id=true) //Atributo diferenciador en la tabla
    private int numero_Ahorro;
    
    @DatabaseField
    private String moneda_Cambio;
    
    @DatabaseField
    private double dia_1;
    
    @DatabaseField
    private double dia_2;
    
    @DatabaseField
    private double dia_3;
    
    @DatabaseField
    private double dia_4;
    
    @DatabaseField
    private double dia_5;
    
    @DatabaseField
    private double dia_6;
    
    @DatabaseField
    private double dia_7;
    
    @DatabaseField
    private double tasa_Efeanu;
    
    @DatabaseField
    private double tiempo_Ahorro;
    
    @DatabaseField
    private double meta_Ahorro;
    
    //Constructores
    public Ahorro() {
    }
    
    public Ahorro(int numero_Ahorro, String moneda_Cambio, double dia_1, double dia_2, double dia_3, double dia_4, double dia_5, double dia_6, double dia_7, double tasa_Efeanu, double tiempo_Ahorro, double meta_Ahorro) {
        this.numero_Ahorro = numero_Ahorro;
        this.moneda_Cambio = moneda_Cambio;
        this.dia_1 = dia_1;
        this.dia_2 = dia_2;
        this.dia_3 = dia_3;
        this.dia_4 = dia_4;
        this.dia_5 = dia_5;
        this.dia_6 = dia_6;
        this.dia_7 = dia_7;
        this.tasa_Efeanu = tasa_Efeanu;
        this.tiempo_Ahorro = tiempo_Ahorro;
        this.meta_Ahorro = meta_Ahorro;
    }
    
    // Operaciones Getters y Setters
    public int getNumero_Ahorro() {
        return numero_Ahorro;
    }

    public void setNumero_Ahorro(int numero_Ahorro) {
        this.numero_Ahorro = numero_Ahorro;
    }    
    
    public String getMoneda_Cambio() {
        return moneda_Cambio;
    }

    public void setMoneda_Cambio(String moneda_Cambio) {
        this.moneda_Cambio = moneda_Cambio;
    }

    public double getDia_1() {
        return dia_1;
    }

    public void setDia_1(double dia_1) {
        this.dia_1 = dia_1;
    }

    public double getDia_2() {
        return dia_2;
    }

    public void setDia_2(double dia_2) {
        this.dia_2 = dia_2;
    }

    public double getDia_3() {
        return dia_3;
    }

    public void setDia_3(double dia_3) {
        this.dia_3 = dia_3;
    }

    public double getDia_4() {
        return dia_4;
    }

    public void setDia_4(double dia_4) {
        this.dia_4 = dia_4;
    }

    public double getDia_5() {
        return dia_5;
    }

    public void setDia_5(double dia_5) {
        this.dia_5 = dia_5;
    }

    public double getDia_6() {
        return dia_6;
    }

    public void setDia_6(double dia_6) {
        this.dia_6 = dia_6;
    }

    public double getDia_7() {
        return dia_7;
    }

    public void setDia_7(double dia_7) {
        this.dia_7 = dia_7;
    }

    public double getTasa_Efeanu() {
        return tasa_Efeanu;
    }

    public void setTasa_Efeanu(double tasa_Efeanu) {
        this.tasa_Efeanu = tasa_Efeanu;
    }

    public double getTiempo_Ahorro() {
        return tiempo_Ahorro;
    }

    public void setTiempo_Ahorro(double tiempo_Ahorro) {
        this.tiempo_Ahorro = tiempo_Ahorro;
    }

    public double getMeta_Ahorro() {
        return meta_Ahorro;
    }

    public void setMeta_Ahorro(double meta_Ahorro) {
        this.meta_Ahorro = meta_Ahorro;
    }    
    
} //Fin de clase Ahorro
