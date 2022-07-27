// 27. Find the union intersection of two list and also find except (remove even elements from list1 and odd elements from list2)
// Input
// List 1: 1,3,4,5,6,8,9
// List 2: 1,5,8,9,2

// Union: 1,3,4,5,6,8,9,2
// Intersection: 1,5,8,9
// Except: 1,3,5,9,8,2

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,3,4,5,6,8,9));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1,5,8,9,2));
        List<Integer> intersection = new ArrayList<>();
        List<Integer> union = new ArrayList<>();
        List<Integer> except = new ArrayList<>();
        //intersection
        System.out.print("INTERSECTION !");
        for(int i=0;i<l1.size();i++){
            for(int j=0;j<l2.size();j++){
                if(l1.get(i)==l2.get(j) && !intersection.contains(l2.get(j))){
                    intersection.add(l1.get(i));
                }
            }
        }
        //union
        System.out.println("UNION !");
       for(int i=0;i<l1.size();i++){
           if(!union.contains(l1.get(i))) union.add(l1.get(i));
       }
        for(int i=0;i<l2.size();i++){
           if(!union.contains(l2.get(i))) union.add(l2.get(i));
       }
        //except
        System.out.println("EXCEPT !");
        for(int i=0;i<l1.size();i++){
           if(l1.get(i)%2!=0) except.add(l1.get(i));
       }
        for(int i=0;i<l2.size();i++){
           if(l2.get(i)%2==0) except.add(l2.get(i));
       }
        System.out.print(intersection);
        System.out.print(union);
        System.out.print(except);
    }
}
