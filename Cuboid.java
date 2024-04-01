class Rectangle
{
    double length;
    double width;
    Rectangle ()
    {

    }
  
    Rectangle (double length, double width)
    {
        if (length < 0)
            this.length = 0;
        else
            this.length = length;
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
    }
  
    public double getLength ()
    {
        return length;
    }
  
    public double getWidth ()
    {
        return width;
    }
  
    public double getArea ()
    {
        return length * width;
    }
}

class Cuboid extends Rectangle
{
    double height;
    Rectangle rectangle;
    
    public Cuboid (Rectangle rectangle, double height)
    {
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
        this.rectangle = rectangle;
    }
  
    public double getHeight ()
    {
        return height;
    }
  
    public double getVolume ()
    {
        return rectangle.getArea () * getHeight ();
    }
  
    public static void main (String[]args)
    {
        Rectangle rectangle = new Rectangle (2, 3);
        System.out.println ("rectangle length =" + rectangle.getLength ());
        System.out.println ("rectangle width =" + rectangle.getWidth ());
        System.out.println ("area= " + rectangle.getArea ());
        Cuboid cuboid = new Cuboid (rectangle, 5);
        System.out.println ("height= " + cuboid.getHeight ());
        System.out.println ("cuboid volume= " + cuboid.getVolume ());
    }
}