package leetcodeSample;

public class KthMinMaxArray {
    public static void main(String[] args) {
        int arr[] = {5,7,10,4,20,15,15,4};
        int newArr[] = arr.clone();
        int n=0;
        int m=0;
        int kmax=3;
        int kmin=3;
        int max = Integer.MIN_VALUE;
        int prevMax;
        int min = Integer.MAX_VALUE;
        int prevMin;
        while (kmax > 0) {
            prevMax = max;
            max = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if (arr[i] > max) {
                    max = arr[i];
                    n=i;
                }
            }
            arr[n]=Integer.MIN_VALUE;
            if(prevMax!=max){
                kmax--;
            }
        }
        while (kmin > 0) {
            prevMin = min;
            min = Integer.MAX_VALUE;
            for(int i=0;i<newArr.length;i++){
                if (newArr[i] < min) {
                    min = newArr[i];
                    m=i;
                }
            }
            newArr[m]=Integer.MAX_VALUE;
            if(prevMin!=min){
                kmin--;
            }
        }
        System.out.print("max :" + max);
        System.out.print("");
        System.out.print("min :" + min);
        }
}

