
def mergeSort(array):
  if len(array)>1:
    breakN = len(array)//2
    left = array[:breakN]
    right = array[breakN:]
    return merge(mergeSort(left) ,mergeSort(right))
  else : # base case
    #print(array)
    return array

def merge(left,right):
    temp = []
    i=j=0
    while (i < len(left) and j < len(right)):
      if left[i] < right[j]:
        temp.append(left[i])
        i = i+1
      else:
        temp.append(right[j])
        j=j+1

    temp +=(left[i:])
    temp +=(right[j:])

    return temp


def mergeSort1(arr):
  if len(arr)<=1: #base case
    return arr
  else :
    mid =len(arr)//2
    L = arr[:mid]
    R = arr[mid:]
    mergeSort1(L)
    mergeSort1(R)
    i=j=k=0
    while i<len(L) and j<len(R):
      if L[i] <= R[j]:
        arr[k] = L[i]
        i += 1
      else:
        arr[k] = R[j]
        j += 1
      k += 1
    while i < len(L):
      arr[k] = L[i]
      i += 1
      k += 1
    while j < len(R):
      arr[k] = R[j]
      j += 1
      k += 1
    print(arr)


# Code to print the list
arr = [9,7,3,6,2]
mergeSort1(arr)
#print(arr)


"""
                         f(97362)
                 f(97)               f(362)
            f9          f7       f3          f62
                                          f6      f2

route:  recursionLeft f(97262)-f(97)-f9-return array 9- go back to f(97){because f(97) called f9}
        recursionRight f(97) - f7-return array 7
        compute f(97) = f(9) VS f(7) = [7,9]
        gobackto f(97362)
        recursionRight f(97362)-f(362)....

"""
