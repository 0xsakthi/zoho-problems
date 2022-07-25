// "static void main" must be defined in a public class.
P     M
 R   A 
  O R  
   G   
  O R  
 R   A 
P     M
public class Main {
    public static void main(String[] args) {
        String word = "PROGRAM";
        int k = 0;
        int m = word.length()-1;
        for(int i=0;i<word.length();i++){
            for(int j=0;j<word.length();j++){
                // i=3 and n-1-i==3 rendu vaati G print pana theva ila so condition
                // vachu m-- print paniruvoam 
                if(i==j && (word.length()-i-1)==i){
                    m--;
                }
                if(i==j){
                    System.out.print(word.charAt(k++));
                }else if((word.length()-1-i)==j){
                    System.out.print(word.charAt(m--));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
