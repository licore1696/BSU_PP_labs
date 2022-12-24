import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("n =  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("m =  ");
        int m = sc.nextInt();
        int[][] matrix=new int[n][m];
        Random random = new Random();
        HashMap<Integer, Integer> povt = new HashMap<>();
        int[] a=new int [n*m];int q=0;a[0]=-115511;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]= random.nextInt();
               if(povt.containsKey(matrix[i][j])){ povt.put(matrix[i][j],1);}
               else{a[q]=matrix[i][j];q++;}
            }
        }
        if(n==0&&a[0]==-115511) {
            System.out.println("No sequences");
        }
        else{
            System.out.println(maxx.ma(a,q));
        }
    }

}
class maxx{
    public static int ma(int[] a,int n){
        int maximum=a[n-1];
        for(int i=0;i<n;i++)
        {
            if(maximum<a[i]){maximum=a[i];}
        }

        return maximum;
    }
}