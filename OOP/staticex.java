class staticExample{
    public static int  varex;
    
    static{
        System.out.println("block1");
    }
    static{
        System.out.println("block2");
    }
    
}
public class staticex
{
   public static void main(String[] args) {
       
       System.out.println("Main");
        staticExample st=new staticExample(); 
   }
}
