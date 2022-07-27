// "static void main" must be defined in a public class.
// 7. Remove unbalanced parentheses in a given expression.
// Eg.) Input : ((abc)((de))
// Output : ((abc)(de))
// Input : (((ab)
// Output : (ab)
import java.util.Collection;
public class Main {
    public static void main(String[] args) {
        String s = "((()";
        Stack<HashMap<Integer,Character>> st = new Stack<>();
        int i = 0;
        // List<Integer>
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
        System.out.print(st);
    }
}
