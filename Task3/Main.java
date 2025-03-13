package Task3;

public class Main {

    public static void main(String[] args) {
        Room r1 = new Room(2,3);
        Room r2 = new Room(16, 1);
        Room r3 = new Room(0, 64);

        Room[] rooms = {r1, r2, r3};

        Building b1 = new Building(rooms, 5);

        System.out.println("Lamps in building: " + countLampsInBuilding(b1) + "\n"
                + "Windows in building: " + countWindowsInBuilding(b1) + "\n"
                + "Rooms in building: " + countRoomsInBuilding(b1) + "\n"
                + "Is the building normal?: " + isNormal(b1));

    }

    static int countLampsInBuilding(Building b){
        Room[] rooms = b.getRooms();
        int totalLampsNum = 0;
        for (int floors = 0; floors < b.getNumberOfFloors(); floors++) {
            for (int i = 0; i < rooms.length; i++) {
                totalLampsNum += rooms[i].getNumberOfLamps();
            }
        }
        return totalLampsNum;
    }

    static int countWindowsInBuilding(Building b) {
        Room[] rooms = b.getRooms();
        int sum = 0;
        for (int floors = 0; floors < b.getNumberOfFloors(); floors++){
            for (int i = 0; i < rooms.length; i++) {
                sum += rooms[i].getNumberOfWindows();
            }
    }
        return sum;
    }

    static int countRoomsInBuilding(Building b){
        Room[] rooms = b.getRooms();
        int num = 0;
        for (int floors = 0; floors < b.getNumberOfFloors(); floors++) {
            for (int i = 0; i < rooms.length; i++) {
                num += i;
            }
        }
        return num;
    }

    static boolean isNormal(Building b){
        if(b.getNumberOfFloors() <= b.getRooms().length){
            return true;
        } else {
            return false;
        }
    }
}
