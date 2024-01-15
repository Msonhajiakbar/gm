
package game;

public class Game {

    public static void main(String[] args) {
        //Buat Objek
        Player Hero = new Player();
        Player Enemy = new Player();
        
        Hero.name = "JendraL";
        Hero.speed = 20;
        Hero.healthPoin = 0;
        
        Hero.run();
        
        
        
    }
    
}
