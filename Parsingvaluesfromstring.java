public class Parsingvaluesfromstring {

    public static void main(String[] args) {
        String myStringValue = "2500.215";
        double myDoubleValue = Double.parseDouble(myStringValue);
        System.out.println(myStringValue);
        myStringValue = myStringValue + 1;

        myDoubleValue += 1;
        System.out.println(myStringValue);
        System.out.println(myDoubleValue);
      
        //int myIntValue = Integer.parseInt(myStringValue);
        //System.out.println(myStringValue);
        //myIntValue = myIntValue + 1;
        // System.out.println("new value :" + myIntValue);
    }
}
