class Circle
{
    private double radius;

    public Circle (double radius)
    {
        this.radius = radius;
    }

    public double getRadius ()
    {
        if (radius < 0)
        {
	        radius = 0;
	        return radius;
        }
        else
        {
	        return radius;
        }
    }

    public double getArea ()
    {
        double area = (radius * radius * Math.PI);
        return area;
    }
}

class Cylinder extends Circle
{
    private double height;

    public Cylinder (double radius, double height)
    {
        super (radius);
        this.height = height;
    }

    public double getHeight ()
    {
        if (height > 0)
        {
	        return height;
        }
        else
        {
	        height = 0;
	        return height;
        }
    }

    public double getVolume ()
    {
        double area = getArea () * getHeight ();
        return area;
    }
  
    public static void main (String[]args)
    {
        Circle circle = new Circle (3.75);
        System.out.println ("circle.radius= " + circle.getRadius ());
        System.out.println ("circle.area= " + circle.getArea ());
        Cylinder cylinder = new Cylinder (5.55, 7.25);
        System.out.println ("cylinder.radius= " + cylinder.getRadius ());
        System.out.println ("cylinder.height= " + cylinder.getHeight ());
        System.out.println ("cylinder.area= " + cylinder.getArea ());
        System.out.println ("cylinder.volume= " + cylinder.getVolume ());
  }
}