package LLD_HLD.HighLevelDesign.DesignElevatorSystem;

public class Request {
    private int sourceFloor;
    private int destinationFloor;
    private Direction direction;

    public Request(int sourceFloor, int destinationFloor) {
        this.sourceFloor = sourceFloor;
        this.destinationFloor = destinationFloor;

        if(sourceFloor < destinationFloor){
            this.direction = Direction.UP;
        }
        else{
            this.direction = Direction.DOWN;
        }
    }

    public int getSourceFloor() {
        return sourceFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public Direction getDirection() {
        return direction;
    }
}
