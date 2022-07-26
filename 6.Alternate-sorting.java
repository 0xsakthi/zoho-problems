// Alternate sorting: Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum.
   // Eg.) Input  : {1, 2, 3, 4, 5, 6, 7}
   //       Output : {7, 1, 6, 2, 5, 3, 4}

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        int i = 0;
        int j = arr.length-1;
        int k = 0;
        int[] res = new int[arr.length];
        while(i<=j){
            if(k<arr.length)
                res[k++]=arr[j--];
            if(k<arr.length)
            res[k++]=arr[i++];
        }
        System.out.print(Arrays.toString(res));
        
    }
}
