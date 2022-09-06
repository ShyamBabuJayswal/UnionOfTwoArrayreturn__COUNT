import java.util.HashSet;
public class SecondSolution {
    public static int Solutionofgfg(int [] a,int m,int[] b,int n){
    HashSet<Integer> set1=new HashSet<>();
    HashSet<Integer> set2=new HashSet<>();
    for(int i: a){
        set1.add(i);
    }
    for(int i:b){
        set2.add(i);
    }
    set1.addAll(set2);
    int x= set1.size();
    return x;
}
}
