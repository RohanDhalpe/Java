
interface Test {
  void display1(); 
  void display2();
 
}

class samplex implements Test{
    public void display1(){
        System.out.println("display1 of sample");
    }
    public void display2(){
        System.out.println("display2 of sample");
    }
   

} 

public class interexample {
    public static void main(String[] args) {
        Test t=new samplex();
        t.display1();
        t.display2();
    }  
}
