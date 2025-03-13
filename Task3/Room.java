package Task3;

public class Room {

    private int numberOfLamps;
    private int numberOfWindows;

    Room(int numberOfLamps, int numberOfWindows){
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //Getters
    public int getNumberOfLamps() {
        return numberOfLamps;
    }
    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    //Setters
    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }
    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

}
