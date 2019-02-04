/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona8;

/**
 *
 * @author RedRiot
 */
public abstract class Persona8 {
    //Variables:
    private String nombre,fechaNac;
    private char genero;
    private boolean casado;
    private int edad;
    
    //Constructores:
    public Persona8(){
        nombre="";
        fechaNac="";
        genero='0';
        casado=false;
        edad=0;
    }
    public Persona8(String nombre,String fechaNac,char genero,boolean casado,int edad){
        this.nombre=nombre;
        this.fechaNac=fechaNac;
        this.genero=genero;
        this.casado=casado;
        this.edad=edad;
    }
    
    //Getters & Setters
    public String getNombre() {
        return nombre;
    }
    public String getFechaNac() {
        return fechaNac;
    }
    public char getGenero() {
        return genero;
    }
    public boolean getCasado() {
        return casado;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void setCasado(boolean casado) {
        this.casado = casado;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }          
    
    
    @Override
    public abstract String toString();
    
}//FINCLASEPERSONA
