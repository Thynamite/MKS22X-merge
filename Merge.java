public class Merge {

  /*sort the array from least to greatest/*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    if (data.length < 2) {
      return;
    }
    else {
      int[] left = makeArray(data, 0, data.length /2);
      int[] right = makeArray(data, data.length/2, data.length-1);

      mergesort(left);
      mergesort(right);
      
    }

  }


  public static void mergesorth(int[] left ,int[] right, int[] data) {
    if (low >= high) {
      return;
    }

    int pivot = low + (high -low +1) /2;
  }

  public static int[] makeArray(int[] data, int low, int high) {
    int[] dummy = new int[(high-low)+1];
    int index = 0;
    for (int x = low; x < high; x++) {
      dummy[index] = data[x];
      index++;
    }
    return dummy;
  }

  public static void main(String[] args) {
    int[] a = {34,12,54,234,634,2};
    mergesort(a);
  }

}
