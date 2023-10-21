class Rectangle{
    public int length;
    public int breadth;

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class classExample2 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=20;
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
