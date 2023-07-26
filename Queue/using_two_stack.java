import java.util.*;

public class using_two_stack {
    
    public static class  stackuse {
        static Stack<Integer> s1=new Stack<>();
       static Stack<Integer> s2=new Stack<>();
      
       static void add(int data)
        {
            while (!s1.isEmpty()) {
               
                s2.push(s1.pop());
            }
            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        static int remov()
        {
            if (s1.isEmpty()) {
                System.out.println("queue is empty");
                return -1;
                
            }
            return s1.pop();
        }
        static int peek()
        {
            if (s1.isEmpty()) {
                System.out.println("queue is empty");
                return -1;
                
            }
            return s1.peek();
        }
        
    }
}
