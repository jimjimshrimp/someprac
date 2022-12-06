import java.util.*;

class Main {
  public static void main(String[] args) {
    Main m = new Main();// need to create an obj before using the non static method
    int[] arr = {2,9,7,4,1,8,4};
    m.sort(arr, 9);
  }

  void sort(int arr[], int biggest){
    int[] newArr = new int[biggest+1];
    int[] sortedArr = new int[arr.length];
    for (int i=0; i<arr.length;i++){
      newArr[arr[i]] = count(arr, arr[i]);
    }
    addPrefix(newArr);

    for (int j=0; j<arr.length;j++){
      newArr[arr[j]] = newArr[arr[j]]-1;
      sortedArr[newArr[arr[j]]] = arr[j];
    }

    System.out.println(Arrays.toString(sortedArr));
  }

  private int count(int arr[],int n){
    int c = 0;
    for (int i = 0; i<arr.length; i++){
      if (n == arr[i]){
        c++;
      }
    }
    return c;
  }

  private int[] addPrefix(int arr[]){
    for(int i=0; i<arr.length-1;i++){
      arr[i+1] = arr[i] + arr[i+1];
    }
    return arr;
  }
}
