class cyliender{
    private double radius;
    private double height;

   public cyliender(){
       radius = 3.2;
       height = 4.8;
   }
   public cyliender(double r){
       radius=height=1;
   }
   public cyliender(double r, double h){
       radius = r;
       height = h;
   }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        if(h>=0)
            height = h;
        else height= 0;
    }

    public void setRadius(double r) {
        if(r>=0)
            radius = r;
        else radius= 0;
    }
}
public class p47 {
    public static void main(String[] args) {
        cyliender g = new cyliender();
        g.setRadius(4.8);
        g.setHeight(8);
        System.out.println(g.getHeight());
        System.out.println(g.getRadius());

    }
}
