import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] arr = {7,5,4,12,13};
    int N = arr.length;
    sort(arr,N);
  }
  public static void heapMax(int[] arr,int n){
    for(int i = 0; i<=n-1;i++){ // start from the 1st node and compare it with its child nodes
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
        if (arr[j]>=arr[(j-1)/2]){
          temp = arr[(j-1)/2];
          arr[(j-1)/2] = arr[j];
          arr[j] = temp; 
        }
        /* doesn't really need this k loop if i change the first for loop from (for(int i = 0; i<=n/2-1;i++)) to (for(int i = 0; i<=n-1;i++))
         * as from 0 to n/2-1, the loop stops, but all the lefted child nodes hasn't been checked backwards, that is why i added this k loop, but that 
         * won't be necessary!
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
        }**/
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
    
    /*
    for (int i = 0; i<n; i++){ // a reduced length of arr is put into heapMax, but the swap goes from arr[0] = arr[last] to arr[1] = arr[last],its wrong!
      int temp = arr[0];
      arr[0] = arr[n-1];
      arr[n-1] = temp;
      heapMax(arr,n--);
    }
    **/
    
    System.out.println(Arrays.toString(arr));
  }
}
