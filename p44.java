class cylinder{
    private double radius;
    private double height;

    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public void setRadius(double R){
        if(R>=0)
            radius = R;
        else
            radius = 0;
    }
    public double lidArea(){
        return 2*(3.14 * getRadius() * getRadius());
    }
    public double tsa(){
        return 2*3.14*radius*(radius+height);
    }
    public double volume(){
        return 3.14 * radius *radius * height;
    }
    public double circumference(){
        return 2*3.14*radius*height;
    }
}

public class p44 {
    public static void main(String[] args) {
      cylinder c = new cylinder();
      c.setRadius(2.1);

        System.out.println(c.lidArea());
        System.out.println(c.tsa());
        System.out.println(c.volume());
        System.out.println(c.circumference());
        System.out.println(c.getRadius());
    }
}
