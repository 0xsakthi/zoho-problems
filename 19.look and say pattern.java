// 19. To find the print the pattern:
// Ip: n=5
// Op:
// 1
// 1 1
// 2 1
// 1 2 1 1
// 1 1 1 2 2 1

public class Main {
    public static void main(String[] args) {
        int n = 5;
        String str = "1";
        int k = 1;
        System.out.println(str);
        while(k<n){
            char[] arr = str.toCharArray(); //str char array
            int i = 0;
            int cnt = 1;
            String newstr = "";
            while(i<str.length()-1){
                if(arr[i]==arr[i+1]){ //array for check continous element
                    cnt++;
                }else{
                    newstr+=cnt+""+arr[i];
                    cnt = 1;
                }
                i++;
            }
            newstr+=cnt+""+arr[i];
            System.out.println(newstr);
            str = newstr; //updating sring str
            k++;
        }
    }
}
            
            
