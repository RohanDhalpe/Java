class Parent{
    public Parent(){
        System.out.println("Default Parent constructor");
    }
    public Parent(int x){
        System.out.println("parent Parameterized "+x);
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Default Child constructor");
    }
    public Child(int x,int y){
        super(x);
        System.out.println(" Child Parameterized "+y);
    }
}
public class inheritanceParamConst {
    public static void main(String[] args) {
        Child c = new Child(10,20);
    }
}

