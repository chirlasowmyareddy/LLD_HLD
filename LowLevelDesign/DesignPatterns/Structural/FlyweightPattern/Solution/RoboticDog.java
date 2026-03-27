package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.FlyweightPattern.Solution;

// Concrete Flyweight (Class) - implements the Flyweight interface and stores intrinsic state.
public class RoboticDog implements IRobot{

    // intrinsic data - shared data - common to all objects
    private final String type;
    private final Sprites body ;

    RoboticDog(String type,Sprites body){
        this.type = type; // humanoid or robotic dog
        this.body = body;//small 2d bitmap (graphic element)
    }

    public String getType(){
        return type;
    }

    public Sprites getBody(){
        return body;
    }

    @Override
    public void display(int x, int y) {
        //use the Robotic Dog sprites object
        // and X and Y coordinate to render the image.
        System.out.println("Displaying " + type + " at " + x + ", " + y);

    }
}
