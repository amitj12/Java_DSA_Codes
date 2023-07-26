

public class first {


    static class node
    {
        int data;
        node next;
        node(int item)
        {
            this.data=item;
            next=null;
        }
    };
    static node insert_at_b(node head,int val)
    {
        node newnode= new node(val);
        if(head==null)
        {
            head=newnode;
            return head;
        }
        newnode.next=head;
        head=newnode;
        return head;
    }
    
    static node insert_at_end(node head,int val)
    {
        node newnode= new node(val);
        if(head==null)
        {
            head=newnode;
            return head;
        }
        node temp=head;
        while (temp.next!=null) {
           temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
    static node insert_at_pos(node head,int pos,int val)
    {

        if(pos==1)
        {
            node temp=insert_at_b(head,val);
            return temp;
        }
        node temp=head;
        node newnode= new node(val);
        for (int i = 1; i < pos-1; i++) {
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("linkedlist doesnt content at position"+pos);
            return head;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }
    static node deletee_at_pos(node head,int pos)
    {

        if(pos==1)
        {
            node temp=deletee_f(head);
            return temp;
        }
        node temp=head;
        for (int i = 1; i < pos-1; i++) {
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("linkedlist doesnt content at position"+pos);
            return head;
        }
        node d=temp.next;

        temp.next=d.next;
        d=null;
        return head;
    }
    static node deletee_f(node head)
    {
        if(head==null)
        {
            System.out.println("no elements present");
            return head;
        }
        node temp=head;
        head=head.next;
        temp=null;
        return head;

    }

    static node deletee_l(node head)
    {
         if(head==null)
        {
            System.out.println("no elements present");
            return head;
        }
        node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    static void display(node temp)
    {
        System.out.println();
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    static node middle(node head)
    {
        node slow=head;
        node fast=head;
        while (fast!=null && fast.next!=null) {
            
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    static node reverse(node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        node newhead=reverse(head.next);
        newhead.next.next=newhead;
        

        return newhead;


    }
    
    public static void main(String[] args) {
        node head=null;
       head= insert_at_b(head, 100);
       head= insert_at_b(head, 30);
       head= insert_at_end(head, 1);
       head= insert_at_end(head, 3);
       display(head);
      head= insert_at_pos(head, 2, 20);
       display(head);
       head=deletee_f(head);
       display(head);
       head=deletee_l(head);
       display(head);
      head= deletee_at_pos(head, 2);
             head= insert_at_end(head, 13);
       head= insert_at_end(head, 34);
             head= insert_at_end(head, 25);

       display(head);

       node middle=middle(head);
       System.out.println("\n"+middle.data);

      head= reverse(head);
      display(head);
    }
}
