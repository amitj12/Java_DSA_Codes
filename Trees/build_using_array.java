import java.util.*;
public class build_using_array {

static class node
{
    int data;
    node left;
    node right;
    node(int data)
    {
        this.data=data;
        this.left=null;
       this.right=null;
    }
};
static class BST_arr
{
    static int ind=-1;
    public static node bst(int arr[])
    {
        ind++;
        if(arr[ind]==-1)
        {
            return null;
        }
        node newnode=new node(arr[ind]);
        newnode.left=bst(arr);
        newnode.right=bst(arr);

        return newnode;

    }

    public static void preorder(node d)
    {
        if(d==null)
        {
            return;
        }
        System.out.print(d.data+" ");

        preorder(d.left);
        preorder(d.right);

    }

    public static void inorder(node d)
    {
        if(d==null)
        {
            return;
        }
 

        inorder(d.left);
               System.out.print(d.data+" ");
        inorder(d.right);

    }
    public static void postorder(node d)
    {
        if(d==null)
        {
            return;
        }
 

        postorder(d.left);
        postorder(d.right);
        System.out.print(d.data+" ");
      

    }

    static void levelorder(node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<node> y=new LinkedList<>();
        y.add(root);
        y.add(null);
        while(!y.isEmpty())
        {
            node current=y.remove();
            if(current==null)
            {
                System.out.println();
                if(y.isEmpty())
                {
                    break;
                }
                else
                {
                    y.add(null);
                }
            }
            else
            {
                System.out.print(current.data+" ");

                if(current.left!=null)
                {
                    y.add(current.left);
                }
                if(current.right!=null)
                {
                    y.add(current.right);
                }
            }
        }
    }


    static int count(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=count(root.left);
        int right=count(root.right);

        return left+right+1;
    }


    static int sum(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);

        return leftsum+rightsum+root.data;
    }
    static int Height(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftheight=Height(root.left);
        int rightheight=Height(root.right);
        int max=Math.max(leftheight,rightheight);
        return max+1;
    }
}

    public static void main(String[] args) {
        int a[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BST_arr x=new BST_arr();
        
       System.out.println("original array: ");
        for(int i=0;i<a.length;i++)
        {   
            System.out.print(a[i]+" ");
        }
        
       System.out.println();
      node y=x.bst(a);


      
      System.out.println("Preorder Traversal: ");
     x.preorder(y);
     System.out.println();
     System.out.println("Inorder Traversal: ");
     x.inorder(y);

       System.out.println();
     System.out.println("Postorder Traversal: ");
     x.postorder(y);
       System.out.println();
     System.out.println("Levelorder Traversal: ");
     x.levelorder(y);
       System.out.println();
     System.out.println("Node Counts: ");
    System.out.print(x.count(y));
       System.out.println();
     System.out.println("sum of elements: ");
    System.out.print(x.sum(y));
       System.out.println();
     System.out.println("height of the tree : ");
    System.out.print(x.Height(y));
    }
    
}
