package LLD_HLD.HighLevelDesign.DesignSnakesAndLadders;

public class Player {

    String id;
    int currentPosition;

    public Player(String id,int currentPosition){
        this.id = id;
        this.currentPosition = currentPosition;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
