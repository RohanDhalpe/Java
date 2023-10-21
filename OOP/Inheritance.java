class Base{
        public void fun1(){
           System.out.println("fun1 of base");
        }
        public void fun2(){
           System.out.println("fun2 of base");
        }
}

class Derived extends Base{
      public void fun3(){
           System.out.println("fun3 of Derived");
        }
        public void fun4(){
           System.out.println("fun4 of Derived");
        }
}
public class Inheritance {
      public static void main(String[] args) {
          Base b=new Base();
          Derived d=new Derived();
          d.fun1();
          d.fun2();
          d.fun3();
          d.fun4();
      }
}
