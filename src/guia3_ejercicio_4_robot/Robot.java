
package guia3_ejercicio_4_robot;


public class Robot {
    private Bateria bateria;
    private String nombre;
    private boolean reposo;

     public Robot(String nombre,Bateria bateria) {
        this.nombre = nombre;
        this.reposo=false;
        this.bateria=bateria;
        
    }
    
    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public boolean getReposo() {
        return reposo;
    }

    public void setReposo(boolean reposo) {
        this.reposo = reposo;
    }
    
 // this.bateria
    
   public void avanzar(int pasos) {
       if (this.bateria.getCarga()>0 && pasos<=10000) {
       this.bateria.setCarga(bateria.getCarga()-pasos*0.1);
       }else {         
           System.out.println("Batería insuficiente");
       }
   }
   
   public void retroceder(int pasos) {
       if (this.bateria.getCarga()>0 && pasos<=10000) {
       this.bateria.setCarga(bateria.getCarga()-pasos*0.1);
       }else {         
           System.out.println("Batería insuficiente");
       }
   }
   
   public void dormir(){
   this.reposo=true;
   }
    
      public void despertar(){
   this.reposo=false;
   }

   public void recargar(){
   this.bateria.setCarga(1000);
   }
      
    public boolean bateriaLlena() {
        return bateria.getCarga() == 1000;
    }
   
    public boolean bateriaVacia() {
        return bateria.getCarga() <= 0;
    }
    
    public double energiaActual(){
    return this.bateria.getCarga();
    }
    
    }

