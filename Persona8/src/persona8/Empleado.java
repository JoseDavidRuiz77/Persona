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
public abstract class Empleado extends Persona8 {
    //Variables:
    private double ingresoPerNomina;
    
    //Constructor:
    public Empleado(){
        super();
        ingresoPerNomina=0;
    }
    public Empleado(String nombre,String fechaNac,char genero,boolean casado,int edad,double ingresoPerNomina){
        super(nombre,fechaNac,genero,casado,edad);
        this.ingresoPerNomina=ingresoPerNomina;
        
    }
    
    //Getters & Setters
    public double getIngresoPerNomina() {
        return ingresoPerNomina;
    }
    public void setIngresoPerNomina(double ingresoPerNomina) {
        this.ingresoPerNomina = ingresoPerNomina;
    }

    //Metodos:
    @Override
    public abstract String toString();
    
}//FINCLASEEMPLEADO
