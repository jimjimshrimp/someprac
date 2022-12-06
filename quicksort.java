import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] arr = {10, 7, 8, 9, 1, 5};
    partition(arr, 0, arr.length);
    //System.out.println(Arrays.toString(arr));
  }

  public static void partition(int arr[], int k ,int n){

      int temp;
      int initn = n;
      int initk = k;

      if (k>n-2){
        return;
      }

      while(k<=n-2){ //always compare pivot with the previous one, if the previous one is bigger ,then swap pivot with it ,if the previou one is smaller, swap it at with the beginning of the list, and compare pivot with the previous beginning one...
          if (arr[n-2] > arr[n-1]){
            temp = arr[n-2];
            arr[n-2] = arr[n-1];
            arr[n-1] = temp;
            n--;
          }
          else if ( arr[n-2]<arr[n-1]){
            temp = arr[k];
            arr[k] = arr[n-2];
            arr[n-2] = temp;
            k++;
          }
      }

      System.out.println(Arrays.toString(arr));
      partition(arr, k+1, initn); // from k+1 to the n of previous list
      partition(arr, initk, k ); //from previous k to the new k

  }
}
