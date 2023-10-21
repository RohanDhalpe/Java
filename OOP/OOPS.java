class Student{
    String name;
    int rollNo;

    public void display(){
        System.out.print(name+" "+rollNo);
    }
}
public class OOPS {
     public static void main(String args[]){
        Student s1=new Student();
        s1.name="Rssss";
        s1.rollNo=14;
        s1.display();
     }
}
