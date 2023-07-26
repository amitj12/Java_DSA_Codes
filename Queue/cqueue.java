public class cqueue {

    static class circular
    {
       static int size;
       static int a[];
       static int rear=-1,front=-1;
        public circular(int n)
        {
            a=new int[n];
            this.size=n;
        }

        public static boolean is_full()
        {
            if((rear+1)%size==front)
            {
                return true;
            }
            return false;

        }
        public static boolean isEmpty()
        {
            if (rear==-1 && front==-1) {
                return true;
            }
            return false;

        }
        public static void enque(int data)
        {
            if(is_full())
            {
                System.out.println("queue is full");
                return;
            }
            if (front==-1) {
                front++;
            }

            rear=(rear+1)%size;
            a[rear]=data;
        }
        public static int deque()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
              int temp=a[front];
            if (rear==front) {
              
                front=rear=-1;
                return temp;
            }else
            {
                front=(front+1)%size;
            }

            
             return  temp;


        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }

             return  a[front];


        }
    }
    public static void main(String[] args) {
        circular x=new circular(5);
        x.enque(10);

          x.enque(20);
            x.enque(30);
            x.enque(40);
            x.enque(50);
            x.enque(60);

            System.out.println(x.deque()); 
            System.out.println(x.deque()); 
               x.enque(80);
            x.enque(90);
            
            System.out.println(x.deque()); 
            System.out.println(x.deque());
            System.out.println(x.deque()); 
            System.out.println(x.deque());
            System.out.println(x.deque()); 
            System.out.println(x.deque());

       
       
       
    }
}
