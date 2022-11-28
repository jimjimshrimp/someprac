import java.util.*;

class Main {
  public static void insertion(int[] array){
    for(int i=0;i<array.length-1;i++){
          for(int j=i; j>=0; j--){ //from current position i going backwards for comparison
            if (array[j]>array[j+1]){
              int temp;
              temp = array[j];
              array[j] =  array[j+1];
              array[j+1] = temp;
             System.out.println(Arrays.toString(array));
            }
      }

    }
    System.out.println(Arrays.toString(array));
  }

public static void insertion1(int[] array){
    for(int i=0;i<array.length-1;i++){
      int j=i;
      while (j>=0){
        if (array[j]>array[j+1]){
          int temp;
          temp = array[j];
          array[j] =  array[j+1];
          array[j+1] = temp;
          }
        j--;
      }
    }
    System.out.println(Arrays.toString(array));
  }



  public static void insertRecursion(int[] array, int n){
      if (n == 1){
          System.out.println(Arrays.toString(array));
          return;
      }
        for(int j=array.length-n; j>=0; j--){ //n is a counter that counts how many numbers are left to be executed
          if (array[j]>array[j+1]){
            int temp;
            temp = array[j];
            array[j] =  array[j+1];
            array[j+1] = temp;
            System.out.println(Arrays.toString(array));
          }
       }
       insertRecursion(array, n-1);
  }


  public static void main(String[] args) {
    int arr[] = {12, 11, 13, 5, 6};
    insertion1(arr);
    //insertRecursion(arr, arr.length);
  }
}
