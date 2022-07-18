package leetcodeSample;

public class UnionIntersectionArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 2, 3, 7};
        int newUnionArr[] = new int[arr1.length + arr2.length];
        int newIntersectionArr[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        int n = 0;
        while (i < arr1.length-1 && j < arr2.length-1) {
             if (arr1[i] < arr2[j]) {
                 newUnionArr[k] = arr2[i];
                k++;
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                 newUnionArr[k] = arr2[j];
                k++;
                j++;
            }
            else if (arr1[i] == arr2[j]) {
                 newUnionArr[k] = arr2[j];
                k++;
                i++;
                j++;
            }

        }

    while(i<arr1.length){
        newUnionArr[k] = arr1[i];
            k++;
        newIntersectionArr[n] = arr1[i];
        n++;

        i++;
    }

        while(j<arr2.length){
            newUnionArr[k] = arr2[j];
            newIntersectionArr[n] = arr2[j];
            k++;
            n++;
            j++;
        }

        for(int l=0;l<newUnionArr.length;l++){
            System.out.print(newUnionArr[l]);
        }
        System.out.println();
        for(int l=0;l<newIntersectionArr.length;l++){
            System.out.print(newIntersectionArr[l]);
        }
}
}
