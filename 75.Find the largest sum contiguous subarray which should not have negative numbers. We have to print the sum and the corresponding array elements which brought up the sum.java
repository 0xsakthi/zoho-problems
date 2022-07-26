//two pointer approach!
// Find the largest sum contiguous subarray which should not have negative numbers. We have to print the sum and the corresponding array elements which brought up the
// sum.

// Sample: 
// Array : {-2, 7, 5, -1, 3, 2, 9,-7}
// Sum : 14 
// Elements : 3, 2, 9 

public class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 7, 5, -1, 3, 2, 9,-7};
        int[] res = new int[arr.length];
        int max = 0;
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            int reslen = 0;
            int[] temp = new int[arr.length];
            temp[reslen++] = arr[i];
            cnt+=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>-1 && arr[j]>-1){
                    cnt+=arr[j];
                    temp[reslen++] = arr[j];
                }else{
                    if(cnt>max){
                        for(int m=0;m<reslen;m++){
                            res[m] = temp[m];
                        }
                        max = cnt;
                    }
                    cnt = 0;
                    break;
                }
            }
        }
        System.out.println("The Sum : "+max);
        System.out.print("The Elements are: ");
        for(int i=0;i<res.length;i++){
            if(res[i]!=0) System.out.print(res[i]+" ");
        }
    }
}
