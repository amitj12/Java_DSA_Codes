import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistStack {




    public static class stack{
      

        static ArrayList<Integer> y=new ArrayList<>();

        public static void push(int data)
        {

            y.add(data);                  
        }
        public static void pop()
        {
            if (y.isEmpty()) {
                return;  
            }
            y.remove(y.size()-1);

        }
        public static int peek()
        {
             if (y.isEmpty()) {
                return -1;  
            }
            int temp=y.get(y.size()-1);
            return temp;
             
        }
        public static boolean is_Empty()
        {
            if(y.size()==0)
            {
                return true;
            }
            return false;
          
        }
    }
  
    public static void main(String[] args) {
        stack s=new stack();

       s. push(20);
        s.push(30);
        s.push(40);
        s.push(10);
        
        while (!s.is_Empty()) {
            System.out.print(s.peek()+" ");
            s.pop();
        
        }
    }
}
