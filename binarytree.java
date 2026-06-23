import java.util.*;
class node{
        int data;
        node left,right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
class binarytree{
    static node buildtree(int arr[],int i){
        if(i>=arr.length) return null;
        node root = new node(arr[i]);
        root.left=buildtree(arr, 2*i+1);
        root.right = buildtree(arr, 2*i+2);
        return root;
    }
    static void inorder(node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String arg[]){
        int arr[] = {1,2,3,4,5};
        node root = buildtree(arr, 0);
        inorder(root);
    }
}