
package game;

public class Player {
    
    //atribut
    String name;
    int speed, healthPoin;
    
    //method
    void run(){
        System.out.println(name+" is Running...");
        System.out.println("Speed "+speed);
    }
    
    boolean isDead(){
        if(healthPoin<=0) return true;
           return false;
        
    }
    
    
}
