// 17. To find the factors of the numbers given in an array and to sort the numbers in
// descending order according to the factors present in it.

// Input:
// Given array : 8, 2, 3, 12, 16
// Output:
// 12, 16, 8, 2, 3
public class Main {
    //get factors count
    static int NumberOfFactors(int n){
        int cnt = 0;
        for(int i=1;i<n;i++){
            if(n%i==0) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 12, 16};
        int[] fact = new int[arr.length]; //update factors counts on array respective index
        
        for(int i=0;i<arr.length;i++){
            fact[i] = NumberOfFactors(arr[i]);
        }
        for(int i=0;i<fact.length;i++){
            for(int j=i+1;j<fact.length;j++){
                if(fact[i]<fact[j]){
                    int temp1 = arr[i];
                    int temp = fact[i];
                    arr[i] = arr[j];
                    fact[i] = fact[j];
                    arr[j] = temp1;
                    fact[j] = temp;
                }
            }
        }
        // fact = [5, 4, 3, 1, 1] -Desc order sort
        System.out.print(Arrays.toString(arr));
        // [12, 16, 8, 2, 3] --> output
    }
}
