/** Find area of the circle */
class Circle { 
    private double radius = 1; 
    public double getArea() {
     return radius * radius * Math.PI;
   }
   public static void main(String[] args) {
    Circle myCircle = new Circle();
    System.out.println("Radius is " + myCircle.radius);
    System.out.println("Area of cirle: " +myCircle.getArea()); 
   }
  }