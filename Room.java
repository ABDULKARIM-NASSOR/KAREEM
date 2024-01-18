
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room
{
    
    private double width;
    private double length;
    private int floor;

   
    public Room() {
        this.width = 10;
        this.length = 12.5;
        this.floor = 1;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    
    public String toString() {
        return length + " x " + width + ", floor " + floor;
    }

  
    public static void main(String[] args) {
        
        Room defaultRoom = new Room();
        System.out.println("Default Room: " + defaultRoom);

      
        defaultRoom.setWidth(15);
        defaultRoom.setLength(-5);
        defaultRoom.setFloor(3);
        System.out.println("Updated Default Room: " + defaultRoom.toString());
        
    }
}
