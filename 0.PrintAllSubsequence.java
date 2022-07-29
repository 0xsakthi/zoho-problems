//print all the subsequence of 123
public class Main {
    static void printi(int ind,int[] arr,List<Integer> li,int n){
        if(ind==n){ // n==ind 3==3
            for(int i:li){
                System.out.print(i+" ");
            }
            System.out.println("");
            return; //return case
        }
        li.add(arr[ind]); //take
        printi(ind+1,arr,li,n);//recursion
        li.remove(li.size()-1);//not take
        printi(ind+1,arr,li,n);//recursion
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<Integer> li = new ArrayList<>(); //data structure
        printi(0,arr,li,3);
    }
}
