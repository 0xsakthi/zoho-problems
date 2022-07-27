// 10. Write a program to give the following output for the given input
// Eg 1: Input: a1b10
//        Output: abbbbbbbbbb
// Eg: 2: Input: b3c6d15
//           Output: bbbccccccddddddddddddddd
// The number varies from 1 to 99.


public class Main {
    public static void main(String[] args) {
        String str = "a3b10";
        str+=" "; 
        char[] arr = str.toCharArray(); //changing for checking arr[i+1]
        int i = 0;
        char c = arr[0];
        int cnt = 0;
        while(i<str.length()){
            if(arr[i]>=48 && arr[i]<=57){
                cnt = cnt*10 + (arr[i]-'0'); //cnt update panite varo like if string contains 12 - > 0*10+1 = 1 -> 1*10+2 -> 12 ..
            }else{
                for(int m=0;m<cnt;m++){ //when it is not a number it will print the char
                        System.out.print(c);
                    }
                c = arr[i];
                cnt = 0; //make the cnt = 0;
            }
            i++;
        }
    }
}
            
            
