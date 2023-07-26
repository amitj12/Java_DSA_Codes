public class BST
{
    static class node{
        int data;
        node left;
        node right;
        node(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static node insert(node root,int value)
    {
        if(root==null)
        {
            root=new node(value);
            return root;
        }
       
            if(root.data>value)
            {
                root.left=insert(root.left, value);
            }
            else
            {
                root.right=insert(root.right, value);
            }
       return root; 
    } 


    public static boolean search(node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data < key)
        {
            return search(root.right, key);
        }
        else if(root.data==key)
        {
            return true;
        }
        else
        {
            return search(root.left, key);
        }
    }
    public static node delete(node root,int key)
    {
     
        if(root.data < key)
        {
            root.right= delete(root.right, key);
        }
        else if(root.data> key)
        {
           root.left= delete(root.left, key);
        }
        else
        {
            if(root.left==null && root.right==null)
            {
                return null;
            }
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
        }

        return root;
    }

    public static void inorder(node temp)
    {
        if(temp==null)
        {
            return;
        }
        inorder(temp.left);
        System.out.println(temp.data);
        inorder(temp.right);
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,6};
        node root=null;

        for (int i = 0; i < values.length; i++) {
            root=insert(root, values[i]);
        }
        System.out.println("Inorder traversal: ");
        inorder(root);

        if(search(root, 9))
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
        node temp=delete(root, 6);
         System.out.println("After deletion Inorder traversal: ");
        inorder(temp);


    }
}