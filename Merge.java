public class Merge {

  /*sort the array from least to greatest/*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    mergesorth(data,0,data.length-1);
  }
  /*
  private static void mergesorth(int[] data, int low, int high) {
    int left,right;

    if (low >= high) {
      return;
    }
    if (data.length % 2 == 1) {
      left = low + (high-low+1) /2;
      right = left + 1;
    }
    else {
      left =  low + (high-low+1)/2;
      right = left;
    }


    mergesorth(data,low,right);
    mergesorth(data,left,high);

    if (right - left == 1) {
      merge(data,left,right);
    }

  }

  private static void merge(int[] data, int right, int left){
    if (data[left] > data[right]) {
      int storage = data[right];
      data[right] = data[left];
      data[left] = storage;
    }
  }
  */

  public static void mergesorth(int[] data, int low, int high) {
    if (low >= high) {
      return;
    }

    int right,left;

    if (data.length % 2 == 1) {
      left = low + (high-low+1) /2;
      right = left + 1;
    }
    else {
      left =  low + (high-low+1)/2;
      right = left;
    }

    mergesorth(data,low,right);
    mergesorth(data,left,high);

    int[] lefter = new int[]  ;
    int[] righter = ;
    int[] subArrayMerged = mergeA()
  }

  public static int[] mergeA(int[] data1, int[] data2){
    int[] dummy = new int[data1.length+data2.length];
    int x = 0;
    int y = 0;
    int index = 0;
     while(x < data1.length-1 && y < data2.length-1) {
       if (data1[x] > data2[y]) {
         dummy[index] = data2[y];
         y++;
       }
       else {
         dummy[index] = data1[x];
         x++;
       }
       index++;
     }
     return dummy;
  }
  public static void main(String[] args) {
    int[] a = {34,12,54,234,634};
    mergesort(a);
  }
}
