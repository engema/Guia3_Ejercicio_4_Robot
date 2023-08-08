
package guia3_ejercicio_4_robot;

import java.util.Scanner;


public class Guia3_Ejercicio_4_Robot {

  
    public static void main(String[] args) {
        
        
        Bateria bateria1=new Bateria(1000);
        
        Robot robot1=new Robot("Tito",bateria1);
        
        Hombre hombre1=new Hombre(robot1);
        Hombre hombre2=new Hombre(robot1);
        
       hombre1.jugarConRobot(robot1);
       /* hombre2.getRobot1().despertar();
        hombre2.jugarConRobot(robot1);*/
        
    
    hombre2.jugarConRobot(robot1);
    hombre2.jugarConRobot(robot1);
    hombre2.jugarConRobot(robot1);
    hombre2.jugarConRobot(robot1);

        //System.out.println("energía actual: "+hombre2.getRobot1().energiaActual());
    }
    
}
