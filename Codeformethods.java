
public class Codeformethods {

    public static void main(String[] args) {
        perimeterOfRect(10, 20);
        perimeterOfRect(20, 30);

        double topspeed = speedofObject(200, 20); // topspeed = 5
        double x = 40 * topspeed;
        System.out.println(x);
    }
    
    public static void perimeterOfRect(int length, int breadth) {
    double perimeter = 2 * (length + breadth);
    System.out.println("The perimeter is: " + perimeter);
    }

    public static double speedofObject(double distance, double time) {
        if (distance == 100) {
            double speed = distance / time;
            return speed;
            }else {
        return Double.NaN;
        }
    }
}
