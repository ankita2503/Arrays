package leetcodeSample;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,1,1,2,3,5,7,7,7,9,9,13,13,14,14,17,17,19,20,20};
        int arr2[] = {3,5,7,9,10,12,13,14,20,20};
        int temp = 0;
        int c = 0;
        int j=0;
      while(j<arr1.length) {
          int min = Integer.MAX_VALUE;
          for (int i = 0; i < arr2.length; i++) {
              if (arr2[i] < min) {
                  min = arr2[i];
                  c=i;
              }
          }

          if(arr1[j]>arr2[c]) {
              temp = arr1[j];
              arr1[j] = arr2[c];
              arr2[c] = temp;
          }
         j++;
      }
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }

        System.out.println("");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
}
}
