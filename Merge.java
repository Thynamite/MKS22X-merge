public class Merge {

  /*sort the array from least to greatest/*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    mergesorth(data,0,data.length-1);
  }
  /*
  public static void mergesorth(int[]data, int low, int high) {
    if (low >= high) {
      return;
    }

    int pivot = (low + (high-low) + 1) / 2;
    int[] left = new int[(high-low+1)/2];
    int[] right = new int[(high-low+1)/2];

    left = makeAry(data,low,pivot);
    right = makeAry(data,pivot+1,high);

    mergesorth(data,low,pivot);
    mergesorth(data,pivot+1,high);

  }

  public static int[] makeAry(int[] data, int low, int high) {
    int[] a = new int[high-low+1];
    int z = 0;
    for (int x = low; x < high; x++) {
      a[z] = data[x];
      z++;
    }
    return a;
  }
  public static int[] merge(int[]d1, int[]d2) {
    int[] help = new int[d1.length+d2.length];
    int x = 0;
    int y = 0;
    int index = 0;
    while (x < d1.length && d2.length > y) {
      if (d1[x] > d2[y]) {
        help[index] = d1[x];
      }
      else {
        help[index] = d2[y];
      }
      index++;
    }

    return help;
  }
  */

  public static void mergesorth(int[]data,int[]temp,int low, int high) {
    if (low >= high) {
      return;
    }

    int pivot = low + (high -low +1) /2;
  }
  public static void main(String[] args) {
    int[] a = {34,12,54,234,634,2};
    mergesort(a);
  }
}
