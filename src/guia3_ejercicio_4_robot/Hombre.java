package guia3_ejercicio_4_robot;
/*Esto es un comentario de John DAvid MOlina*/

import java.util.Scanner;

public class Hombre {

    private Robot robot1;

    public Hombre(Robot robot1) {
        this.robot1 = robot1;
    }

    public Robot getRobot1() {
        return robot1;
    }

    public void setRobot1(Robot robot1) {
        this.robot1 = robot1;
    }

    /*public void jugarConRobot(Robot robot) {
        if (!robot.getReposo()){
        robot.avanzar(500);
        robot.retroceder(20);
        System.out.println("La energía actual del robot es: " + robot.energiaActual());
        robot.dormir();
        }
    }*/
    
    public void jugarConRobot(Robot robot) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese pasos que avanzará el robot: ");
            int pasos= leer.nextInt();
            String letra=leer.nextLine();
        System.out.println("Desea (A)vanzar, (R)etroceder, (D)ormir? ");
            letra=leer.nextLine();
        
        if (!robot.getReposo()){
        switch (letra.toUpperCase())
       {
        case "A":
            robot.avanzar(pasos);
            break;
        case "R":
            robot.retroceder(pasos);
            break;
        case "D":
            robot.dormir();
            break;
        default:
            System.out.println("Acción inválida");
    }
       }else{
            System.out.println("Robot dormido.");
        }
         System.out.println("La energía actual del robot es: " + robot.energiaActual());
}
}
// jugarConRobot(robot1, 100, R)