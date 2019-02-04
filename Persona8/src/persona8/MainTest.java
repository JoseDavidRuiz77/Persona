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
public class MainTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables & Objetos:
        Estudiante est=new Estudiante("Alfonso","22/05/1997",'M',false,20,8);
        Comercial com=new Comercial("Eva","19/01/1989",'F',true,30,1100.20,800);
        Ejecutivo eje=new Ejecutivo ("Diego","13/04/1990",'M',false,29,20.30,100);
        
        System.out.println("toString() de Estudiante:");
        System.out.println(est.toString());
        System.out.println("-------------------------------");
        System.out.println("toString() de comercial:");
        System.out.println(com.toString());
        System.out.println("-------------------------------");
        System.out.println("toString() de ejecutivo:");
        System.out.println(eje.toString());
        
        
    }
}//FINCLASETEST
