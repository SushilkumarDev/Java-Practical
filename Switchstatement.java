public class Switchstatement {

    public static void main(String[] args) {
        String dayOfWeek = "sUnDay";
        switch (dayOfWeek.toLowerCase()) {
            case "sunday":
                System.out.println("Today is Sunday");
                break;
            case "monday":
                System.out.println("Today is Monday");
                break;
            default:
                System.out.println("Unknown day");
                break;
        }
    }
}
