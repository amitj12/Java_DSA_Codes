public class doubly {
    static class node{
        int data;
        node next;
        node prev;
        node(int data)
        {
            this.data=data;
        }
    };

    static node insert_at_pos(node head,int data,int pos)
    {
        node newnode=new node(data);
        if(pos==1)
        {
            if(head==null)
            {
                head=newnode;
                return head;
            }
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
            return head;
        }
        node temp=head;
        for (int i = 1; i < pos-1; i++) {
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("linkedlist not present at this position");
            return head;
        }
        if(temp.next==null)
        {
            temp.next=newnode;
            newnode.prev=temp;
            return head;
        }

        newnode.next=temp.next;
        newnode.prev=temp;
        temp.next.prev=newnode;
        temp.next=newnode;
        return head;
    }
    static node deletee_at_pos(node head,int pos)
    {
        if (head==null) {
                return head;
            }
        if(pos==1)
        {

            node temp=head;
            head=head.next;
            head.prev=null;
            temp=null;

        }
        node temp=head;
        for (int i = 1; i < pos-1; i++) {
            temp=temp.next;
        }
        if(temp.next==null )
        {
            System.out.println("linkedlist not present at this position");
            return head;
        
        }

        if (temp.next.next==null) {
            temp.next=null;
            return head;
        }
        
        node temp1=temp.next;
        temp1.next.prev=temp;
        temp.next=temp1.next;
        temp1=null;

        return head;
        
    }
    static void display(node temp)
    {
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        node head=null;
        head=insert_at_pos(head, 10, 1);
        head=insert_at_pos(head, 20, 2);
        head=insert_at_pos(head, 30, 3);

        display(head);
          head=deletee_at_pos(head, 3);
          display(head);


    }
}
