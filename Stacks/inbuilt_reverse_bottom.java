import java.util.*;

public class inbuilt_reverse_bottom {

public static void inserta(Stack<Integer> s,int ele)
{
    if(s.isEmpty())
    {
        s.push(ele);
        return;
    }
    int e=s.peek();
    s.pop();
    inserta(s, ele);
    s.push(e);
}

public static void reversee(Stack<Integer> s,int ele)
{
    if(s.empty())
    {
        return;
    }
       int e=s.peek();
    s.pop();
    reversee(s, ele);
    inserta(s,e);
}

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        inserta(s, 100);
        while (!s.isEmpty()) {
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
