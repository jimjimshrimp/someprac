class Main {
  static class Node{
    int data;
    Node left;
    Node right;
  }

  public static void insert(int[] arr){
    Node root = new Node();
    root.data = arr[0];
    root.left = null;
    root.right = null;
    Node temp = root;
    int i = 1;
    while(i<arr.length){
      //System.out.println(i + " and rootdata is " + root.data);
      if (arr[i] > root.data && root.right == null){
        Node newRoot = new Node();
        root.right = newRoot;
        newRoot.data = arr[i];
        newRoot.right = null;
        newRoot.left = null;
        i++;
        root = temp;
      }
      else if (arr[i] > root.data && root.right != null) {
        root = root.right;
      }
      else if (arr[i] < root.data && root.left == null) {
        Node newRoot = new Node();
        root.left = newRoot;
        newRoot.data = arr[i];
        newRoot.right = null;
        newRoot.left = null;
        i++;
        root = temp;
      }
      else if (arr[i] < root.data && root.left != null) {
        root = root.left;
      }
    }
    inorderRec(root);
  }

  public static void inorderRec(Node root)
    {

        if (root != null)
        {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }



  public static void main(String[] args) {
    //Node root = new Node();
    int arr[] = {5,3,6,2,7,8};
    insert(arr);
    //System.out.println("Hello world!");
  }
}
