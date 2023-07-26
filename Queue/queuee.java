public class queuee {
    static class qu
    {
        static int arr[];
        static int rear=-1;
        static int size;
        public qu(int n)
        {
            	size=n;
                arr=new int[n];
        }

        static boolean isEmpty()
        {
            if(rear==-1)
            {
                return true;
            }
            return false;
        }

        static void enque(int data)
        {
            if (rear==size-1) {
                System.out.println("queue is full");
                return;

            }
            rear++;
            arr[rear]=data;
            
        }
        static int deque()
        {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;

            }
           int front=arr[0];
           for (int index = 0; index < rear; index++) {
            arr[index]=arr[index+1];
           }
           rear--;
           return front;


        }
        static int peek()
        {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;

            }
          return arr[0];


        }


    }
    public static void main(String[] args) {
        qu n=new qu(5);
        n.enque(10);
        n.enque(20);
        n.enque(30);
        n.enque(40);
        n.enque(50);
        while (!n.isEmpty()) {
            System.out.println(n.peek());
            n.deque();
        }

        
    }
}
