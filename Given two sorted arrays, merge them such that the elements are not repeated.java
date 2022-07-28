// 14. Given two sorted arrays, merge them such that the elements are not repeated
// Eg 1: Input:
// Array 1: 2,4,5,6,7,9,10,13
// Array 2: 2,3,4,5,6,7,8,9,11,15
// Output:
// Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,6,7,8,9,11,15};
        int[] arr2 = {3,4,5,6,7,9,10,13}; //
        int len1 = arr1.length;
        int len2 = arr2.length;
        int i = 0;
        int k = 0;
        int check = arr1[i];
        //merge sort
        for(int m=0;m<len1;m++){
            if(arr1[m]>arr2[0]){
                int temp = arr1[m];
                arr1[m] = arr2[0];
                arr2[0] = temp;
            }
            Arrays.sort(arr2);
        }
        // After sorted
        // [2, 3, 4, 4, 5, 5, 6, 6, 7]
        // [7, 8, 9, 9, 10, 11, 13, 15]
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        
        // remove duplicate and print them
        while(k+1<=(len1+len2)){ //len1+len2 vaati iterate aganum
            if(k<=len1-1){
                if(arr1[i]!=check){
                    System.out.print(check+" ");
                }
                check = arr1[i];
            }else if(k==len1){ //once first array finished we need to change i=0
                i = 0;
                
            }else{
                if(arr2[i]!=check){
                    System.out.print(check+" ");
                }
                check = arr2[i];
            }
            k++;
            i++;
        }
        System.out.print(arr2[i-1]); 
    }
}
