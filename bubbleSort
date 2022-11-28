import java.util.*;

class Main {
  public static void bubble(int arr[]){
    for (int i = 0; i<arr.length-1 ;i++){
      for (int j =0; j< arr.length-i-1; j++){// going outer loop once, the biggest number is at the rightmost, so the next round, we will only go through the remaining parts.
        int temp;
        temp = arr[j];
        if (arr[j]>arr[j+1]){
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
        }
    }
    for (int i=0; i<arr.length;i++){
        System.out.println(arr[i]+"");
      }
}
  public static void bubbleRecursion(int arr[],int n){
    if (n==arr.length-1){
       // System.out.println(Arrays.toString(arr));
        return;
      }
    for(int i = 0;i<arr.length-1-n;i++){
      if (arr[i]>arr[i+1]){
            int temp;
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            System.out.println(Arrays.toString(arr));
        }

      }
    bubbleRecursion(arr, n+1);
  }

  public static void main(String[] args) {
    int myList[] = {7,3,6,5};
    //bubble(myList);
    bubbleRecursion(myList,0);
    //sortingRecursion(myList,myList.length);
  }


public static void sortingRecursion(int[] arr, int n){
  if (n == 1){
    //System.out.println(Arrays.toString(arr));
     return;
  }
  for (int i = 0;i < n-1;i++){
      if (arr[i]>arr[i+1]){
        int temp;
        temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
        System.out.println(Arrays.toString(arr));
       }
   }
   sortingRecursion(arr, n-1);
}

}
