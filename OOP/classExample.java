class Circle
{
    public double radius;
    public void area(){
        
        double areacal= 3.14*radius*radius;
        System.out.println(areacal);
    }
    
}
public class classExample {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.radius=1.15;
        c.area();
    }
}
