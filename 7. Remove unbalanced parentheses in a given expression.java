// "static void main" must be defined in a public class.
// 7. Remove unbalanced parentheses in a given expression.
// Eg.) Input : ((abc)((de))
// Output : ((abc)(de))
// Input : (((ab)
// Output : (ab)

// METHOD 1 SOMETHING WANT TO CHANGE
import java.util.Collection;
public class Main {
    public static void main(String[] args) {
        String s = "(((ab)";
        Stack<HashMap<Integer,Character>> st = new Stack<>();
        int i = 0;
        // List<Integer>
        char[] res = s.toCharArray();
        List<Integer> li = new ArrayList<>();
        for(Character c:s.toCharArray()){
            HashMap<Integer,Character> hm = new HashMap<>();
            if(c=='('){
                hm.put(i++,c);
                st.push(hm);
            }else{
                if(c==')'){
                    Collection<Character> cal = st.peek().values();
                    for(Character c2:cal){
                        if(c2.equals('(')) st.pop();
                    }
             }
            }
        }
        
        String ans = "";
        // System.out.print(st);
        for(int j=res.length-1;j>=0;j--){
            if(st.peek().containsKey(j)){
                st.pop();
            }else{
                ans = res[j] + ans;
            }
        }
        System.out.print(ans); //(ab)
    }
}

// METHOD 2 PASS

// "static void main" must be defined in a public class.
// 7. Remove unbalanced parentheses in a given expression.
// Eg.) Input : ((abc)((de))
// Output : ((abc)(de))
// Input : (((ab)
// Output : (ab)
//answer->https://www.youtube.com/watch?v=nDPWB7oQOw8
// open ans close bracket count edukanum open or close -1 pona antha bracket theva ilama iruku so print pana theva ila
import java.util.Collection;
public class Main {
    public static void main(String[] args) {
        String s = "(((ab)";
        char[] c = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        int open = 0;
        int close = 0;
        while(i<s.length()){
            if(c[i]=='(') open++;
            else if(c[i]==')') open--;
            
            if(c[j]==')') close++;
            else if(c[j]=='(') close--;
            
            if(open<0) {
                c[i]='1';
                open = 0;
            }
            if(close<0){
                c[j]='1';
                close=0;
                }
            i++;
            j--;
        }
        for(i=0;i<c.length;i++){
            if(c[i]!='1') System.out.print(c[i]);
        }
    }
    
}
