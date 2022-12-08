class Main {
  static class Node{
  int data;
  Node left;
  Node right;
}

  public static void insert(Node root, int val){

      if (val > root.data){
        if (root.right == null){
        Node newNode = new Node();
        root.right = newNode;
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;
      } else if (root.right != null){
        insert(root.right, val);
        }
      }

      else if (val< root.data){
        if (root.left == null){
        Node newNode = new Node();
        root.left = newNode;
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;
      }else if (root.right != null){
        insert(root.left, val);
        }
      }
  }


  public static void traverse(Node root){
        if (root != null)
        {
            traverse(root.left);
            System.out.print(root.data + " ");
            traverse(root.right);
        }

  }

  public static void main(String[] args) {

    Node root = new Node();
    int[] arr = {5,6,2,7,4,3,8};
    root.data = arr[0];
    root.left = null;
    root.right = null;
    for(int i = 1;i<arr.length;i++){
      insert(root, arr[i]);
    }
    traverse(root);
    //System.out.println("Hello world!");
  }
}
