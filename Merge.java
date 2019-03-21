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
    int l = 0;
    int r = 0;
    int index = 0;

    while (l < left.length && r < right.length) {

      if  (r >= left.length || left[l] > right[r]) {
        data[index] = left[l];
        l++;
      }
      else {
        data[index] = right[r];
        r++;
      }
      index++;
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
