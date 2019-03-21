public class Merge {

  /*sort the array from least to greatest/*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    if (data.length < 2) {
      return;
    }
    else {
      int[] left = makeArray(data, 0, (data.length /2)-1);
      int[] right = makeArray(data, (data.length/2), data.length-1);

      mergesort(left);
      mergesort(right);

      mergesorth(left, right, data);
    }

  }
  public static void insertionSort(int[] data) {
  int storage = 0;                                                                      //still can't instantiate ints without a value
  for (int x = 1; x < data.length; x++) {                                               //start at 1, as a size 1 array is already sorted, and should be comparing to that at the start
    if (data[x] < data[x-1]) {                                                         //checks if the element needs to be placed inside the sorted(greater value is sorted already on the rightmost of the array)
      storage = data[x];                                                                //stores the value
      //System.out.println(storage);                                                    //testing
      int c = x;                                                                        //since this loop looks at the left value to compare, it would need to start at the stored value
      while (c > 0 && (data[c-1] > storage)) {                                          //this checks if there is a need to shift the value over to the next one, if it's 0 then you can't shift anymore
        data[c] = data[c-1];                                                            //this shifts the left value to the current position(this value is already saved by storage and in later cases the old in the new position is irrelevant as it is moved out already)
        c--;                                                                            //increment that was forgotten in one version
        //System.out.println(toString(data));                                           //testing for terrbile loops
      }
      data[c] = storage;                                                                //once the correct position is reached, the stored value is placed there
      /*  OLD LOOP
      for(int sorted = x-1; sorted > -1; sorted--) {                                    //counts backwards from the "sorted array"
        if (storage < data[sorted]) {                                                  //if the element is greater than the stored (need to be sorted), then shift over
          data[sorted+1] = data[sorted];
          if (sorted == 0) {                                                           //issue was that it would not be able to set the lowest value all the way at the beginning, it would only duplicate the original value at the start to the next position
            data[sorted] = storage;
          }
          //System.out.println(toString(data));                                         //test
          //System.out.println("less");                                                 //test
        }
        else if (storage >= data[sorted]){ //here probably issue                        //This checked the remaining cases, even though an else would probably suffice
          data[sorted+1] = storage;                                                     //the duplicate would be overwritten
          sorted = -1;                                                                  //makes sure loop ends
          //storage = 0;                                                                //thought this might've actually done something, but just varying amounts of duplicates in failed cases threw me off
          //System.out.println(toString(data));
          //System.out.println("more");
        }
        */
      }
    }
  }


  public static void mergesorth(int[] left ,int[] right, int[] data) {
    int size;
    if (right.length - left.length < 0) {
      size = right.length;
    }
    else {
      size = left.length;
    }

    //System.out.println(size);
    int place = 0;

    for (int l = 0; l < size; l++) {
      for (int r = place; r <= size +1; r++) {
        if (r >= right.length || left[l] <= right[r]) {
          data[l+r] = left[l];
          r = size+3;
        }
        else {
          data[l+r] = right[r];
          place++;
        }
      }
    }
    for (int x = size + place, counter =0; x < data.length; x++, counter++) {
      data[x] = right[counter+place];
    }
  }

  public static int[] makeArray(int[] data, int low, int high) {
    int[] dummy = new int[(high-low)+1];
    int index = 0;
    for (int x = low; x <= high; x++) {
      dummy[index] = data[x];
      index++;
    }
    //System.out.println(toString(dummy));
    return dummy;
  }

  public static void main(String[] args) {
    int[] a = {34,12,54,234,634,2};
    System.out.println(toString(a));
    mergesort(a);
    System.out.println(toString(a));
  }

  public static String toString(int[] data) {
    String test = "";
    for (int x = 0; x < data.length; x++) {
      test += " " + data[x];
    }
    return test;
  }
}
