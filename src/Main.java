import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] ele = {2,1,3,4,5};
        int []ans = obj.topKFrequent(ele,3);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}