import array

def selectionSort(array):
    for i in range(len(array)-1):
      min_id = i
      min = array[i]
      for j in range(i+1,len(array)):
        temp = array[i]
        if min > array[j]:
          min = array[j]
          min_id = j
      array[min_id] = temp
      array[i] = min
    print(array);

a = [8,6,2,3,7]
selectionSort(a)
