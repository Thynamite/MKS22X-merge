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


  public static void mergesorth(int[] left ,int[] right, int[] data) {
    int size;
    if (left.length - right.length < 0) {
      size = right.length-left.length;
    }
    else {
      size = left.length-right.length;
    }

    int place = 0;

    for (int l = 0; l < size; l++) {
      for (int r = place; r < size; r++) {
        if (left[l] <= right[r]) {
          data[l+r] = left[l];
          r = size;
        }
        else {
          data[l+r] = right[r];
          place++;
        }
      }
    }
    for (int x = size + place, counter =0; x < data.length; x++, counter++) {
      data[x] = right[counter+x];
    }
  }

  public static int[] makeArray(int[] data, int low, int high) {
    int[] dummy = new int[(high-low)+1];
    int index = 0;
    for (int x = low; x <= high; x++) {
      dummy[index] = data[x];
      index++;
    }
    System.out.println(toString(dummy));
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
