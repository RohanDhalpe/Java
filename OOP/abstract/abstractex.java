
 abstract class Test{
    abstract void fun1();
    abstract void fun2();
 }

 class Derived extends Test{
    public void fun1(){
      System.out.println("Derived fun1");
    }
    public void fun2(){
      System.out.println("Derived fun2");
    }

 }
public class abstractex{
    public static void main(String[] args) {
        Test t=new Derived();
        t.fun1();
    }
}
