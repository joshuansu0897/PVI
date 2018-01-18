/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvi;

/**
 *
 * @author joshuansu
 */
public class Persona {

    private char sexo; // F femenino | M masculino
    private String nombre;
    private double alutra;
    private int edad;
    private boolean lentes;

    public Persona() {
        System.out.println("Persona creada");
    }

    public Persona(char sexo, String nombre, double alutra, int edad, boolean lentes) {
        this.sexo = sexo;
        this.nombre = nombre;
        this.alutra = alutra;
        this.edad = edad;
        this.lentes = lentes;
    }

    public boolean isLentes() {
        return lentes;
    }

    public void setLentes(boolean lentes) {
        this.lentes = lentes;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAlutra() {
        return alutra;
    }

    public void setAlutra(double alutra) {
        this.alutra = alutra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
