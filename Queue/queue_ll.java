public class queue_ll {
    static class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    static class queue
    {
       static node head=null;
       static node tail=null;

        static boolean isEmpty()
        {
            if (head==null&&tail==null) {
                return true;
            }
            return false;

        }

        static void enque(int d)
        {
            node newnode=new node(d);
            if (head==null && tail==null) {
                head=tail=newnode;
            }
            tail.next=newnode;
            tail=newnode;
        }

        static int deque()
        {
            if (head==null && tail==null) {
                System.out.println("queue is empty");
                return -1;
            }
           int temp=head.data;
           if(head==tail)
           {
                tail=null;
           }
           head=head.next;
           return temp;
        }
        static int peek()
        {
            if (head==null && tail==null) {
                System.out.println("queue is empty");
                return -1;
            }
           int temp=head.data;
           return temp;
        }

    }
    public static void main(String[] args) {
        queue x=new queue();
        x.enque(10);
        x.enque(20);
        x.enque(30);
        x.enque(40);

        while (!x.isEmpty()) {
            System.out.print(x.peek()+"->");
            x.deque();
        }
    }

}
