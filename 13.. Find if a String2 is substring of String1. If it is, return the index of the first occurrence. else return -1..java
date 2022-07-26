// 13. Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.
// Eg 1:Input:
//         String 1: test123string
//          String 2: 123
//         Output: 4
// Eg 2: Input:
//         String 1: testing12
//         String 2: 1234 
//         Output: -1


public class Main {
    // static int check()
    public static void main(String[] args) {
        String str1 = "test123string";
        String str2 = "123";
        int i = 0; //point out the str1
        int j = 0; //point out the str2
        int max = -1; //maximum j value goes
        int starting = -1;
        while(i<str1.length() && j<str2.length()){
            max = Math.max(max,j); //max check
            if(str1.charAt(i)==str2.charAt(j)){
                if(j==0) starting=i;
                j++; //j value va increase panrom incase str1[i] and str2[j] are equal
            }else{
                j = 0; //continue va ila na j va 0 aakidrom
            }
            i++; //obviously i epovume ++(next index ponum)
        }
        if(max==str2.length()-1){ //max is last index value so len-1 potu check panrom
            System.out.print("The starting index is :"+starting);
        }else{
            System.out.print("-1");
        }
        // System.out.print(max+" "+starting);

    }
}
