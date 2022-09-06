import java.util.HashSet;
public class UnionOfTwoArray____ReturnsizeofUnionArray {
     static int unionofTwoArray(int []a,int m,int[] b,int n){
         HashSet<Integer> set=new HashSet<>();
         for(int i:a){//each loop
             set.add(i);}
         for(int i:b){
             set.add(i);
         }
         return set.size();
     }
}
