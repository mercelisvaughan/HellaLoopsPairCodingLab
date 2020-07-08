package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        return null;
    }

    public static String getRow(int numberOfStars) {
        String empString = "";
        for (int i = 0; i < numberOfStars; i++){
            empString += "*";
        }
        return empString;
    }

    public static String getSmallTriangle() {
        String empString = "";
        for(int i = 1; i<5; i++){
            empString += "*".repeat(i)+"\n";
        }
        return empString;
    }

    public static String getLargeTriangle() {
        String empString = "";
        for(int i = 1; i<10; i++){
            empString += "*".repeat(i)+"\n";
        }
        return empString;
    }
}
