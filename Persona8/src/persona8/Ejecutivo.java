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
public class Ejecutivo extends Empleado {
    //Variables:
    private int nominasRealizadas;
    
    //Constructores:
    public Ejecutivo(){
        super();
        nominasRealizadas=0;
    }
    public Ejecutivo(String nombre,String fechaNac,char genero,boolean casado,int edad,double ingresoPerNomina,int nominasRealizadas){
        super(nombre,fechaNac,genero,casado,edad,ingresoPerNomina);
        this.nominasRealizadas=nominasRealizadas;
    }
    
    //Getters & Setters
    public int getNominasRealizadas() {    
        return nominasRealizadas;
    }
    public void setNominasRealizadas(int nominasRealizadas) {
        this.nominasRealizadas = nominasRealizadas;
    }

    //Metodos:
    @Override
    public String toString() {
        String mensaje1= getNombre()+" nació el "+getFechaNac()+"\n";
        String mensaje2="";
            switch(getGenero()){
                case 'M':
                    mensaje2="Su género es masculino. \n";
                    break;
                case 'F':
                    mensaje2="Su género es femenino. \n";
            }
        String mensaje3;
        if(getCasado()==true){
            mensaje3="Está Casado/a \n";
        }
        else{
            mensaje3="No está casado/a \n";
        }
        String mensaje4="Tiene "+getEdad()+" años \n Sus ingresos per nomina ascienden a "+getIngresoPerNomina()+"€ \n Y su número de nominas realizadas es "
                +getNominasRealizadas();
        String conjunto=mensaje1+mensaje2+mensaje3+mensaje4;
        return conjunto;
    }
    
}//FINCLASEEJECUTIVO
