import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] arr = {7,5,4,12,13};
    int N = arr.length;
    sort(arr,N);
  }
  public static void heapMax(int[] arr,int n){
    for(int i = 0; i<=n/2-1;i++){ // start from the 1st node and compare it with its child nodes
      int l = 2*i+1;
      int r = 2*i+2;
      int temp = 0;

      if (l<n && arr[i]<arr[l]){
        temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;

      }
      if (r<n && arr[i]<arr[r]){
        temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;

      }
      for (int j=i; j>0;j--){ // once swicthed, check whether the current largest is the larger than its parent node, and keep iterating to check every node till the first node.
        if (j%2 !=0 && arr[j]>=arr[j/2]){
          temp = arr[i/2];
          arr[i/2] = arr[j];
          arr[j] = temp;
        }
        if (j%2 ==0 && arr[j]>=arr[j/2-1]){
          temp = arr[j/2-1];
          arr[j/2-1] = arr[j];
          arr[j] = temp;
        }
        for (int k=j ; k<=n/2-1 ;k++){ // check whether the current largest is
          int l1 = 2*k+1;
          int r1 = 2*k+2;
          if (l1<n && arr[k]<arr[l1]){ //initially used a[2*i+1]>a[i] but stack gets overflowed so check 2*i+1 > len first
            temp = arr[k];
            arr[k] = arr[l1];
            arr[l1] = temp;
          }
          if (r1<n && arr[k]<arr[r1]){
            temp = arr[k];
            arr[k] = arr[r1];
            arr[r1] = temp;
          }
        }
    }
  }
}
  public static void sort(int arr[],int n){ // I dont need to get the result the of heapMax, as arr is already changed. if i want to get the result, change the heapMax() to public static int[]..
    heapMax(arr,n);
    for (int i = n-1; i>0; i--){ //once switched, recurse the unchanged array.
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      heapMax(arr,i);
    }
    System.out.println(Arrays.toString(arr));
  }
}
