class cyl{
    public double height;
    public double radius;

    public double volume(double area){
        area = radius * height;
        return area*height;
    }
}



public class p50 {
    public static void main(String[] args) {
        cyl c = new cyl();
        c.radius = 7;
        c.height = 10;
        System.out.println(c.volume(2));
    }
}
