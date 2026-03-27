package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.FlyweightPattern.Problem;


public class Demo {

    public static void main(String[] args){
        int x = 0;
        int y = 0;

        // Create 5L Humanoid robots
        for(int  i = 0 ; i < 500000; i++){
            Sprites humanoidSprites = new Sprites();
            Robot humanoidRobot = new Robot(x+i,y+i , "HUMANOID", humanoidSprites);
        }

        // Create 50L Robotic Dog robots
        for (int i = 0; i < 500000; i++) {
            Sprites roboticDogSprite = new Sprites();
            Robot roboticDogObject = new Robot(x + i, y + i, "ROBOTIC_DOGS", roboticDogSprite);
        }
        // A total of 10L robots created will result in 10L Sprite objects created
        // which will consume a lot of memory.

    }
    
}