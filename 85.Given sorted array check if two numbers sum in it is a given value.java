// 85. Given sorted array check if two numbers sum in it is a given value
// Input
// Array = {1 3 4 8 10 } N = 7
// output
// true
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,42,8,10};
        int low = 0;
        int target = 7;
        int high = arr.length-1;
        //Two pointer method
        //should be sorted order
        while(low<=high){
            if(arr[low]+arr[high]==target){
                   System.out.println("True");
                System.out.print(arr[low]+" "+arr[high]);
                break;
            }else if(arr[low]+arr[high]>target){
                high--;
            }else{
                low++;
            }
        }
        //Hashing
        //Constraints
        //cant be duplicate
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i:arr){
            map.put(i,0);
        }
        for(Integer i:arr){
            if(map.containsKey(target-i)){
                System.out.print("true");
                break;
            }
        }
        
    }
}
