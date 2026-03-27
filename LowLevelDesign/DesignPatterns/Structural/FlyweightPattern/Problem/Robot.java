package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.FlyweightPattern.Problem;

// Robot class - Used to create Humanoid and Robotic Dog robots
public class Robot {
    //extrinsic data
    int x;
    int y;
    //intrinsic data
    String type;
    Sprites body; // heavy-weight object - 2D bitmap image


    public Robot(int x, int y, String type, Sprites body) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.body = body;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Sprites getBody() {
        return this.body;
    }

    public void setBody(Sprites body) {
        this.body = body;
    }
}
