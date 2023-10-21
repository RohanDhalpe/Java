class Base{
    public void display(){
        System.out.println("Hello from Base");
    }
}

class  Derived extends Base{
    public void display(){
        System.out.println("Hello from Derived");
    }
}

class inheritOverriding{
    public static void main(String[] args) {
     // 1) Base b=new Base();
     //    b.display();  =>  Hello from Base
     
     // 2)  Derived d=new Derived();
      //   d.display();    =>  Hello from Derived
      
     //  3)   Base b=new Derived();
     //       b.display();    => Hello from Derived

    }
}