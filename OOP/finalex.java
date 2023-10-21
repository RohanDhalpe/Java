
class Base{
     
     final void fun1(){
         System.out.println("block1 Base");
     }
}
class Derived extends Base{
    //   void fun1(){
    //      System.out.println("block1 Derived");          we cannot Override final methods
    //   } 
}

public class finalex {
    public static void main(String[] args) {
		
	   Derived d=new Derived();
	   d.fun1();
		
	}
}
