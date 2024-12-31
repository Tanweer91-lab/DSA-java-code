import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> ans=triangle.get(3);
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
        // write code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numRows;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    ans.get(i).add(j,1);
                }else {
                    int ele = ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1);
                    ans.get(i).add(j, ele);
                }
            }
        }
        return ans;
    }
}
