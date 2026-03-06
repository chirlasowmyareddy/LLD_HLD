package LLD_HLD.HighLevelDesign.DesignElevatorSystem;

public class Elevator {
    private int id;
    private int currentFloor;
    private Direction direction;

    public Elevator(int id) {
        this.id = id;
        this.currentFloor = 0;
        this.direction = Direction.IDLE;
    }

    public int getId() {
        return id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveToFloor(int destinationFloor){
        System.out.println("Elevator "+id + " moving from floor "+currentFloor +" to "+destinationFloor);

        this.currentFloor=destinationFloor;
        this.direction = Direction.IDLE;

        System.out.println("Elevator " + id + " reached floor " + destinationFloor);

    }
}
