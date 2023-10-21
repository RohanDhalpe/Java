
public class LinkedList
{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
         
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void insertHead(int d){
        Node new_Node= new Node(d);
        size++;
        if(head==null){
            head=tail=new_Node;
            return;
        }

        new_Node.next=head;
        head=new_Node;
    }


    public static void insertTail(int d){
        Node new_Node= new Node(d);
        size++;
        if(head==null){ head=tail=new_Node;}

        tail.next=new_Node;
        tail=new_Node;
    }

    public static void print(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
         System.out.print("null");
    }

    public void addAtIndex(int idx,int data)
    {
        if(idx==0){
            insertHead(data);
        }
        Node new_node=new Node(data);
        size++;
         Node temp=head;
         int i=0;

         while(i<idx-1){
            temp=temp.next;
            i++;
         }
         new_node.next=temp.next;
         temp.next=new_node;

    }
    public static void Reverse(){
        Node prev=null;
        Node curr=head;
        Node nnext;

        while(curr!=null){
            nnext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nnext;
        }
        head=prev;
    }
    public static void Deletefromlast(int n){
        if(n==0){
            head=head.next;
            return;
        }
        
        Node temp=head;
        int sz=0;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        int i=1;
        int prevIdx=sz-n;
        Node prev=head;

        while(i<prevIdx){
          prev=prev.next;;
          i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.insertHead(5);
        ll.insertHead(15);
        ll.insertHead(25);
        ll.insertTail(20);
        ll.insertTail(30);
        ll.print();
       
        // System.out.println("");
        // System.out.println(size);
        // ll.Reverse();
         System.out.println("");
        // ll.print();

        ll.Deletefromlast(2);
        ll.print();
         
    }
}

 