
/**
 * Write a description of class Mapinduzi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mapinduzi
{
    
    private String name;
    private int day;
    private String month;

    public Mapinduzi(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public static double avgDate(Mapinduzi[] holidays) {
        int totalDays = 0;

        for (Mapinduzi holiday : holidays) {
            totalDays += holiday.day;
        }

        return (double) totalDays / holidays.length;
    }

    public static Mapinduzi createInstance() {
        return new Mapinduzi("Independence Day", 12, "January");
    }

    
    public static void main(String[] args) {
        
        Mapinduzi independenceDay = createInstance();

        
        System.out.println("Holiday Name: " + independenceDay.name);
        System.out.println("Day: " + independenceDay.day);
        System.out.println("Month: " + independenceDay.month);
    }

}
