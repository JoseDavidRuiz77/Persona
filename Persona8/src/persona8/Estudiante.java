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
public class Estudiante extends Persona8 {
    //VAriables:
    private int notaCurso;
    
    //Constructores:
    public Estudiante(){
        super();
        notaCurso=0;
    }
    public Estudiante(String nombre,String fechaNac,char genero,boolean casado,int edad,int notaCurso){
        super(nombre,fechaNac,genero,casado,edad);
        this.notaCurso=notaCurso;
    }
    
    //Getters & Setters
    public int getNotaCurso() {
        return notaCurso;
    }
    public void setNotaCurso(int notaCurso) {
        this.notaCurso = notaCurso;
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
        String mensaje4="Tiene "+getEdad()+" años \n Y su nota del curso es "+getNotaCurso();
        String conjunto=mensaje1+mensaje2+mensaje3+mensaje4;
        return conjunto;
    }
    
}//FINCLASEESTUDIANTE
