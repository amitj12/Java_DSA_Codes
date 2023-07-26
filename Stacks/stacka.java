import java.util.LinkedList;

public class stacka {


      static class node{
            int data;
            node next;
            public node(int data)
            {
                this.data=data;
            }
         };

    public static class stack{
      

        static node head;

        public static void push(int data)
        {
            node newnode=new node(data);
            if(is_Empty())
            {
               head=newnode;
               return;
            }
            newnode.next=head;
            head=newnode;
                   
        }
        public static void pop()
        {
            if (is_Empty()) {
                System.out.println("elements not present");
                return;
            }

          node temp=head;
            head=head.next;
            temp=null;

        }
        public static int peek()
        {
             if (is_Empty()) {
                return  -1;
            }    
            return head.data;
        }
        public static boolean is_Empty()
        {
            if (head==null) {
           
                return true;
            }
            return false;
        }
    }
  
    public static void main(String[] args) {
        stack s=new stack();

        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        
        while (!s.is_Empty()) {
            System.out.print(s.peek()+"-> ");
            s.pop();
        
        }
    }
}
