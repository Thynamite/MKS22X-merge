public class Merge {

  /*sort the array from least to greatest/*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){

  }

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

    for (int i = low; i < high; i++) {
      if(data[i] )
    }
  }
}
